package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {

        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
        fila.add("E");
        fila.add("D");

        while (!fila.isEmpty()) {
            System.out.println(fila.remove());
        }

        /*
        while (!fila.isEmpty()) {
            System.out.println(fila.pool());
        }
         */

    }
}
