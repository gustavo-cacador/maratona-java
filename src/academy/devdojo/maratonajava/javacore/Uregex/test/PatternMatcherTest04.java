package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        
        /* \d = Todos os dígitos
         * \D = Tudo o que não for dígito
         * \s = Espaços em branco \t \n \f \r
         * \S = Todos os caracteres excluindo os brancos
         * \w = a-z A-Z, dígitos, _
         * \W = Tudo o que não for incluso no \w
         * []
         * ? Zero ou uma
         * * Zero ou mais
         * + Uma ou mais
         * {n, m} de n até m
         * ()
         * |
         * $
         */
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        
        //int numeroHexadecimal = 0xFFF1221;
        //System.out.println(numeroHexadecimal);
    }
}
