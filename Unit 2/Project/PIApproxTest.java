

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * The test class PiApprox.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PIApproxTest
{
    /**
     * Default constructor for test class PiApprox
     */
    public PIApproxTest()
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
    public void PI1(){
        double testedOutput =4.0 ;
        assertTrue(Math.abs(PIApprox.gottPI(1)-testedOutput)<0.01);
    }
    @Test
    public void PI2(){
        double testedOutput =2.66666667 ;
        assertTrue(Math.abs(PIApprox.gottPI(2)-testedOutput)<0.01);
    }
    @Test
    public void PI3(){
        double testedOutput =3.466666667 ;
        assertTrue(Math.abs(PIApprox.gottPI(3)-testedOutput)<0.01);
    }
    @Test
    public void PI4(){
        double testedOutput = 2.895238095;
        assertTrue(Math.abs(PIApprox.gottPI(4)-testedOutput)<0.01);
    }
    @Test
    public void PI100(){
        double testedOutput = 3.1315929035;
        assertTrue(Math.abs(PIApprox.gottPI(100)-testedOutput)<0.01);
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
