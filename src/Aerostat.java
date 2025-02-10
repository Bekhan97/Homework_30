public class Aerostat implements Flyable{
    private final String name;

    public Aerostat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aerostat{name='" + name + "'}";
    }

    @Override
    public void fly() {
        System.out.println(name + " is floating in air!");
    }
}
