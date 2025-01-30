

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestMagicSquare.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestMagicSquare
{
    static int[][] testCase1 =new int[][]{{1}};
    static int[][] testCase2 = new int[][]{{2,7,6},{9,5,1},{4,3,8}};
    static int[][] testCase3 = new int[][]{{6,3,10,15},{9,16,5,4},{7,2,11,14},{12,13,8,1}};
        
    static int[][] testCase4 = new int[][]{{1,2},{3,0}};
    static int[][] testCase5 = new int[][]{{1,2,3},{6,0,0},{1,6,5}};
    static int[][] testCase6 = new int[][]{{1,3,5},{4,4,1}};
    /**
     * Default constructor for test class TestMagicSquare
     */
    public TestMagicSquare()
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
    public void test1(){
    assertTrue(MagicSquare.isMagic(testCase1));}
    @Test
    public void test2(){
    assertTrue(MagicSquare.isMagic(testCase2));}
    @Test
    public void test3(){
    assertTrue(MagicSquare.isMagic(testCase3));}
    @Test
    public void test4(){
    assertFalse(MagicSquare.isMagic(testCase4));}
    @Test
    public void test5(){
    assertFalse(MagicSquare.isMagic(testCase5));}
    @Test
    public void test6(){
    assertFalse(MagicSquare.isMagic(testCase6));}
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
