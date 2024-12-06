package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.Seminario;


// Crie um Sistema que gerencie seminários

// O sistema deverá conter Seminários, Alunos, Professores e Local onde será realizado

// Um Aluno poderá estar em apenas um Seminário
// Um Seminário poderá ter nenhum ou vários Alunos
// Um Professor poderá ministrar vários seminários
// Um Seminário deve ter um Local

/* Campos básicos
    Seminário: titulo
    aluno: nome e idade
    professor: nome, especialidade
    local: endereco
 */

public class ExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Praia das Gaivotas");
        Aluno aluno = new Aluno("Gilberto", 17);
        Professor professor = new Professor("Gilmar", "Marketing");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Como melhorar nas Redes Sociais", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
