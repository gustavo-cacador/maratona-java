package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Gustavo");
        lista.add("Gustavo");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Cliente("Gustavo"));

        for (String o : lista) {
            System.out.println(o);
        }

    }

    private static void add(List lista, Cliente cliente) {
        lista.add(cliente);
    }
}
