package examples2;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;

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