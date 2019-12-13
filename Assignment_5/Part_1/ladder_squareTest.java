import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ladder_squareTest {
   
   ladder_square test = new ladder_square(0,1);

    /** Tests if the ladder square is initiated with proper values **/
   @Test public void initTest() {
      int position = 0;
		int steps_forward = 1;
		boolean occupied = false;
		String type="ladder_square";
            
      Assert.assertEquals("Invalid position initiated", this.test.position, position);
      Assert.assertEquals("Invalid occupied initiated", this.test.occupied, occupied);
      Assert.assertEquals("Invalid type initiated", this.test.type, type);
      Assert.assertEquals("Invalid type initiated", this.test.steps_forward, steps_forward);
   }
}
