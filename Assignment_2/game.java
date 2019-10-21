public class game
{
   //this function runs the game until win condition is met
   public void run_game(){ 
      player b=new player(false);
      player w=new player(true); 
      gameboard gameboard= new gameboard(w,b);
      System.out.println("Instructions: ");
      System.out.println("Enter from/to coordinates in a single input e.g. a7a6 and hit enter");
      System.out.println("For Castling use 0-0 for a short one, 0-0-0 for a long one \n \n");
      gameboard.print();
      while (true){
         System.out.println("White it's your turn!");
         w.move(gameboard, b, w);
         gameboard.print();
         if(has_king(b)==false){
            System.out.println("Check mate!!");
            System.out.println("White player has won!"); 
            break;
         }
         System.out.println("Black it's your turn!");
         b.move(gameboard, w, b);
         gameboard.print();
         if(has_king(w)==false){
            System.out.println("Check mate!!");
            System.out.println("Black player has won"); 
            break;
         }
      }
   }
   //win condition
   public boolean has_king(player player){
      for(piece piece : player.pieces){
        if(piece instanceof king){
            return true;
        }
      }
      return false;
   }
}
