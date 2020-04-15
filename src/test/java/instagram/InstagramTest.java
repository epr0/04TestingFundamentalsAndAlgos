package instagram;

import org.junit.Assert;
import org.junit.Test;

public class InstagramTest {

    Instagram instagram = new Instagram();

    @Test
    public void createTimeAgoString() {
        Assert.assertEquals("5 minutes ago.", instagram.createTimeAgoString(5));
    }
}