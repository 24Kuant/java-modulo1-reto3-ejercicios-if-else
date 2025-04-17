public class Calificacion {
    private double promedio;

    //ejercicio 02: validanso si aprueba la asignatura
    public void evaluacionFinal() {

        if (promedio >= 7.0) {   //El estudiante es aprobado si su promedio final es mayor o igual a 7.0.
            System.out.println(String.format("El estudiante tuvo un promedio de %.1f y fue aprobado.", promedio));
        } else if (promedio >= 5.0 && promedio < 7.0) {   //Si el promedio está entre 5.0 y 6.9, está en recuperación. OJO.IMPORTANTE la condicion de:   && promedio < 7.0   sale sobrando, esta de mas.
            System.out.println(String.format("El estudiante tuvo un promedio de %.1f y está en recuperación.", promedio));
        } else {  //Si es inferior a 5.0, está reprobado.
            System.out.println(String.format("El estudiante tuvo un promedio de %.1f y fue reprobado.", promedio));
        }

    }

    //Setters
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}