import java.util.Scanner;

public class Triangulos {
    private Scanner teclado;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    private String blue="\033[34m";
    private String red="\033[31m";
    private String reset="\u001B[0m";

    public void pideLadosTriangulo() {
        System.out.print(String.format("Ingrese el %sprimer%s lado: ", this.blue, this.reset));
        this.ladoA = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        System.out.print(String.format("Ingrese el %ssegundo%s lado: ", this.blue, this.reset));
        this.ladoB = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        System.out.print(String.format("Ingrese el %stercer%s lado: ", this.blue, this.reset));
        this.ladoC = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        /*
            Regla de Negocio:
                Para verificar si tres lados pueden formar un triángulo, necesitamos verificar si la suma de dos lados es mayor que el tercer lado.
                Utilizamos una estructura condicional if con operadores lógicos && (y) para verificar todas las condiciones necesarias.
                Si todas las condiciones son verdaderas, mostramos "Los lados pueden formar un triángulo".
                Si no, mostramos "Los lados no pueden formar un triángulo".
         */

        String no = String.format("%sno%s ",this.red, this.reset);
        if ( (this.ladoA + this.ladoB) > this.ladoC && (this.ladoA + this.ladoC) > this.ladoB && (this.ladoB + this.ladoC) > this.ladoA ) {
            no = "";
        }

        System.out.println(String.format("Los tres lados %s%s%spueden formar un triángulo.", this.blue, no, this.reset));

        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
