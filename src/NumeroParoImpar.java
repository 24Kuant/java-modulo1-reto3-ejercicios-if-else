public class NumeroParoImpar {
    private int numero;

    //ejercicio 01: validando si el numero es par o impar
    public void ParoImpar() {
        if( (this.numero % 2) == 0 ) {
            System.out.println(String.format("El número %d es PAR", this.numero));
        } else {
            System.out.println(String.format("El número %d es IMPAR", this.numero));
        }
    }

    //Setters

    public void setNumero(int numero) {
        this.numero = numero;
    }
}