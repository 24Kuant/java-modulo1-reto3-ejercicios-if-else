import java.util.Scanner;

public class Compras {
    private Scanner teclado;
    private double precio;
    private boolean aplicaDescuento;

    private double precioParaDescuento; //valor de la compra para que aplique el descuento = 100;
    private int descuentoFijo;  //valor del descuento aplicado = 10%, si es que aplica (cumple con la rela de neggocio).

    private String black="\033[30m";
    private String red="\033[31m";
    private String green="\033[32m";
    private String yellow="\033[33m";
    private String blue="\033[34m";
    private String purple="\033[35m";
    private String cyan="\033[36m";
    private String white="\033[37m";
    private String reset="\u001B[0m";

    public void ingresaCompra() {
        System.out.print("Ingrese el valor de la compra: ");
        this.precio = teclado.nextDouble();  //solicita la entrada del teclado solo numeros con decimales
        validarDescuento();
        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    private void validarDescuento() {
        this.aplicaDescuento = (this.precio >= this.precioParaDescuento);
    }

    public void muestraDescuento() {
        if( this.aplicaDescuento ) {
            double descuento = this.precio * (this.descuentoFijo / 100.00);  //se pone 100.00 en luar de 100, ya que la division de dos enteros dara cero. debe tener al menos un double para que el resultado sea double. ojo. importante.
            System.out.println("descuento=" + descuento);
            System.out.println(String.format("Descuento del %s%d%%%s aplicado.", this.green, this.descuentoFijo, this.reset));
            System.out.println(String.format("Nuevo valor: %s$%.2f%s",this.yellow, (this.precio - descuento), this.reset));
        } else {
            System.out.println("Descuento " + this.red + "no" + this.reset + " aplicado.");
            System.out.println(String.format("Valor total: %s$%.2f%s", this.blue, this.precio, this.reset));
        }
    }

    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void setPrecioParaDescuento(double precioParaDescuento) {
        if (precioParaDescuento > 0.0) {
            this.precioParaDescuento = precioParaDescuento;
        } else {
            this.precioParaDescuento = 0.0;
        }
    }

    public void setDescuentoFijo(int descuentoFijo) {
        if (descuentoFijo > 0 && descuentoFijo <= 70) {
            this.descuentoFijo = descuentoFijo;
        } else if (descuentoFijo > 70) {
            this.descuentoFijo = 75;
        } else {
            this.descuentoFijo = 0;
        }
    }

    /*
    fuente: https://dryant.com/programacion/como-poner-el-texto-de-color-en-la-consola-o-terminal-ejemplo-en-java/
    Códigos de colores para la consola o terminal en JAVA
    Éstos son los códigos correspondientes a cada color:

    Negro: \033[30m
    Rojo: \033[31m
    Verde: \033[32m
    Amarillo: \033[33m
    Azul: \033[34m
    Magenta: \033[35m
    Cyan: \033[36m
    Blanco: \033[37m
    Reset: \u001B[0m

     */
}
