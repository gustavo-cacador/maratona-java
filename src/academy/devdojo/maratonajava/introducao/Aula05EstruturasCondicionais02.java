package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil 
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 16;
        String resultado;

        if(idade < 15){
            System.out.println("Categoria Infantil");
        } else if(idade >= 15 && idade < 18){
            System.out.println("Categoria Juvenil");
        }
        else{
            System.out.println("Categoria Adulto");
        }
       
        resultado = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(resultado);
    }
}
