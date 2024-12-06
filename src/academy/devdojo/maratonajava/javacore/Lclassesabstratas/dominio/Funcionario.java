package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{

    protected String nome;
    protected double salario;

    // Como a classe eh abstrata, devemos fazer um constructor da classe para herdarmos para as classes filho
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }


    // Aqui criamos um método abstrato pois n queremos chamar o método pela classe pai (classe Funcionário)
    // Queremos chamar o método por cada classe e atribuindo o bonus para cada classe (Gerente e Desenvolvedor)
    // Queremos adicionar o bonus no salario do Desenvolvedor e Gerente através da classe deles
    // Só conseguimos criar método abstrato pois temos a classe abstrata Funcionario
    // Lembrar que método abstrato n tem corpo (implementação), nós fazemos a implementação nas subclasses (Gerente e Desenvolvedor)

    public abstract void calculaBonus();

    // Aqui estamos herdando o método imprime da Classe Pai (Pessoa), então nós podemos implementar código no método
    @Override
    public void imprime() {
        System.out.println("Imprimindo...");        
    }
    
}
