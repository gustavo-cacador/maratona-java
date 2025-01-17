package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Time;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Nelio Alves");
        Cliente cliente2 = new Cliente("William Suane");

        Time time1 = new Time(5L, "Fluminense", 25, 0);
        Time time2 = new Time(1L, "Flamengo", 3, 2);
        Time time3 = new Time(3L, "Botafogo", 30, 3);
        Time time4 = new Time(4L, "Vasco", 7, 0);
        Time time5 = new Time(4L, "Atlético", 7, 0);

        List<Time> timeCliente1List = List.of(time1, time2, time3);
        List<Time> timeCliente2List = List.of(time5, time4);
        Map<Cliente, List<Time>> clienteTimeMap = new HashMap<>();
        clienteTimeMap.put(cliente1, timeCliente1List);
        clienteTimeMap.put(cliente2, timeCliente2List);

        for(Map.Entry<Cliente, List<Time>> entry : clienteTimeMap.entrySet()) {
            System.out.println(entry.getKey().getNome() + ", comprou: ");
            for(Time time : entry.getValue()) {
                System.out.println(time.getNome());
            }
        }
    }
}
