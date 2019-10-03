import java.util.ArrayList;
import java.util.Scanner;

public class game
{
	int squares;
	gameboard gameboard;
   ArrayList<player> players = new ArrayList<player>();


	public game(int squares) 
	{ 
		this.squares = squares;
		this.gameboard=new gameboard(squares);
	}
   
   public void add_player(String name)
   {
     this.players.add(new player(name));
   }
   
   public void take_turn(player player)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println(player.name + " it's your turn! Press enter to move.");
      String line = scanner.nextLine();
      System.out.println(player.move(die.roll(), this.gameboard));    
   }
   
   public void run_game()
   {
      if(this.players.size()==0)
      {
         System.out.println("You haven't added any players yet! \n");
         return;
      }
      
      int i=0;
      while(i<200)
      {
         take_turn(this.players.get(i % this.players.size()));
         if(this.gameboard.field[this.squares-1].occupied==true)
         {
            System.out.println("GAME OVER \n"+this.players.get(i % this.players.size()).name+" has won the game\n");
            return;
         }
         i+=1;       
      }
      
   }
   
}