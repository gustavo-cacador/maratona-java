package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2024-12-02"); // Aqui criamos uma data em forma de String
        LocalTime time = LocalTime.parse("15:31:47"); // Aqui criamos uma hora em forma de String
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time); // Aqui estamos criando o dia na hora que foi criada (time)
        LocalDateTime ldt2 = time.atDate(date); // Aqui estamos criando a hora no dia que foi criada (date)
        System.out.println(ldt1);
        System.out.println(ldt2);
    }
}
