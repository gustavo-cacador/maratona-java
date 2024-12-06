package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        
        Computador produto = new Computador("Acer",2000);

        Tomate tomate = new Tomate("Amarelo", 20);
        tomate.setDataValidade("20/11/2024");

        CalculadoraImposto.CalculadoraImpostoProduto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto.CalculadoraImpostoProduto(produto);
    }
}
