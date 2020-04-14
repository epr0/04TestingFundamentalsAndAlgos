package examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class Example3 {

    @Test
    public void testAssertEquals() {
        assertEquals(64, 2 * 32);
        assertEquals("Values are not equal", 1, 2);
    }

    @Test
    public void testAssertTrueFalse() {
        assertTrue(3 == 3);
        assertFalse("Hello".equals("Not Hello"));
    }

    @Test
    public void testArrayEquals() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        assertArrayEquals(firstArray, secondArray);
    }

    @Test
    public void testAssertNull() {
        String s = null;
        assertNull(s);
    }

    @Test
    public void testAssertSame() {
        String s1 = "abc";
        String s2 = "abc";
        assertSame(s1, s2);
    }

}
