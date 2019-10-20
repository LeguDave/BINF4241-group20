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
   
   public void move(gameboard gameboard){
      while(true){
         System.out.print("Enter the the position of your moving piece: ");
         Scanner scanner = new Scanner(System.in);
         String i1 = scanner.nextLine();
         System.out.println(i1); //debug
         System.out.print("Where do you want it to move? ");
         Scanner Sconner = new Scanner(System.in);
         String i2 = Sconner.nextLine();
         if(gameboard.is_valid_piece(i1, this.white)){
             if(gameboard.get_piece(i1).is_legal(gameboard, i2)){
                 piece move_this=gameboard.get_piece(i1);
                 gameboard.free_square(i1);
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