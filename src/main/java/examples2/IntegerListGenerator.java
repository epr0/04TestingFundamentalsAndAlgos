package examples2;

import java.util.Arrays;
import java.util.List;

public class IntegerListGenerator {

    public List<Integer> createSuperCoolIntegerList() {
        return Arrays.asList(1,2,3,4,5);
    }

    public int getSumOfArrayElements() {
        IntegerListGenerator integerListGenerator = new IntegerListGenerator();
        Integer sum = 0;
        for(Integer element : integerListGenerator.createSuperCoolIntegerList()) {
            sum += element;
        }

        return sum;
    }
}
