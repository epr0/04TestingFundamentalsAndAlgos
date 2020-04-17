package examples;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/*
Test only for CALCULATOR and not ant other class in the there. So we need to isolate it and mock everything else.
 */
public class Example2 {

    //dummy object, needed to mock real service which is used by our function
    CalculatorService calculatorService = new CalculatorService() {
        @Override
        public int add(int x, int y) {
            return 0;
        }
    };

    //CalculatorService mockedService = Mockito.mock(CalculatorService.class);
    //Using rules
    @Mock
    CalculatorService mockedService;
    @Rule public MockitoRule rule = MockitoJUnit.rule();


    @Test
    public void test() {
        // given
        Calculator calculator = new Calculator();
        // when
        int result = calculator.add(5, 3);
        // then
        assert result == 8;
    }

    @Test
    public void testCalculateUsingService() {
        //given
        Calculator calculator = new Calculator(mockedService);
        //mocking the behaviour - when we pass specific arguments to the service, we expect the specific value to be returned
        when(mockedService.add(2,3)).thenReturn(5);
        //when
        int calculationResult = calculator.calculateUsingService(2,3);
        //then
        Assert.assertEquals(10, calculationResult);
        verify(mockedService).add(2,3); //verify if the mocked service was invoked.
    }

}
