package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {

    public static void main(String[] args) {
        
        String nome = "Gustavo Caçador";
        String nome2 = new String("Gustavo Caçador");
        System.out.println(nome.equals(nome2));

        Smartphone s1 = new Smartphone("A123B", "iPhone");
        Smartphone s2 = new Smartphone("A123B", "iPhone");
        System.out.println(s1.equals(s2)); // equals compara os dois objetos, retornando true ou false
    }
}