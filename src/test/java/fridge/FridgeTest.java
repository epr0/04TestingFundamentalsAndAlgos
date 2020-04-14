package fridge;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FridgeTest {

    @Test
    public void testFridge() {
        // given
        Fridge fridge = new Fridge();

        // when
        fridge.put("cheese");

        // then
        assertEquals(true, fridge.contains("cheese"));
        assertNotEquals(false, fridge.put("cheese"));
        assertEquals(true, fridge.contains("cheese"));

        assertEquals(false, fridge.contains("ham"));

        fridge.put("ham");
        assertEquals(true, fridge.contains("cheese"));
        assertEquals(true, fridge.contains("ham"));
    }

    @Test
    public void testNoSuchItemException() {
        // given
        Fridge fridge = new Fridge();

        try {
            fridge.take("sausage");
            fail("There was no sausage in the fridge!");
        } catch (NoSuchItemException e) {
            assertEquals("sausage not found in the fridge", e.getMessage());
        }
    }

    @Test
    public void testFridgeSize() {
        // given
        Fridge fridge = new Fridge();
        fridge.put("cheese");
        fridge.put("cheese");
        fridge.put("cheese");

        // when
        int result = fridge.getFridgeSize();

        // then
        assertEquals(3, result);
    }

    @Test
    public void testPutTake() throws NoSuchItemException {
        Fridge fridge = new Fridge();
        List<String> food = new ArrayList<String>();
        food.add("yogurt");
        food.add("milk");
        food.add("eggs");
        for (String item : food) {
            fridge.put(item);
            assertEquals(true, fridge.contains(item));
            fridge.take(item);
            assertEquals(false, fridge.contains(item));
        }

        for (String item : food) {
            try {
                fridge.take(item);
                fail("there was no " + item + " in the fridge");
            } catch (NoSuchItemException e) {
                assertEquals(true, e.getMessage().contains(item));
            }
        }
    }
}
