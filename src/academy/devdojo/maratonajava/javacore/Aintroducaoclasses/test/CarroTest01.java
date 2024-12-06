package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Mobi";
        carro1.modelo = "Fiat";
        carro1.ano = 2014;

        carro2.nome = "C4";
        carro2.modelo = "Citroen";
        carro2.ano = 2025;

        //carro1 = carro2;

        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n-------------");

        System.out.println("\nCarro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
