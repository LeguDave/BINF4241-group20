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
   
   public void move(){
      System.out.print("Enter the the position of your moving piece: ");
      Scanner scanner = new Scanner(System.in);
      String inputString1 = scanner.nextLine();
      System.out.print("Where do you want it to move? ");
      Scanner Sconner = new Scanner(System.in);
      String inputString2 = Sconner.nextLine();
   }
}