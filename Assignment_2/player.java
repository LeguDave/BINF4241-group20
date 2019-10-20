import java.util.Scanner;
import java.util.ArrayList;


public class player
{

   boolean white;
   ArrayList<piece> pieces = new ArrayList<>();

   //constructor
	public player(boolean col) 
	{ 
		this.white=col;
	}
   
   public void move(gameboard gameboard, player enemy){
      while(true){
         System.out.print("Enter coordinates for your move: ");
         Scanner scanner = new Scanner(System.in);
         String i3 = scanner.nextLine();        
         String i1 = i3.substring(0, 2);
         String i2 = i3.substring(2, 4);
         if(gameboard.is_valid_piece(i1, this.white)){
             if(gameboard.get_piece(i1).is_legal(gameboard, i2)){
                 piece move_this=gameboard.get_piece(i1);
                 gameboard.free_square(i1);
                 //kill?
                 if(gameboard.get_square(i2).occupied==true){
                     gameboard.kill(i2, enemy);
                 }
                 gameboard.occupy_square(i2,move_this);
                 move_this.position=i2;
                 if(is_check(gameboard)){
                     System.out.println("Check");
                 }
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
   //iterate through all you own pieces to check if they can attack the enemy king in the given gameboard
   public boolean is_check(gameboard gameboard){
      boolean check=false;
      
      
      for (int i = 0; i < this.pieces.size(); i++) {
         if(this.pieces.get(i).check(gameboard)){
            check=true;
         }		
      }
      return check;
   }
   
   
   
}