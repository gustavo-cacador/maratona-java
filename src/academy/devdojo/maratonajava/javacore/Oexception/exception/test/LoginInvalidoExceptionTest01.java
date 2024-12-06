package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.util.Scanner;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usernameDB = "Kaisa";
        String senhaDB = "abc123";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuário:");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha:");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuário ou Senha incorretos. Tente novamente");
        }
        System.out.println("Login efetuado com sucesso.");
    }
}
