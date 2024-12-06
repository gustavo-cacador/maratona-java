package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;
    private double media;

    // Removemos o setMedia da classe Funcionário para n poder alterar nenhum valor na media
    // Com isso, só conseguimos obter a média através do get, fazendo o calculo certo.

    public void imprimeDados(){

        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }

        for(double salario: salarios){
            System.out.println(salario + " ");
        }
        
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if(salarios == null){
            return;
        }

        for(double salario: salarios){
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Média Salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    

}
