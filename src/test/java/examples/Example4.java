package examples;

import java.util.Random;

import org.junit.Test;

public class Example4 {

    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingBy0() {
        // given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();
        // when
        calculator.divide(number, 0);
        // then
        // should throw exception
    }

}
