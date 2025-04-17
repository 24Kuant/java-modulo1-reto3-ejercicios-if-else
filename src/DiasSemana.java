import java.util.Scanner;

public class DiasSemana {
    private Scanner teclado;
    private String dia;
    private String diaSinAcentos;

    private String purple="\033[35m";
    private String reset="\u001B[0m";

    public void pideDiaSemana() {
        int intentos = 1;

        while (intentos <= 3) {
            System.out.print(String.format("Ingrese el día de la %ssemana%s (en minúsculas): ", this.purple, this.reset));
            this.dia = teclado.next();  //nextLine();  //solicita la entrada del teclado solo Strings o cadenas.
            if ( this.dia.trim().length() >= 5 ) {
                this.dia = this.dia.trim().toLowerCase();
                this.diaSinAcentos = this.dia.replaceAll("á", "a").replaceAll("é", "e").replaceAll("í", "i").replaceAll("ó", "o").replaceAll("ú", "u");
                break;
            } else {
                System.out.println("Favor de escribir un día de la semana. intento = " + intentos);
                this.dia = "error";
                this.diaSinAcentos = this.dia;
            }
            intentos++;
        }

        //teclado.close();  //cierra o libera el scanner. si dejo esta instruccion, en la 2da pasada con usuario01 - tod ok, pero con usuario02 - falla, porque?
    }

    public void esDiaHabil() {
       if (this.diaSinAcentos.length() >= 5) {
           String diaCapitalizado = this.ajustaSalidaDia();
           String no = "no ";  //sabado, domingo
           if (this.diaSinAcentos.equals("lunes") || this.diaSinAcentos.equals("martes") ||
               this.diaSinAcentos.equals("miercoles") || this.diaSinAcentos.equals("jueves") ||
               this.diaSinAcentos.equals("viernes")) {
               no = "";
           }

           System.out.println(String.format("%s %ses un día hábil.", diaCapitalizado, no));
       } else {
           System.out.println("Valor " + diaSinAcentos + " muy pequeño. Favor de escribir un día de la semana.");
       }
    }

    private String ajustaSalidaDia() {
        String diaCapitalizado = this.diaSinAcentos.substring(0, 1).toUpperCase() + diaSinAcentos.substring(1);
        if ( diaCapitalizado.equalsIgnoreCase("miercoles") ) {  //se pone que ignore mayusculas minusculsa pq inicia cn Mayuscula
            return diaCapitalizado.replaceAll("ier", "iér");
        } else if ( diaCapitalizado.equalsIgnoreCase("sabado") ) { //se pone que ignore mayusculas minusculsa pq inicia cn Mayuscula
            return diaCapitalizado.replaceAll("aba", "ába");
        }
        return diaCapitalizado;
    }
    //Setters

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
