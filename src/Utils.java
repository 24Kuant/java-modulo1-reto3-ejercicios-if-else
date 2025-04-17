public class Utils {
    public void mostrarEjercicio(int numero) {
        String mensaje;
        if ( numero == 1) {
            mensaje = "ejercicio 01: validando si el Numero es Par o Impar?";
        } else if ( numero == 2) {
            mensaje = "ejercicio 02: Verificando si un alumno aprueba una asignatura";
        } else if ( numero == 3) {
            mensaje = "ejercicio-03: Validando contraseña de acceso";
        } else if ( numero == 4) {
            mensaje = "ejercicio-04: Comparando 2 numeros enteros";
        } else if ( numero == 5) {
            mensaje = "ejercicio-05: Verificación de descuento en compras";
        } else if ( numero == 6) {
            mensaje = "ejercicio-06: Verificación de día hábil";
        } else if ( numero == 7) {
            mensaje = "ejercicio-07: Verificando si un número está en un intervalo";
        } else if ( numero == 8) {
            mensaje = "ejercicio-08: Verificación de triángulo";
        } else if ( numero == 9) {
            mensaje = "ejercicio-09: Verificación de compatibilidad para donar sangre";
        } else if ( numero == 10) {
            mensaje = "ejercicio-10: Verificación de código de acceso y nivel de permiso";
        } else if ( numero == 20) {
            mensaje = "Gracias por usar este proyecto de ejercicios";
        } else {
            mensaje = "Bienvenido!! al Proyecto de ejercicios";
        }

        System.out.println("=====");
        System.out.println("=============================================================");
        System.out.println("=====");
        System.out.println("=====" + mensaje);
        System.out.println("=====");
        System.out.println("=============================================================");
        System.out.println("=====");
    }
}
