import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class squareTest {

   square test = new square();

   /** Tests if the square is initiated with proper values **/
   @Test public void initTest() {
   
      int position=0;
      boolean occupied=false;
      String type=null;
      
      Assert.assertEquals("Invalid position initiated", this.test.position, position);
      Assert.assertEquals("Invalid occupied initiated", this.test.occupied, occupied);
      Assert.assertEquals("Invalid type initiated", this.test.type, type);
   }
}
