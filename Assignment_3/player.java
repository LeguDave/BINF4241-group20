import java.util.Scanner;
import java.util.ArrayList;
import java.util.Observer;
import java.util.Observable;

public class player extends Observable
{

   boolean white;
   ArrayList<piece> pieces = new ArrayList<>();
   ArrayList<piece> graveyard = new ArrayList<>();
   score score_observer=new score();

   //constructor
	public player(boolean col) 
	{ 
		this.white=col;
      addObserver(score_observer);
	}
   
   public void update_score(ArrayList<piece> graveyard){
      this.graveyard=graveyard;
      setChanged();
      notifyObservers(graveyard);
   }
   
   
   public void move(gameboard gameboard, player enemy, player turn_player){
      reset_passant(gameboard);
      while(true){
         System.out.println("Enter coordinates for your move: ");
         Scanner scanner = new Scanner(System.in);
         String i3 = scanner.nextLine();
         
         //cathch short castling input
         if (i3.equals("0-0")){
            //player black
            if(enemy.white){
               if(gameboard.get_square("e8").occupied && gameboard.get_square("h8").occupied){
                  if(gameboard.get_piece("e8").rank.equals("K") && gameboard.get_piece("h8").rank.equals("T")){
                     piece king=gameboard.get_piece("e8");
                     piece tower=gameboard.get_piece("h8");
                     if(king.moved==false && tower.moved==false){
                        if(gameboard.get_square("f8").occupied==false && gameboard.get_square("g8").occupied==false){
                           gameboard.free_square("e8");
                           gameboard.free_square("h8");
                           gameboard.occupy_square("g8",king);
                           gameboard.occupy_square("f8",tower);
                           king.position="g8";
                           king.position="f8";
                           if(check(gameboard)){
                                System.out.println("Check");
                           }
                           tower.moved=true;
                           king.moved=true;
                           break;
                        }
                     }
                  }
               }
               System.out.println("Castling not possible");
               continue;
            }

            
            //player white
            else{
               if(gameboard.get_square("e1").occupied && gameboard.get_square("h1").occupied){
                  if(gameboard.get_piece("e1").rank.equals("K") && gameboard.get_piece("h1").rank.equals("T")){
                     piece king=gameboard.get_piece("e1");
                     piece tower=gameboard.get_piece("h1");
                     if(king.moved==false && tower.moved==false){
                        if(gameboard.get_square("f1").occupied==false && gameboard.get_square("g1").occupied==false){
                           gameboard.free_square("e1");
                           gameboard.free_square("h1");
                           gameboard.occupy_square("g1",king);
                           gameboard.occupy_square("f1",tower);
                           king.position="g1";
                           king.position="f1";
                           if(check(gameboard)){
                                System.out.println("Check");
                           }
                           tower.moved=true;
                           king.moved=true;
                           break;
                        }
                     }
                  }
               }
               System.out.println("Castling not possible");
               continue;
            }
         }
         //catch long castling
         if(i3.equals("0-0-0")){
            //player black
            if(enemy.white){
               if(gameboard.get_square("e8").occupied && gameboard.get_square("a8").occupied){
                  if(gameboard.get_piece("e8").rank.equals("K") && gameboard.get_piece("a8").rank.equals("T")){
                     piece king=gameboard.get_piece("e8");
                     piece tower=gameboard.get_piece("a8");
                     if(king.moved==false && tower.moved==false){
                        if(gameboard.get_square("b8").occupied==false && gameboard.get_square("c8").occupied==false && gameboard.get_square("d8").occupied==false ){
                           gameboard.free_square("e8");
                           gameboard.free_square("a8");
                           gameboard.occupy_square("c8",king);
                           gameboard.occupy_square("d8",tower);
                           king.position="c8";
                           king.position="d8";
                           if(check(gameboard)){
                                System.out.println("Check");
                           }
                           tower.moved=true;
                           king.moved=true;
                           break;
                        }
                     }
                  }
               }
               System.out.println("Castling not possible");
               continue;            
            }
            //player white
            else{
               if(gameboard.get_square("e1").occupied && gameboard.get_square("a1").occupied){
                  if(gameboard.get_piece("e1").rank.equals("K") && gameboard.get_piece("a1").rank.equals("T")){
                     piece king=gameboard.get_piece("e1");
                     piece tower=gameboard.get_piece("a1");
                     if(king.moved==false && tower.moved==false){
                        if(gameboard.get_square("b1").occupied==false && gameboard.get_square("c1").occupied==false && gameboard.get_square("d1").occupied==false ){
                           gameboard.free_square("e1");
                           gameboard.free_square("a1");
                           gameboard.occupy_square("c1",king);
                           gameboard.occupy_square("d1",tower);
                           king.position="c1";
                           king.position="d1";
                           if(check(gameboard)){
                                System.out.println("Check");
                           }
                           tower.moved=true;
                           king.moved=true;
                           break;
                        }
                     }
                  }
               }
               System.out.println("Castling not possible");
               continue;

            }
         }
         //if input has not lenght 4 and is no castling, input is invalid
         if(i3.length()!=4){
            System.out.println("Invalid coordinates");
            continue;
         }
         //from:    
         String i1 = i3.substring(0, 2);
         //to:
         String i2 = i3.substring(2, 4);
         //check if player may touch piece
         if(gameboard.is_valid_piece(i1, this.white)){
             //check if move itself is legal
             if(gameboard.get_piece(i1).is_legal(gameboard, i2)){
                 piece move_this=gameboard.get_piece(i1);
                 //free square under piece
                 gameboard.free_square(i1);
                 //kill?
                 if(gameboard.get_square(i2).occupied==true){
                     gameboard.kill(i2, enemy, false);
                     enemy.update_score(enemy.graveyard);
                 }
                 //en_passant kill?
                 else if(gameboard.get_square(i2).occupied==false  && move_this.passant_killer==true){
                     String target;
                     if(move_this.white){
                        target=gameboard.down(i2);
                     }
                     else{
                        target=gameboard.up(i2);
                     }
                     gameboard.kill(target, enemy, false);
                     enemy.update_score(enemy.graveyard);
                 }
                 //move piece
                 gameboard.occupy_square(i2,move_this);
                 move_this.position=i2;
                 //check for promotion
                 if(move_this.rank.equals("P") && gameboard.promotion_valid(move_this)){
                     //kill pawn
                     String c=move_this.position;
                     gameboard.kill(c, turn_player, true);
                     enemy.update_score(enemy.graveyard);                   
                     //create queen in i2
                     piece queen = new queen(c,turn_player.white);
                     //occupy square with queen
                     gameboard.occupy_square(c,queen);
                     //add queen to list of pieces
                     turn_player.pieces.add(queen);
                     System.out.println("Your Pawn has been promoted to Queen");
                 }
                 //check for check
                 if(check(gameboard)){
                     System.out.println("Check!");
                 }
                 move_this.moved=true;
                 break;
             }
             else{
                System.out.println("Illegal move! Please try again.");
             }
         }
         else{
            System.out.println("Your chosen figure does not exist there! Please try again.");
         }
      }
   }
   //here an Iterator class is used to iterate through all your own pieces to check check
   public Iterator createIterator(){
      return new PieceIterator(pieces);
   }

   public boolean check(gameboard gameboard){
      Iterator pieceiterator = createIterator();
      return check2(pieceiterator,gameboard);
	}
	private boolean check2(Iterator iterator, gameboard gameboard){
	   boolean check = false;
	   while(iterator.hasNext()){
	      piece piece = (piece)iterator.next();
         if(piece.check(gameboard)){
            check = true;
         }
      }
	   return check;
   }

   
   //denies all own pawns the possibility to give other enemy pawns the right to kill a pawn by en_passant
   public void reset_passant(gameboard gameboard){
      for (int i = 0; i < this.pieces.size(); i++) {
         if(this.pieces.get(i).rank.equals("P")){
            this.pieces.get(i).en_passant=false;
            this.pieces.get(i).passant_killer=false;
         }		
      }
   }
   
}