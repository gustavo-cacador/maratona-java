package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

public class ListSortTest01 {
    public static void main(String[] args) {
        
        List<String> times = new ArrayList<>();
        times.add("Fluminense");
        times.add("Flamengo");
        times.add("Botafogo");
        times.add("Vasco");

        Collections.sort(times);
        
        for(String time : times) {
            System.out.println(time);
        }

        System.out.println("-------------------");

        List<Double> salario = new ArrayList<>();
        salario.add(10.000);
        salario.add(15.000);
        salario.add(8.000);
        salario.add(3.000);

        System.out.println(salario);
        Collections.sort(salario);

        for(Double salarios : salario) {
            System.out.println(salarios);
        }

        // ID e nome n podem ser nulos pois estamos utilizando "Objects.requireNonNull()";
        new Time(null, "null", 0);
    }
}
