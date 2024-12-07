package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        
        /* A classe date trabalho com Long que
        representa milisegundos desde 1 de Jan de 1970
        Essa classe date eh pouco utilizada
         */
        Date date = new Date(); // long 100000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
