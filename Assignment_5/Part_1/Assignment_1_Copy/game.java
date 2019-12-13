import java.util.ArrayList;
import java.util.Scanner;

public class game
{
	int squares;
	gameboard gameboard;
   ArrayList<player> players = new ArrayList<player>();

   //constructor of the class game
	public game(int squares) 
	{ 
		this.squares = squares;
		this.gameboard=new gameboard(squares);
	}
   
   //function to add players
   public void add_player(String name)
   {
     this.players.add(new player(name));
   }
   
   //function that lets the player press the enter button to make his/her turn
   public void take_turn(player player)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println(player.name + " it's your turn! Press enter to move.");
      String line = scanner.nextLine();
      System.out.println("You start your turn on square "+player.position +"\n");
      player.move(die.roll(), this.gameboard);    
      System.out.println("You end your turn on square "+player.position +"\n");

   }
   
   //this function starts the game and demands the players to make their turn; after 200 turns the game will be shut down
   public void run_game()
   {
      //check if there are any players
      if(this.players.size()==0)
      {
         System.out.println("You haven't added any players yet! \n");
         return;
      }
      
      int i=0;
      while(i<200) //loop turns of the players to a maximum of 200 turns
      {
         take_turn(this.players.get(i % this.players.size()));
         if(this.gameboard.field[this.squares-1].occupied==true)
         {
            System.out.println("GAME OVER \n"+this.players.get(i % this.players.size()).name+" has won the game\n");
            return;
         }
         i+=1;       
      }
      System.out.println("Your game took more than 200 turns. The game will be shut down.");
   }
   
}