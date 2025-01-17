package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Nelio Alves");
        Cliente cliente2 = new Cliente("William Suane");
        //System.out.println(cliente1);
        //System.out.println(cliente2);

        Time time1 = new Time(5L, "Fluminense", 25, 0);
        Time time2 = new Time(1L, "Flamengo", 3, 2);
        Time time3 = new Time(3L, "Botafogo", 30, 3);
        Time time4 = new Time(4L, "Vasco", 7, 0);
        Time time5 = new Time(4L, "Vasco", 7, 0);

        Map<Cliente, Time> clienteTime = new HashMap<>();
        clienteTime.put(cliente1, time1);
        clienteTime.put(cliente2, time4);

        for(Map.Entry<Cliente, Time> entry : clienteTime.entrySet()) {
            System.out.println(entry.getKey().getNome() + ", comprou: " + entry.getValue().getNome());
        }
    }
}
