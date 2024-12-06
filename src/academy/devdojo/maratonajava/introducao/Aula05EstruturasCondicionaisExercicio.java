package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34.712){
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34.712 && salarioAnual <= 68.507){
            valorImposto = salarioAnual * segundaFaixa;
        }
        else{
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Você pagará " + valorImposto + " reais de imposto");
    }
}
