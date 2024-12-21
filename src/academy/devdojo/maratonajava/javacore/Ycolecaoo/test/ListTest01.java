package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
     
        List<String>nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Ronchi");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Caçador");
        
        System.out.println("------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }        
}

