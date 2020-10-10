public class Orange extends Fruit {
    private int weight = 2;

    public Orange(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                "}";
    }
}
