public abstract class Bird {
    private int height;
    private int weight;
    private int wingspan;

    public Bird(int height, int weight, int wingspan) {
        this.height = height;
        this.weight = weight;
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "height=" + height +
                ", weight=" + weight +
                ", wingspan=" + wingspan +
                '}';
    }
}
