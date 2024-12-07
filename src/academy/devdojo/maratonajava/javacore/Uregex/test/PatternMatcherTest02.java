package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        
        /* \d = Todos os dígitos
         * \D = Tudo o que não for dígito
         * \s = Espaços em branco \t \n \f \r
         * \S = Todos os caracteres excluindo os brancos
         * \w = a-z A-Z, dígitos, _
         * \W = Tudo o que não for incluso no \w
         */
        String regex = "\\W";
    //  String texto = "abaaba";
        String texto2 = "@#d8wa_yd7 wayd9a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: " + texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
