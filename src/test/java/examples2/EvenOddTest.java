package examples2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddTest {

    @Test
    public void testEvenOddNumber() {
        EvenOdd evenOdd = new EvenOdd();
        assertEquals("10 yra lyginis skaicius", true, evenOdd.isEvenNumber(10));
    }

}