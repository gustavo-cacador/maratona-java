package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked = Checked > elas precisam fazer o tratamento
        // RuntimeException nao precisa obrigatoriamente fazer o tratamento (unchecked)

        int [] nums = {1, 2};
        System.out.println(nums [2]);
    }
}   
