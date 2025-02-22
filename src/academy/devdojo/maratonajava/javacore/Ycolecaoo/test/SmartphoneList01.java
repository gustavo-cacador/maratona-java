package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Ycolecaoo.dominio.Smartphone;

public class SmartphoneList01 {
    public static void main(String[] args) {
        
        Smartphone s1 = new Smartphone("A123B", "iPhone");
        Smartphone s2 = new Smartphone("22222", "Samsumg");
        Smartphone s3 = new Smartphone("33333", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0,s3);

        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("222233", "Pixel");

        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
