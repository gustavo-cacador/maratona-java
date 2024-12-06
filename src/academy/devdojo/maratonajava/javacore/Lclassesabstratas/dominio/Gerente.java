package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        // Implementação tem que ser desse jeito pois estamos estendendo da classe Funcionario
        super(nome, salario);
    }

    // Adicionando Bônus no salário
    // Como estamos herdando método da Classe Pai (Funcionario) nós podemos implementar código
    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente [nome=" + nome + ", salario=" + salario + "]";
    }    
    
}
