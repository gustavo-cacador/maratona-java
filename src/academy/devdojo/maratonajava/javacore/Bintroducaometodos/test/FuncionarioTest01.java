package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimeDados();
        System.out.println("Média: " + funcionario.getMedia());

        // Removemos o setMedia da classe Funcionário para n poder alterar nenhum valor na media
        // Com isso, só conseguimos obter a média através do get, fazendo o calculo certo.
    }
}
