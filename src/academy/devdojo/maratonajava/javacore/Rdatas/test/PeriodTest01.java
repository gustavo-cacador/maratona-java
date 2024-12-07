package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowAfterTwoYears);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p5 = Period.ofYears(3);

        System.out.println(p1); // vai imprimir periodo 2 anos 7 dias
        System.out.println(p2); // vai imprimir periodo 10 dias
        System.out.println(p3); // vai imprimir periodo 58 semanas (em dias)
        System.out.println(p4); // vai imprimir periodo 3 meses
        System.out.println(p5); // vai imprimir periodo 3 anos
        System.out.println(p3.getMonths()); // está errado, vai retornar 0 (tentando retornar 58 semanas em meses)
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(p3.getDays())).getMonths()); // erro, vai retornar 1
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS)); // este eh o método para retornar a quantidade de meses em semanas (58 semanas = 13 meses)

    }
}
