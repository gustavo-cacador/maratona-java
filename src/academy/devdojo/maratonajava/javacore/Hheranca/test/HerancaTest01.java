package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das Laranjeiras");
        endereco.setCep("123456-88");

        Pessoa pessoa = new Pessoa("Diogo Barbosa");
        pessoa.setCpf("123456789-10");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Mano Menezes");
        funcionario.setCpf("328398239-44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(15000);

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
