import java.util.Scanner;

public class AccesoSistema {
    private Scanner teclado;
    private int codigo;
    private int nivel;

    private int codigoSecreto = 2023;  //valor por default 2023
    private int nivelPermisoMinimo = 1;
    private int nivelPermisoMaximo = 3;

    private String purple="\033[35m";
    private String blue="\033[34m";
    private String red="\033[31m";
    private String reset="\u001B[0m";

    public void pideDatos() {
        System.out.print(String.format("Ingrese el %scódigo%s de acceso: ", this.purple, this.reset));
        this.codigo = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        System.out.print(String.format("Ingrese el %snivel%s de permiso: ", this.purple, this.reset));
        this.nivel = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.
    }

    public void validaAcceso() {
        /*
            Regla de Negocio:
                Para acceder al sistema, el usuario debe proporcionar:
                    Un código de acceso numérico.
                    Un nivel de permiso numérico.
                    El sistema solo permitirá el acceso si:

                    El código de acceso es correcto.
                    El nivel de permiso es válido (1, 2 o 3).
         */

        boolean codigoValido = (this.codigo == this.codigoSecreto);
        boolean nivelValido = (this.nivel >= this.nivelPermisoMinimo && this.nivel <= this.nivelPermisoMaximo);

        if ( codigoValido && nivelValido) {
            System.out.println(String.format("Acceso %spermitido%s. ¡Bienvenido al sistema!", this.blue, this.reset));
        }
        else {
            String letreroMotivo = "s";

            boolean dosMotivos = !codigoValido && !nivelValido;
            if (!dosMotivos) {
                letreroMotivo = "";
            }

            System.out.println(String.format("Acceso %sdenegado%s. Motivo%s: ", this.red, this.reset, letreroMotivo));
            if ( !codigoValido ) {
                System.out.println(String.format("%s-%s Código de acceso incorrecto.", this.purple, this.reset));
            }
            if ( !nivelValido ) {
                System.out.println(String.format("%s-%s Nivel de permiso inválido.", this.purple, this.reset));
            }
        }

        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
