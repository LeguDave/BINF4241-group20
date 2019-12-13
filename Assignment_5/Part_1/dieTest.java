import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class dieTest {

   die test_die = new die();

   /** This test checks, if the die always rolls between 1 and 6 100 times**/
   @Test public void rollTest() {
   
      int high = 6;
      int low = 1;
      
      for(int i=0; i<100; i++){
         int roll=this.test_die.roll();
         assertTrue("Error, die result is too high", high >= roll);
         assertTrue("Error, die result is too low",  low  <= roll);
      }
   }
   
}
