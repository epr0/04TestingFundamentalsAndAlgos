package instagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstagramTest {

    Instagram instagram = new Instagram();

    @Test
    void createTimeAgoString() {
        assertEquals("5 minutes ago.", instagram.createTimeAgoString(5));
    }
}