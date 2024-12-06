package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    // Graças ao Polimorfismo, conseguimos criar apenas 1 método genérico (CalculadoraImpostoProduto)
    // que conseguimos usar para os 3 objetos de Produto (Televisao, Computador e Tomate)
    // Classe pai: Produto | Subclasses (filho): Tomate, Televisao e Computador

    public static void CalculadoraImpostoProduto(Produto produto) {
        System.out.println("Relatório de imposto do Produto:");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Como na nossa implementação eh genérica e n conseguimos dar produto.getDataValidade
        // para o tomate, precisamos fazer a seguinte implementação:
        if (produto instanceof Tomate) {
            System.out.println("Data de Validade:");
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
        }
    }
}


