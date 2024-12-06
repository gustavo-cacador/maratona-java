package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch(IOException | SQLException e) {
            e.printStackTrace();
        } 
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}

// Multi catch em linha -> faz a mesma coisa, mas de escrita de código diferente.
// Mesma coisa do RuntimeExceptionTest04.