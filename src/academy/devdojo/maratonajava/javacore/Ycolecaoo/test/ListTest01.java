package academy.devdojo.maratonajava.javacore.Ycolecaoo.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
     
        List<String>nomes = new ArrayList<>();
        List<String>nomes2 = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Ronchi");
        nomes2.add("Gustavo");
        nomes2.add("Caçador");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Adicionando esse Objeto no 2º for
        nomes.add("Caçador");

        System.out.println("------------");

        //Poderia adiocionar: int size = nomes.size(); nomes.size() = size
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }        
}

