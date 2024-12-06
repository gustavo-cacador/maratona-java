package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
// 0 - Bloco de inicialização estático da super classe eh executado quando a JVM carregar classe pai
// 1 - Bloco de inicialização estático da subclasse eh executado quando a JVM carregara classe filha
// 2 - Alocado espaço em memória pro objeto da superclasse
// 3 - Cada atributo da superclasse eh criado e inicializado com valores default ou o que for passado
// 4 - Bloco de inicialização da superclasse eh executado na ordem em que aparece
// 5 - Construtor eh executado da superclasse
// 6 - Alocado espaço em memória pro objeto da subclasse
// 7 - Cada atributo da subclasse eh criado e inicializado com valores default ou o que for passado
// 8 - Bloco de inicialização da subclasse eh executado na ordem em que aparece
// 9 - Construtor eh executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}

