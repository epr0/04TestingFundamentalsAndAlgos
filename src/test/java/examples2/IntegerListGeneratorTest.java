package examples2;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.number.OrderingComparison.*;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;

public class IntegerListGeneratorTest {

    private static IntegerListGenerator integerListGenerator;
    List<Integer> expectedList = Arrays.asList(1,2,3,4,5);
    List<Integer> actualList = integerListGenerator.createSuperCoolIntegerList();

    @BeforeClass
    public static void createInstaceBeforeEveryMethod() {
        integerListGenerator = new IntegerListGenerator();
    }
    @Test
    public void testIfListContainsSpecificItems() {
        assertThat(integerListGenerator.createSuperCoolIntegerList(), is(expectedList));
    }

    @Test
    public void testIfSumOfListElementsIsCorrect() {
        assertThat("Suma turi buti lygi 15",integerListGenerator.getSumOfArrayElements(), is(15));
    }

    @Test
    public void testMultipleAssertions() {
        assertThat("Neteisingai issideste elementai", actualList, contains(1,2,3,4,5));
        assertThat("Masyvo dydis turi buti 5 ",actualList.size(), is(5));
        assertThat("Sarasas negali buti tuscias", actualList, not(IsEmptyCollection.empty()));
    }

    @Test
    public void testEveryItemLessThanTen() {
        assertThat(actualList, everyItem(lessThan(10)));
        assertThat(actualList, everyItem(greaterThanOrEqualTo(1)));
    }

}