package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        
        Path dir = Paths.get("/home/gustavo");
        Path clazz = Paths.get("/home/gustavo/devdojomtbom/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/gustavo");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/gustavo/devdojomtbom/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.20241112");

        System.out.println(absoluto1);
        System.out.println(absoluto2);
        System.out.println(absoluto3);
        System.out.println(relativo1);
        System.out.println(relativo2);
    }
}
