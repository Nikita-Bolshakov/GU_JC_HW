package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> box = new ArrayList<>();

    public float getWeight() {

        float weight = 0.0f;

        for (T fruit : box) {
            weight += fruit.getWeight();
        }

        return weight;

    }

    public boolean compare(Box anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void isPourItOver(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int sum) {
        for (int i = 0; i < sum; i++) {
            box.add(fruit);
        }
    }

}