import java.util.Scanner;

public class Teclado {
    private Scanner teclado;

    public void inicializaTeclado() {
        this.teclado = new Scanner(System.in);
    }

    public Scanner obtenTeclado() {
        return this.teclado;
    }

    public void cierraTeclado() {
        //Solo se puede cerrar una sola vez durante todo el prorama,
        //pq si se cierra antes y lueo se quiere volver a usar el teclado (scanner) YA NO se podra usar y marcara error.
        this.teclado.close();
    }
}
