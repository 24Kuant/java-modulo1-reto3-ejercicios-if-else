import java.util.Scanner;

public class BancoDeSangre {
    private Scanner teclado;
    private int edad;
    private double peso;

    private String purple="\033[35m";
    private String blue="\033[34m";
    private String red="\033[31m";
    private String reset="\u001B[0m";

    public void pideDatos() {
        System.out.print(String.format("Ingrese la %sedad%s del donante: ", this.purple, this.reset));
        this.edad = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        System.out.print(String.format("Ingrese el %speso%s del donante (en kg): ", this.purple, this.reset));
        this.peso = teclado.nextDouble();  //solicita la entrada del teclado solo numeros double.
    }

    public void puedeDonarSangre() {
        /*
            Regla de Negocio:
                Para ser compatible, y poder donar sangre, el donante debe cumplir con los siguientes criterios:
                    Tener entre 18 y 65 años.
                    Pesar más de 50 kg.
         */

        String no = String.format("%sno%s ",this.red, this.reset);
        boolean edadValida = (this.edad >= 18 && this.edad <= 65);
        boolean pesoValido = (peso > 50.0);

        if ( edadValida && pesoValido) {
            System.out.println(String.format("%sFelicidades!!!.%s El donante es compatible para donar sangre.", this.blue, this.reset));
        }
        else {
            String letreroMotivo = "s";

            boolean dosMotivos = !edadValida && !pesoValido;
            if (!dosMotivos) {
                letreroMotivo = "";
            }

            System.out.println(String.format("El donante %sno%s es compatible. Motivo%s: ", this.red, this.reset, letreroMotivo));
            if ( !edadValida ) {
                System.out.println(String.format("%s-%s Debe tener entre 18 y 65 años.", this.purple, this.reset));
            }
            if ( !pesoValido ) {
                System.out.println(String.format("%s-%s Debe pesar más de 50 kg.", this.purple, this.reset));
            }
        }

        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
