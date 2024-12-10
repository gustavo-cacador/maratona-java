package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Eu quero e vou trabalhar com Javaaaaa\nJavinha spring boot eh massa\n");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
