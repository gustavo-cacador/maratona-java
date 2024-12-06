package academy.devdojo.maratonajava.introducao;

/* 
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        
        String nome = "Gustavo";
        String endereco = "Rua José Celso Cláudio 65, apt 604";
        double salario = 2000;
        String data = "21/10/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + data);
    }
}
