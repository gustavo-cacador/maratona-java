package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // indices 0, 1, 2, 3
        // valores 2, 0, 4, 3

        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 0));
        System.out.println(Collections.binarySearch(numeros, -1));

    }
}
