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
      String inputString = scanner.nextLine();
      System.out.println(inputString);
   }
}