package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        TimeByIdComparator timeByIdComparator = new TimeByIdComparator();

        List<Time> times = new ArrayList<>();
        times.add(new Time(5L, "Fluminense", 25));
        times.add(new Time(1L, "Flamengo", 3));
        times.add(new Time(3L, "Botafogo", 30));
        times.add(new Time(4L, "Vasco", 7));

        //Collections.sort(times);
        times.sort(timeByIdComparator);

        for(Time time : times) {
            System.out.println(time);
        }

        Time timeToSearch = new Time(5L, "Fluminense", 25);

        // Retorna o objeto escolhido acima e indica a posição por Id (5)
        System.out.println(Collections.binarySearch(times, timeToSearch, timeByIdComparator));
    }
}
