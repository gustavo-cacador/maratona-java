package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        
        // + - / *

        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2 + numero1 +" Valor " + numero2 + numero1);
        int resultado = numero1 / numero2;
        System.out.println(resultado);


        // % 
        int resto = 20 % 2;
        System.out.println(resto);


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);


        // && (AND) || (or) !
        int idade = 29;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        double contaCorrente = 200;
        double contaPoupanca = 10000;
        double ps5 = 5000;

        boolean isPs5Compravel = contaCorrente >= ps5 || contaPoupanca >= ps5;
        System.out.println("isPs5Compravel " + isPs5Compravel);


        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; //
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++; // contador = 2
        contador --; // contador = 1
        int contador2 = 0;
        System.out.println(++contador2); 
        System.out.println(contador2++); 

    }
}
