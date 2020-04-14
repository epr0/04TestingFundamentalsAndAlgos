package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class EuroTest {

    @Test
    public void testToString() {
        assertEquals("EUR 2.00", new Euro(2).toString());
        assertEquals("EUR 7.50", new Euro(7.50).toString());
    }

    @Test
    public void testEquality() {
        Euro sevenFifty = new Euro(7.5);
        Euro sevenFiftyTwo = new Euro(7.5);

        assertTrue(sevenFifty.equals(sevenFiftyTwo));
    }

    @Test
    public void testInequality() {
        Euro sevenEuros = new Euro(7);
        Euro threeEuros = new Euro(3);

        assertFalse(sevenEuros.equals(threeEuros));
    }

    @Test
    public void testSubtraction() {
        assertEquals(new Euro(1), new Euro(3).minus(new Euro(2)));
        assertEquals(new Euro(2), new Euro(5).minus(new Euro(3)));
    }

    @Test
    public void testNumweicSafety() {
        assertEquals(new Euro(0.61), new Euro(1.03).minus(new Euro(0.42)));
    }
//    https://speakerdeck.com/dbader/tdd-java-exercise?slide=2
}