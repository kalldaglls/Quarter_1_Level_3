import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {

    private List<T> fruitBox = new ArrayList<>();

    public Box() {
    }

    public Box(List<T> fruitBox) {
        this.fruitBox = fruitBox;
    }

    public void addToBox(T fruit) {
        fruitBox.add(fruit);
    }

    public int getWeight(int fruitWeight) {
        int fruitNumber = fruitBox.size();
        int weight = fruitWeight*fruitNumber;
        return weight;
    }

    public boolean compare(Box<T> boxToCompare, int weight) {
        if (fruitBox.size()*weight == boxToCompare.getFruitBox().size()*weight) return true;//Как-то нужно использовать weight из предыдущего метода!
        return false;
    }

    public void pourFruits (List<T> boxToPour) {
        boxToPour.addAll(fruitBox);
        fruitBox.removeAll(boxToPour);
    }

    public List<T> getFruitBox() {
        return fruitBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fruitBox=" + fruitBox +
                '}';
    }
}
