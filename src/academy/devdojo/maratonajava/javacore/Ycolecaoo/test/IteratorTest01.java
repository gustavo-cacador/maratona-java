package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Time> times = new ArrayList<>();
        times.add(new Time(5L, "Fluminense", 25, 0));
        times.add(new Time(1L, "Flamengo", 3, 2));
        times.add(new Time(3L, "Botafogo", 30, 3));
        times.add(new Time(4L, "Vasco", 7, 0));

        // Remover os times com quantidade igual a 0 utilizando Iterator.
        Iterator<Time> timeIterator = times.iterator();
        while(timeIterator.hasNext()) {
            if(timeIterator.next().getQuantidade() == 0) {
                timeIterator.remove();
            }
        }
        System.out.println(times);


        // Jeito mais simples para remover todos os times com quantidade igual a 0.
        times.removeIf(time -> time.getQuantidade() == 0);
        System.out.println(times);
    }
}
