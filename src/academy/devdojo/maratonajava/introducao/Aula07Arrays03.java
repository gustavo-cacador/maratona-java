package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        // Formas diferentes de declarar Arrays
        int numeros [] = new int[3];
        int numeros2 [] = {1, 2, 3, 4, 5};
        int numeros3 [] = new int[]{5, 4, 3, 2, 1};

        // Imprimir os números da Array
//        for (int i = 0; i < numeros3.length; i++) {
//           System.out.println(numeros3[i]);
//        }

        for(int num : numeros3){
            System.out.println(num);
        }
    }
}
