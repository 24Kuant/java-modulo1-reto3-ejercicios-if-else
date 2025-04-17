import java.util.Scanner;

public class ComparaNumeroEnteros {
    private Scanner teclado;
    private int numero1;
    private int numero2;

    public void pideNumerosEnteros() {
        System.out.print("Ingrese el primer número: ");
        this.numero1 = teclado.nextInt();  //solicita la entrada del teclado solo numeros enteros.

        System.out.print("Ingrese el segundo número: ");
        this.numero2 = teclado.nextInt();  //solicita la entrada de caracteres alfa-numericos //solicita del teclado una cadena de carateres.

        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    public void compararNumeros() {
        int numeroMayor = numero1;
        if( this.numero2 > numeroMayor ) {
            numeroMayor = numero2;
            System.out.println(String.format("El número mayor es %d.", numeroMayor));
        } else {
            System.out.println(String.format("Ambos números son iguales, con el valor de %d", numeroMayor));
        }
    }
    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
