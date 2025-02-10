import java.util.List;

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Donald");
        Aircraft aircraft = new Aircraft("Airbus");
        Aerostat aerostat = new Aerostat("Aerostat");

        List<Flyable> list = List.of(
                duck1,
                aircraft,
                aerostat
        );

        for (Flyable flyable : list) {
            flyable.fly();
        }
    }
}