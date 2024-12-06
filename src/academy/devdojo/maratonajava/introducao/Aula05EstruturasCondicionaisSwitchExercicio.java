package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisSwitchExercicio {
    public static void main(String[] args) {

        // Dado os valores de 1 a 7, imprima se eh dia útil ou final de semana
        // Considerando 1 como Domingo

        int dia = 8;
        
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
            System.out.println("Opção Inválida");
            break;
        }
    }
}
