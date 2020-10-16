public class Apple extends Fruit{
    private int weight = 1;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeightOfApple() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                "}";
    }
}
