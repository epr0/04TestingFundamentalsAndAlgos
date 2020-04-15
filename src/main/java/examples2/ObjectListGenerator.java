package examples2;

import java.util.ArrayList;
import java.util.List;

public class ObjectListGenerator {

    public List<Fruit> generateFruitBasket() {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Banana", 5));
        fruits.add(new Fruit("Apple", 3));
        fruits.add(new Fruit("Orange", 4));

        return fruits;
    }
}

class Fruit {
    public String name;
    public int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
