import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
 
@RunWith(Suite.class)
@SuiteClasses({dieTest.class, 
               end_squareTest.class,
               gameTest.class,
               gameboardTest.class,
               ladder_squareTest.class,
               normal_squareTest.class,
               playerTest.class,
               snake_squareTest.class,
               squareTest.class,
               start_squareTest.class,
               })
/** This is the test suite, which runs all test wen compiled and runned**/
public class SnakesAndLaddersTestRunner {
 
}