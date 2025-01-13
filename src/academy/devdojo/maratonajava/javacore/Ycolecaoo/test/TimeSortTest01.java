package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

class TimeByIdComparator implements Comparator<Time> {

    @Override
    public int compare(Time time1, Time time2) {
        return time1.getId().compareTo(time2.getId());
    }
}

public class TimeSortTest01 {
    public static void main(String[] args) {
        
        List<Time> times = new ArrayList<>();
        times.add(new Time(5L, "Fluminense", 25));
        times.add(new Time(1L, "Flamengo", 3));
        times.add(new Time(3L, "Botafogo", 30));
        times.add(new Time(4L, "Vasco", 7));

        for(Time time : times) {
            System.out.println(time);
        }

        // Ordena por ordem alfabética (nome)
        Collections.sort(times);
        System.out.println("--------------");
        for(Time time : times) {
            System.out.println(time);
        }

        // Ordena por Id
        //Collections.sort(times, new TimeByIdComparator());
        times.sort(new TimeByIdComparator());
        System.out.println("--------------");
        for(Time time : times) {
            System.out.println(time);
        }
    }
}
