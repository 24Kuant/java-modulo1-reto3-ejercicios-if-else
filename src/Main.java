import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {
        Utils tool = new Utils();

        //bienvenido al sistema
        tool.mostrarEjercicio(0);

        //ejercicio 01: validando si el Numero es Par o Impar?
        tool.mostrarEjercicio(1);
        NumeroParoImpar elNumero = new NumeroParoImpar();
        elNumero.setNumero(145);
        elNumero.ParoImpar();
        elNumero.setNumero(200);
        elNumero.ParoImpar();

        //ejercicio 02: Verificando si un alumno aprueba una asignatura
        tool.mostrarEjercicio(2);
        Calificacion calificacionJuan = new Calificacion();
        calificacionJuan.setPromedio(7.0);
        calificacionJuan.evaluacionFinal();

        Calificacion calificacionSandra = new Calificacion();
        calificacionSandra.setPromedio(6.9);
        calificacionSandra.evaluacionFinal();

        Calificacion calificacionDrupy = new Calificacion();
        calificacionDrupy.setPromedio(4.9);
        calificacionDrupy.evaluacionFinal();

        //inicializa el teclado para los ejercicios que lo requieren.
        Teclado teclado = new Teclado();
        teclado.inicializaTeclado();  //inicializando la entrada de texto o numeros por el teclado (cadenas)

        //ejercicio-03: Validando contraseña de acceso
        tool.mostrarEjercicio(3);
        //intento 1
        Passwords usuario01 = new Passwords();
        usuario01.setTeclado(teclado.obtenTeclado());
        usuario01.pidePassword();  //acepta cadenas
        usuario01.validarAcceso();

        //intento 2
        Passwords usuario02 = new Passwords();
        usuario02.setTeclado(teclado.obtenTeclado());
        usuario02.pidePassword();   //acepta cadenas
        usuario02.validarAcceso();

        //ejercicio-04: Comparando 2 numeros enteros
        tool.mostrarEjercicio(4);
        //intento 1
        ComparaNumeroEnteros comparaEnteros = new ComparaNumeroEnteros();
        comparaEnteros.setTeclado(teclado.obtenTeclado());
        comparaEnteros.pideNumerosEnteros();
        comparaEnteros.compararNumeros();

        //intento 2
        comparaEnteros.pideNumerosEnteros();
        comparaEnteros.compararNumeros();

        //intento 3
        comparaEnteros.pideNumerosEnteros();
        comparaEnteros.compararNumeros();

        //ejercicio-05: Verificación de descuento en compras
        tool.mostrarEjercicio(5);
        //intento 1
        Compras compra = new Compras();
        compra.setTeclado(teclado.obtenTeclado());
        //inicializando descuento.
        compra.setDescuentoFijo(10);  //en porcentaje. % de descuento.
        compra.setPrecioParaDescuento(100.0);  //precio minimo de la compra para que aplique el descuento.
        compra.ingresaCompra();
        compra.muestraDescuento();

        //intento 2
        compra.ingresaCompra();
        compra.muestraDescuento();

        //intento 3. cambiando los parametros del descuento
        compra.setDescuentoFijo(20);  //en porcentaje. % de descuento.
        compra.setPrecioParaDescuento(500.0);  //precio minimo de la compra para que aplique el descuento.
        compra.ingresaCompra();
        compra.muestraDescuento();

        //ejercicio-06: Verificación de día hábil
        tool.mostrarEjercicio(6);
        //intento 1
        DiasSemana diasSemana = new DiasSemana();
        diasSemana.setTeclado(teclado.obtenTeclado());
        diasSemana.pideDiaSemana();
        diasSemana.esDiaHabil();

        //intento 2
        diasSemana.pideDiaSemana();
        diasSemana.esDiaHabil();

        //ejercicio-07: Verificando si un número está en un intervalo
        tool.mostrarEjercicio(7);
        //intento 1
        Prestamos prestamo = new Prestamos();
        prestamo.setTeclado(teclado.obtenTeclado());
        prestamo.setRangoMinimoPrestamo(1000);
        prestamo.setRangoMaximoPrestamo(5000);
        prestamo.pidePrestamo();

        //intento 2
        prestamo.pidePrestamo();

        //intento 3 - cambiando los limites del credito
        prestamo.setRangoMinimoPrestamo(3000);
        prestamo.setRangoMaximoPrestamo(8000);
        prestamo.pidePrestamo();

        //intento 4
        prestamo.pidePrestamo();

        //ejercicio-08: Verificación de triángulo
        tool.mostrarEjercicio(8);
        //intento 1
        Triangulos triangulo = new Triangulos();
        triangulo.setTeclado(teclado.obtenTeclado());

        triangulo.pideLadosTriangulo();

        //intento 2
        triangulo.pideLadosTriangulo();

        //intento 3
        triangulo.pideLadosTriangulo();

        //ejercicio-09: Verificación de compatibilidad para donar sangre
        tool.mostrarEjercicio(9);
        //intento 1
        BancoDeSangre paciente = new BancoDeSangre();
        paciente.setTeclado(teclado.obtenTeclado());
        paciente.pideDatos();
        paciente.puedeDonarSangre();

        //intento 2
        paciente.pideDatos();
        paciente.puedeDonarSangre();

        //intento 3
        paciente.pideDatos();
        paciente.puedeDonarSangre();

        //ejercicio-10: Verificación de código de acceso y nivel de permiso
        tool.mostrarEjercicio(10);
        //intento 1
        AccesoSistema sistema = new AccesoSistema();
        sistema.setTeclado(teclado.obtenTeclado());
        sistema.pideDatos();
        sistema.validaAcceso();

        //intento 2
        sistema.pideDatos();
        sistema.validaAcceso();

        //intento 3
        sistema.pideDatos();
        sistema.validaAcceso();

        //intento 4
        sistema.pideDatos();
        sistema.validaAcceso();


        //terminando los ejercicios del curso .
        tool.mostrarEjercicio(20);

        //cerrando el teclado. ya no se usara.
        teclado.cierraTeclado();  //finaliza el uso del teclado durente la ejecucion de la aplicacion.
    }

}

