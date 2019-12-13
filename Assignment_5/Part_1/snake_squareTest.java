import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class snake_squareTest {
   
   snake_square test = new snake_square(0,1);


    /** Tests if the snake square is initiated with proper values **/
   @Test public void initTest() {
      int position = 0;
		int steps_back = 1;
		boolean occupied = false;
		String type="snake_square";
            
      Assert.assertEquals("Invalid position initiated", this.test.position, position);
      Assert.assertEquals("Invalid occupied initiated", this.test.occupied, occupied);
      Assert.assertEquals("Invalid type initiated", this.test.type, type);
      Assert.assertEquals("Invalid type initiated", this.test.steps_back, steps_back);
   }
}