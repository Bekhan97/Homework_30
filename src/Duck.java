public class Duck implements Flyable{
    private final String name;

    public Duck(String name) {
        this.name = name;
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
