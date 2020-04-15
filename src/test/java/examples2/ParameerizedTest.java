package examples2;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class ParameerizedTest {

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
