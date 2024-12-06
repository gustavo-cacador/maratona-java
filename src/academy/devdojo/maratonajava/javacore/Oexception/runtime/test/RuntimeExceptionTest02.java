package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        
        divisao(1, 0);

        System.out.println("Código finalizado.");
    }

    /*
     * 
     * @param a
     * @param b - n pode ser zero
     * @return
     * @throws IllegalArgumentException
     */

    private static int divisao (int a, int b) {
        if (b == 0) {
            // usar throw new quando queremos lançar uma exceção
            // nesse caso n eh obrigatório fazer tratamento, pois eh unchecked
            throw new IllegalArgumentException("Argumento inválido, não pode ser zero.");
        }
        return a/b;
    }
}
