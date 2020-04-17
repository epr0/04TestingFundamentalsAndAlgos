package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals("Two numbers should be added", expected, actual);
    }

    @Test
    public void testCalculateCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals("Should return right circle area",314.1592653589793, mathUtils.calculateCircleArea(10), 0.01);
    }
}
