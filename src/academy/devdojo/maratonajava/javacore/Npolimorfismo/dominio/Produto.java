package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel{

    // Classe abstrata (Produto) implementa Interface (Taxavel)
    // Interface Taxavel eh onde tem o método calcularImposto, que "herda" pra Produto
    // e Produto herda para classe Computador, Televisao e Tomate 

    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    
    
}
