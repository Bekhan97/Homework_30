public abstract class Bird {
    private int height;
    private int weight;
    private int wingspan;

    public Bird(int height, int weight, int wingspan) {
        this.height = height;
        this.weight = weight;
        this.wingspan = wingspan;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "height=" + height +
                ", weight=" + weight +
                ", wingspan=" + wingspan +
                '}';
    }

    public abstract void swim();
}
