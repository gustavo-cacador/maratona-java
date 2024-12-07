package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        
        LocalDateTime aniversario = LocalDateTime.of(1988, 8, 6, 18, 1, 1);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now)); // retorna a quantidade de dias da data de aniversário até hj (aniversário - agora (now))
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now)); // retorna a quantidade de semanas da data de aniversário até hj (aniversário - agora (now))
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now)); // retorna a quantidade de meses da data de aniversário até hj (aniversário - agora (now))
        System.out.println(ChronoUnit.YEARS.between(aniversario, now)); // retorna a quantidade de anos da data de aniversário até hj (aniversário - agora (now))

    }
}
