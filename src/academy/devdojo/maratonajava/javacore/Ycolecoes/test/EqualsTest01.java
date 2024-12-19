package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.test.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        
        /* 
        String nome = "Gustavo Caçador";
        String nome2 = new String("Gustavo Caçador");
        System.out.println(nome.equals(nome2)); // equals compara os dois objetos e retorna true ou false
        */
        
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
