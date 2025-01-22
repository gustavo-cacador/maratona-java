package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Time> times = new PriorityQueue<>(new TimePrecoComparator().reversed());
        times.add(new Time(5L, "Fluminense", 25, 0));
        times.add(new Time(1L, "Flamengo", 3, 2));
        times.add(new Time(3L, "Botafogo", 30, 3));
        times.add(new Time(4L, "Vasco", 7, 0));
        times.add(new Time(4L, "Maricá", 8, 0));

        while (!times.isEmpty()) {
            System.out.println(times.poll());
        }
    }
}
