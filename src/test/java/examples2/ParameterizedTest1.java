package examples2;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTest1 {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE}) // six numbers
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        EvenOdd evenOdd = new EvenOdd();
        Assert.assertFalse("number should be odd",evenOdd.isEvenNumber(number));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Hello", "JUnit" })
    void withValueSource(String word) {
        Assert.assertNotNull(word);
    }
}
