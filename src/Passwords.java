import java.util.Scanner;

public class Passwords {
    private String pwdSecreto = "123456";
    private String elPassword;
    private Scanner teclado;

    public void pidePassword() {
        System.out.print("Ingrese la contraseña: ");
        this.elPassword = teclado.next();  //nextLine();  //solicita la entrada de caracteres alfa-numericos //solicita del teclado una cadena de carateres.
        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    public void validarAcceso() {
        if( this.elPassword.equals(this.pwdSecreto) ) {
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("¡Acceso denegado!");
        }
    }

    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
