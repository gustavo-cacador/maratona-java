package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Smartphone;
import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class TimePrecoComparator implements Comparator<Time> {

    @Override
    public int compare(Time o1, Time o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Iphone");
        set.add(smartphone);

        // O TreeSet vai fazer a organização com base no compareTo da classe Time (que no caso eh o get.Nome), logo vai ficar em ordem alfabética
        // O TreeSet usa o compareTo, e como o compareTo ta pegando o nome, o objeto "Atlético" n vai se duplicar
        NavigableSet<Time> times = new TreeSet<>(new TimePrecoComparator());
        times.add(new Time(5L, "Fluminense", 25, 0));
        times.add(new Time(1L, "Flamengo", 3, 2));
        times.add(new Time(3L, "Botafogo", 3.2, 3));
        times.add(new Time(4L, "Vasco", 10, 0));
        times.add(new Time(9L, "Atlético", 7, 0));
        times.add(new Time(9L, "Atlético", 10, 0)); // Mesmo com preço diferente, ele não será duplicado pois o Nome eh o mesmo

        for (Time time: times) {
            System.out.println(time);
        }

        System.out.println("-------------------------------------------------------------");

        // Metodo para ordenar a ordem alfabética ao contrária
        for(Time time: times.descendingSet()) {
            System.out.println(time);
        }

        Time flu = new Time(21L, "Fluzão", 3.2, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("-------------------------------------------------------------");
        System.out.println(times.lower(flu)); // retorna o time com preco menor que 3.2
        System.out.println(times.floor(flu)); // retorna o time com preço igual a 3.2
        System.out.println(times.higher(flu)); // retorna o time com preço maior que 3.2
        System.out.println(times.ceiling(flu)); // retorna o time com preço igual a 3.2

        System.out.println(times.size()); // retorna a quantidade de times não duplicados(5)
        System.out.println(times.pollFirst()); // retorna o primeiro time com menor preço
        System.out.println(times.pollLast()); // retorna o primeiro time com maior preço
        System.out.println(times.size());

    }
}
