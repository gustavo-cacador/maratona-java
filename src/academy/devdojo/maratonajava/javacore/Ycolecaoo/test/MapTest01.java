package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");

        // diferente do Set, o Map aceita valores duplicados, porém ele só vai imprimir o último valor inserido (no caso vai imprimir "você2")
        map.put("vc", "você");
        map.put("vc", "você2");
        map.putIfAbsent("vc", "você"); // metodo putIfAbsent ele só adiciona caso não exista
        map.putIfAbsent("vc2", "você");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("----------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("----------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
