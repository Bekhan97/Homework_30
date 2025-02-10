public class Duck extends Bird implements Flyable{
    private final String name;

    public Duck(int height, int weight, int wingspan, String name) {
        super(height, weight, wingspan);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Duck{name='" + name + "'}";
    }

    @Override
    public void fly() {
        System.out.println(name + " is flapping wings!");
    }
}
