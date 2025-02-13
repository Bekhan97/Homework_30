//  Beckhan D. - 10.02.2025
//  Homework 30 - Task 01
//......................................................................................................................
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck(25, 3, 50, "Donald");
        Aircraft aircraft = new Aircraft("Airbus");
        Aerostat aerostat = new Aerostat("Aerostat");

        List<Flyable> list = List.of(
                duck,
                aircraft,
                aerostat
        );

        for (Flyable flyable : list) {
            flyable.fly();
        }

        System.out.println("-----------------");
        duck.swim();
        System.out.println(duck);
    }
}