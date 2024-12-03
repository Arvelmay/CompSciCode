
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class IntervalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class IntervalTest
{

    static Interval i1 = new Interval();
    static Interval i2 = new Interval(3,9);
    static Interval i3 = new Interval(3.3, 7);
    static Interval i4 = new Interval(i2);
    static Interval i5 = new Interval(9,3);
    static Interval i6 = new Interval(10,11);
    public IntervalTest()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        
    }
    @Test
    public void correctDefault(){
        
        assertTrue(i1.getMin()==0 && i1.getMax()==1);
        }
    @Test
    public void containsTest1(){
        assertTrue(i6.contains(10.5));
        }
    @Test
    public void containsTest2(){
        assertTrue(!i1.contains(10.5));
        }
    @Test
    public void equalsTest1(){
        assertTrue(i2.equals(i4));
    }
    @Test
    public void equalsTest2(){
        assertTrue(i2.equals(i5));
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}