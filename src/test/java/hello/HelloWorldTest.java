package hello;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        //given
        HelloWorld helloWorld = new HelloWorld();
        //when
        String stringToTest = helloWorld.getGreeting();
        //then
        Assert.assertEquals("Hello World!", stringToTest);
    }

}