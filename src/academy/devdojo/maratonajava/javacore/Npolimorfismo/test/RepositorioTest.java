package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

public class RepositorioTest {
    public static void main(String[] args) {
        
        // Aqui criamos o objeto "repositorio" pois ele eh genérico, entao caso 
        // vc queira trocar pra RepositorioArquivo, RepositorioBancoDeDados ou
        // RepositorioMemoria fica mais facil essa troca, pois nós instanciamos
        // o objeto repositorio, logo fica mais flexível para "salvar" os dados

        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new ArrayList<>(); // LinkedList
        list.add("Brand");
        list.add("Kaisa");
        list.add("Bardo");
        System.out.println(list);
    }
}
