import java.util.Scanner;

public class player
{

   String colour;

   //constructor
	public player(String col) 
	{ 
		this.colour=col;
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