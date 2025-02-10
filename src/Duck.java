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
        return String.format("Duck name: %s, height: %scm, weight: %skg, wingspan: %scm %n", name, getHeight(), getWeight(), getWingspan());
    }

    @Override
    public void swim() {
        System.out.println(name + " floating on water surface!");
    }

    @Override
    public void fly() {
        System.out.println(name + " flying by flapping wings!");
    }
}
