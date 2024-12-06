package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    // Na sobrescrita, podemos lanças os exception ou não, n eh obrigatório
    // Podemos lançar NENHUMA exception, UMA ou TODAS (duas). Pois na classe "Pessoa" só tem duas exception
    // Mas temos que passar as exception "filhas" na sobrescrita, no caso n passamos as exception mais genericas, como IOException
    // Não pode lançar nenhuma exception checked que não tenha no método original, como Exception por exemplo.
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário.");
    }
}
