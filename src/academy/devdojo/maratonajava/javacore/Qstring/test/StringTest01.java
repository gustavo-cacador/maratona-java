package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        
        String nome = "Gustavo"; // String constant pool
        String nome2 = "Gustavo";
        nome = nome.concat("Caçador"); // mesma coisa que nome += "Caçador"
        System.out.println(nome);
        System.out.println(nome == nome2);

        // Nunca vai se criar uma string dessa forma
        String nome3 = new String("Gustavo"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string na pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        String nome4 = "Gustavo";
        System.out.println(nome2 == nome4);
    }
}
