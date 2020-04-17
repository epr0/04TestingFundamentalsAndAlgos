package examples2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest3 {

    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][] {
                {1, 1, 2},
                {2, 4, 6},
                {1, 6, 7},
                {4, 1, 5}
        });
    }

    @Parameterized.Parameter(0)
    public int argument1;
    @Parameterized.Parameter(1)
    public int argument2;
    @Parameterized.Parameter(2)
    public int expectedResult;

    @Test
    public void testAction() {
        Calc calc = new Calc();
        Assert.assertEquals(expectedResult, calc.add(argument1, argument2));
    }

}

class Calc {
    public int add(int a, int b) {
        return a+b;
    }
}
