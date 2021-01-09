package examplesintro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testArKuroUztenka() {
        //given
        Car car = new Car();

        //when
        car.vaziuoti(120);

        //then
        assertTrue(car.kuroLikutis < 6);
    }

    @Test
    void testTepaloEikvojimas() {
        Car car = new Car();

        assertTrue(car.tepaloKiekis == 3);
        int pradinisTepaloKiekis = car.tepaloKiekis;

        car.eikvotiTepala(20000);
        int pakitesTepaloKiekis = pradinisTepaloKiekis - 1;
        assertEquals(pakitesTepaloKiekis, car.tepaloKiekis);


    }

    @Test
    void gautiLanguSkyscioKieki() {
        Car car = new Car();
        int pradinisLanguSkyscioLikutis = car.languSkystis;

        car.gautiLanguSkyscioKieki(31);

        assertTrue(pradinisLanguSkyscioLikutis > car.languSkystis);

        car.gautiLanguSkyscioKieki(31);

        assertEquals(0, car.languSkystis);
    }
}