package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {
        
        Path dir = Paths.get("home/gustavo");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path abosoluto = Paths.get("/home/gustavo");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1: " + abosoluto.resolve(relativo));
        System.out.println("2: " + abosoluto.resolve(file));
        System.out.println("3: " + relativo.resolve(abosoluto));
        System.out.println("4: " + relativo.resolve(file));
        System.out.println("5: " + file.resolve(abosoluto));
        System.out.println("6: " + file.resolve(relativo));

    }
}
