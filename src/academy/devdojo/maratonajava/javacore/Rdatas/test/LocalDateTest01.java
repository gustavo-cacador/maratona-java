package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
//import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        
        System.out.println(new Date());
    //  System.out.println(Calendar.getInstance());
        System.out.println(Month.DECEMBER.getValue());     
        LocalDate date = LocalDate.of(2024, 12, 12); // para criar uma data específica se utiliza o of
        System.out.println(date);
        LocalDate agora = LocalDate.now(); // para criar uma data do momento
        System.out.println(agora);  

        // para pular 4 semanas
        agora = agora.plusWeeks(4);

        System.out.println(date.getYear());       // para ver o ano
        System.out.println(date.getMonth());      // para ver o mês 
        System.out.println(date.getMonthValue()); // Janeiro = 1, Fevereiro = 2
        System.out.println(date.getDayOfWeek());  // para ver o dia da semana (segunda, terça, etc)
        System.out.println(date.getDayOfMonth()); // para ver o dia do mês
        System.out.println(date.lengthOfMonth()); // para ver quantos dias tem o mês
        System.out.println(date.isLeapYear());    // para verificar se o ano eh bissexto
    }
}
