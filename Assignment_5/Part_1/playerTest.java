import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class playerTest {

   player player_1 = new player("Player 1");
   player player_2 = new player("Player 2");
   fixed_gameboard test_gameboard = new fixed_gameboard();

    /** Tests if the player is initiated with proper values **/
   @Test public void initTest() {
      int position = 1;
		String name="Player 1";     
      Assert.assertEquals("Invalid position initiated", this.player_1.position, position);
      Assert.assertEquals("Invalid Name initiated", this.player_1.name, name);
   }
   
    /** Tests if the player moves correctly on fixed gameboard**/
   @Test public void moveTest() {
      System.out.println(this.test_gameboard.field);
      //move player_2 2 steps forward
      this.player_2.move_fixed(2,this.test_gameboard);
      Assert.assertEquals("Normal movement: Invalid player position", this.player_2.position, 3);
      Assert.assertEquals("Normal movement: Square not occupied correctly", this.test_gameboard.field[2].occupied, true);
      //move player_2 onto snake and back to same square
      this.player_2.move_fixed(2,this.test_gameboard);
      Assert.assertEquals("Snake movement: Invalid player position", this.player_2.position, 3);
      Assert.assertEquals("Snake movement: Square not occupied correctly", this.test_gameboard.field[2].occupied, true);
      Assert.assertEquals("Snake movement: Square not unoccupied correctly", this.test_gameboard.field[4].occupied, false);      
      //move player_1 on top of player 2 and back to beginning
      this.player_1.move_fixed(2,this.test_gameboard);
      Assert.assertEquals("On top of player movement: Invalid player position", this.player_1.position, 1);
      //move player_1 on snake, then on player and then back to beginning (large chain of events)
      this.player_1.move_fixed(4,this.test_gameboard);
      Assert.assertEquals("Chain of movements: Invalid player position", this.player_1.position, 1);
      //move player_2 too far over end and has to go back to same square
      this.player_2.move_fixed(6,this.test_gameboard);
      Assert.assertEquals("Over the end movement: Invalid player position", this.player_2.position, 3);
      Assert.assertEquals("Over the end movement: Square not occupied correctly", this.test_gameboard.field[2].occupied, true);
      //move player_2 too far over end and has to go back to a snake and the back even further to same square
      this.player_2.move_fixed(4,this.test_gameboard);
      Assert.assertEquals("Over the end chained movement: Invalid player position", this.player_2.position, 3);
      Assert.assertEquals("Over the end chained movement: Square not occupied correctly", this.test_gameboard.field[2].occupied, true);
      //move player_1 on ladder
      this.player_1.move_fixed(1,this.test_gameboard);
      Assert.assertEquals("Ladder movement: Invalid player position", this.player_1.position, 4);
      Assert.assertEquals("Ladder movement: Square not occupied correctly", this.test_gameboard.field[3].occupied, true);
      //move player_1 to end square
      this.player_1.move_fixed(2,this.test_gameboard);
      Assert.assertEquals("Endsquare movement: Invalid player position", this.player_1.position, 6);
      Assert.assertEquals("Endsquare movement: Square not occupied correctly", this.test_gameboard.field[5].occupied, true);
      Assert.assertEquals("Endsquare movement: Square not unoccupied correctly", this.test_gameboard.field[3].occupied, false);
      
   }
   
   
}
