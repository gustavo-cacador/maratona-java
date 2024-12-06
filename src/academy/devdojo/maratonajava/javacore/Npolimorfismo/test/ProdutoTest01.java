package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        
        Computador computador = new Computador("RTX4060", 8000);
        Tomate tomate = new Tomate("Tomate Verde", 10);
        Televisao tv = new Televisao("Smart 50\" ", 3000);

        CalculadoraImposto.CalculadoraImpostoProduto(computador);
        System.out.println("----------------------");
        CalculadoraImposto.CalculadoraImpostoProduto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.CalculadoraImpostoProduto(tv);
    }
}
