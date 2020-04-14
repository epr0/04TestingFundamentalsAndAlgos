package fridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

    private List<String> food = new ArrayList<>();

    public boolean put(String item) {
        return food.add(item);
    }

    public boolean contains(String item) {
        return food.contains(item);
    }

    public void take(String item) throws NoSuchItemException {
        boolean result = food.remove(item);
        if (!result) {
            throw new NoSuchItemException(item + " not found in the fridge");
        }
    }

    public int getFridgeSize() {
        return food.size();
    }
}