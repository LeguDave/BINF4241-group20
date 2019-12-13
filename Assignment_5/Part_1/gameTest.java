import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class gameTest {
   
   game test= new game(15);

    /** Tests if the game is initiated with proper values **/
   @Test public void initTest() {
      int squares=15;
      ArrayList<player> players = new ArrayList<player>(0);
            
      Assert.assertEquals("Invalid number of squares initiated", this.test.squares, squares);
      Assert.assertEquals("Invalid player list initiated", this.test.players, players);
   }
   /** Tests if the game is ends with proper values **/
   @Test public void endTest() {
      test.add_player("Player 1");
      //assert player has been added correctly
      Assert.assertEquals("Player not added correctly", this.test.players.get(0).name, "Player 1");
      
      //simplified run_game loop with take_turn() and move() function without user input
      int i=0;
      while(true)
      {
         
         player turn_player=this.test.players.get(i % this.test.players.size());
         turn_player.move(die.roll(), this.test.gameboard);
         
         if(this.test.gameboard.field[14].occupied==true)
         {
            //a player won the game
            Assert.assertEquals("Game ended without someone reaching the end", this.test.gameboard.field[14].occupied, true);
            break;
         }
         i+=1;       
      }

   }
}
