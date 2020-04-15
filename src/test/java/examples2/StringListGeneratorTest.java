package examples2;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;

public class StringListGeneratorTest {

    private StringListGenerator stringListGenerator;

    @Before
    public void executeBeforeEach() {
        System.out.println("Vykdom pries kiekviena metoda");
        stringListGenerator = new StringListGenerator();
    }

    @Test
    public void testArrayGenerator() {
        List<String> expectedArray = Arrays.asList("Chair", "Table", "Window");
        assertEquals("Masyvai turi buti lygus", expectedArray, stringListGenerator.generateStringList());
    }

    @Test
    public void testArraySize() {
        assert 3 == stringListGenerator.generateStringList().size();
    }

    @Test
    public void testArrayHasValue() {
        List<String> generatedArray = stringListGenerator.generateStringList();
        assertThat(generatedArray.get(0), is("Chair"));
    }

    @Test
    public void testArrayItemOrder() {
        assertThat(stringListGenerator.generateStringList(), contains("Chair", "Table", "Window"));
    }

    @Test
    public void testContainsItemsInAnyOrder() {
        assertThat(stringListGenerator.generateStringList(), containsInAnyOrder("Window", "Chair", "Table"));
    }

}