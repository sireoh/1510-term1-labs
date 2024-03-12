package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.HashSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * MathematicsTest.
 * 
 * @author BCIT
 * @version 1.0
 */
class TestThisTest {
    
    /**
     * The Mathematics object to test.
     */
    private TestThis testthis;
    
    /**
     * Creates a new TestThis object before each test is executed.
     * 
     * @throws Exception
     *             if a Mathematics object cannot be created.
     */
    @BeforeEach
    public void setUp() throws Exception {
        testthis = new TestThis();
    }
    
    /**
     * Test method for the value of testLargestIntIntInt1.
     */
    @Test
    public void testLargestIntIntInt1() {
        int x = testthis.largest(10, 30, 5);
        assertEquals(30, x);
    }
    
    /**
     * Test method for the value of testLargestIntIntInt2.
     */
    @Test
    public void testLargestIntIntInt2() {
        int x = testthis.largest(27, 0, 800);
        assertEquals(800, x);
    }
    
    /**
     * Test method for the value of testLargestIntIntInt3.
     */
    @Test
    public void testLargestIntIntInt3() {
        int x = testthis.largest(4, 900, 6);
        assertEquals(900, x);
    }
    
    @Test
    public void testLargestListOfInteger1() {
        TestThis testThis = new TestThis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-27);
        list.add(0);
        list.add(800);
        int largest = testThis.largest(list);
        assertEquals(800, largest);
    }
    
    @Test
    public void testLargestListOfInteger2() {
        TestThis testThis = new TestThis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6); // Adding a duplicate
        int largest = testThis.largest(list);
        assertEquals(6, largest);
    }
    
    @Test
    public void testLargestListOfInteger3() {
        TestThis testThis = new TestThis();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(9);
        int largest = testThis.largest(list);
        assertEquals(9, largest);
    }

}
