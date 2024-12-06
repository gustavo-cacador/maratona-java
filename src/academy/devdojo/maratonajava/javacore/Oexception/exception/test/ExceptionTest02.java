package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException{

        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

// Iremos utilizar try catch quando for um método privado
// throws usar quando for public
// mas depende muito do projeto
// Importante tentar manter o mesmo padrão pro sistema todo