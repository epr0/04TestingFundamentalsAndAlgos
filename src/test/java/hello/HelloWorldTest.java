package hello;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        //given
        HelloWorld helloWorld = new HelloWorld();
        //when
        String stringToTest = helloWorld.getGreeting();
        //then
        assertEquals("Hello World!", stringToTest);
    }

}