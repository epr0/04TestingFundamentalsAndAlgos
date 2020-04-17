package examples2;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class ObjectListGeneratorTest {

    ObjectListGenerator objectListGenerator = new ObjectListGenerator();
    List<Fruit> basketOfFruits = objectListGenerator.generateFruitBasket();

    @Test
    public void testBasketSize() {
        assertThat(basketOfFruits.size(), is(3));
    }

    @Test
    public void testIfFruitIsInTheBasket() {
        assertEquals(basketOfFruits.get(1).name, "Apple");
    }

    @Test
    public void testIfQuantityOfBananasIsNotEqualToOranges() {
        assertNotEquals(basketOfFruits.get(0).quantity, is(basketOfFruits.get(2).quantity));
    }

}