package examples;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example5 {

    @Test
    public void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = (int) calculator.add(5, 9);

        // then
        assertEquals(result, 14);
    }

    @Test
    public void testDivision() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(4, 2);

        // then
        assertEquals(result, 2);
    }

    @Test
    public void testMultiplication() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(2, 5);

        // then
        assertEquals(result, 10);
    }

    @Test
    public void testSubtraction() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 3);

        // then
        assertEquals(result, 2);
    }
}
