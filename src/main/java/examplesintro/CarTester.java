package examplesintro;

public class CarTester {

    public static void main(String[] args) {
        CarTester carTester = new CarTester();

        carTester.testDegaluKiekis();
        carTester.testTepaloKiekis();
    }

    public void testDegaluKiekis() {
        Car car = new Car();
        car.kuroLikutis = 5;
        if (car.kuroLikutis < 10) {
            System.out.println("Geltona lempute. Ipilkite kuro");
        } else {
            System.out.println("Kuro yra uztektinai!");
        }
    }

    public void testTepaloKiekis() {
        Car car = new Car();
        if(car.tepaloKiekis < 1) {
            System.out.println("Tepalo lempute. Ipilkite tepalo");
        } else {
            System.out.println("Tepalo uztenka");
        }
    }

    //su langu skysciu

    //su baterija


}
