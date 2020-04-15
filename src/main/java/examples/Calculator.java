package examples;

public class Calculator {

    CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public Calculator() {

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    //my implementation is dependant on other implementation (web service for example) service
    //so if i would want to test it, i would have to implement the service
    public int calculateUsingService(int x, int y) { // 2, 3 -> (x + y) * x
        return calculatorService.add(x, y)*x;
        //return (x+y)*x; //without a service for verify()
    }

}
