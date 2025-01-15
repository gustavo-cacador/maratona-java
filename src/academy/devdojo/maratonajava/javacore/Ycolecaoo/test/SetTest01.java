package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        // o Set não permite elementos duplicados
        Set<Time> times = new LinkedHashSet<>(); // O LinkedHashSet mantém a ordem em que criamos os objetos (id: 5, 1, 3, 4)
        times.add(new Time(5L, "Fluminense", 25, 0));
        times.add(new Time(1L, "Flamengo", 3, 2));
        times.add(new Time(3L, "Botafogo", 30, 3));
        times.add(new Time(4L, "Vasco", 7, 0));
        times.add(new Time(4L, "Vasco", 7, 0));

        for(Time time: times) {
            System.out.println(time);
        }
    }
}
