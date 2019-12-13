public class main
{
   public static void main(String[] args)
	{
   
      //creates your gameboard with at least 2 fields
      game testgame = new game(15);
      
      //adds players
      testgame.add_player("Player 1");
      testgame.add_player("Player 2");
      
      
      
      // HERE you can add new players
      
      
      
      //starts the game
      testgame.run_game();
	}

}

