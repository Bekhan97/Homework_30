public class Aircraft implements Flyable{
    private final String name;

    public Aircraft(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aircraft{name='" + name + "'}";
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying with jet engines!");
    }
}
