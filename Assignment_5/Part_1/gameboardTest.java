import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class gameboardTest {

   gameboard test = new gameboard(15);

   /** Tests if Gameboard is of correct size. **/
   @Test public void sizeTest() {
      Assert.assertEquals("Gameboard is not of the correct size", this.test.field.length, 15);
   }
   
   /** Tests if Gameboard has correct square placement and ladder/snakes are initiated with doable steps forward/back. **/
   @Test public void squarePlacementTest() {
      Assert.assertEquals("Start square not in the beginning", this.test.field[0].type, "start_square");
      Assert.assertEquals("End square not in the end", this.test.field[this.test.field.length-1].type, "end_square");
      int i=1;
      while(i<this.test.field.length-1){
         assertTrue("In between start and end were start or end squares found",(this.test.field[i].type != "start_square") || (this.test.field[i].type != "end_square"));
         if(this.test.field[i].type.equals("ladder_square")){
            ladder_square ladder=(ladder_square)this.test.field[i];
            assertTrue("Ladder would transport player out of bounds",(ladder.steps_forward+i<this.test.field.length));
         }
         if(this.test.field[i].type.equals("snake_square")){
            snake_square snake=(snake_square)this.test.field[i];
            assertTrue("Snake would transport player out of bounds",(((snake.steps_back)*(-1)+i)>0));
         }
         i=i+1;
      }
   }
   
   
}
