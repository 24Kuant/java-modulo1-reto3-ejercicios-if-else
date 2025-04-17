import java.util.Scanner;

public class Prestamos {
    private Scanner teclado;
    private int dineroSolicitado;
    private int rangoMinimoPrestamo;  //valor por default = 1000 (lo incluye)
    private int rangoMaximoPrestamo;  //valor por default = 5000 (lo incluye)

    private String blue="\033[34m";
    private String red="\033[31m";
    private String reset="\u001B[0m";

    public void pidePrestamo() {
        System.out.print("Ingrese el valor del préstamo: " + this.blue);
        this.dineroSolicitado = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        String no = String.format("%sno%s ",this.red, this.reset);
        if ( this.dineroSolicitado >= this.rangoMinimoPrestamo && this.dineroSolicitado <= this.rangoMaximoPrestamo) {
            no = "";
        }

        System.out.println(String.format("%sEl valor %s%d%s %sestá dentro del intervalo permitido para el préstamo.", this.reset, this.blue, this.dineroSolicitado, this.reset, no));

        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void setRangoMinimoPrestamo(int rangoMinimoPrestamo) {
        this.rangoMinimoPrestamo = rangoMinimoPrestamo;
    }

    public void setRangoMaximoPrestamo(int rangoMaximoPrestamo) {
        this.rangoMaximoPrestamo = rangoMaximoPrestamo;
    }
}
