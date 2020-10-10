import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruitBox = new ArrayList<>();

    public Box() {
    }



    public void addToBox(T fruit) {
        fruitBox.add(fruit);
    }

    public int getWeight(int fruitWeight) {
        int fruitNumber = fruitBox.size();
        int weight = fruitWeight*fruitNumber;
        return weight;
    }

    public boolean compare(List<T> boxToCompare) {
        if (fruitBox.size() == boxToCompare.size()) return true;//Как-то нужно использовать weight из предыдущего метода!
        return false;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitBox=" + fruitBox +
                '}';
    }
}
