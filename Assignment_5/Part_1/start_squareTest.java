import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class start_squareTest {
   start_square test = new start_square();

    /** Tests if the start square is initiated with proper values **/
   @Test public void initTest() {
      int position = 1;
		boolean occupied = false;
		String type="start_square";
      Assert.assertEquals("Invalid position initiated", this.test.position, position);
      Assert.assertEquals("Invalid occupied initiated", this.test.occupied, occupied);
      Assert.assertEquals("Invalid type initiated", this.test.type, type);
   }
}

