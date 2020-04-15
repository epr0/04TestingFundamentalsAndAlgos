package examples;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

/*
Every time the above test method is executed,
a temporary folder is created and
it gets deleted after the execution of the method.
This is an example of an out-of-box rule
provided by Junit.
Similar behaviour can also be achieved
by creating our own rules. Junit provides
the TestRule interface, which can be implemented
to create our own Junit Rule.
 */

public class RuleExample {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testRule() throws IOException {
        File newFolder = temporaryFolder.newFolder("Tmp");
        Assert.assertTrue(newFolder.exists());
    }
}
