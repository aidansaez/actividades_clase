package tema3.actividad8;

public class act8_1_2_3_4_5_6 {
    public static void main(String[] args) {
        /*
        1.
        a. catch (RunTimeException e)
        c. catch (IndexOutOfBoundsException e)
        d. catch (Exception e)

        2.
        a. Integer.parseInt("26.2"); // Lanzará la NumberFormatException porque el número es decimal y el metodo solo es para números enteros
        b. String s; s.indexOf(’a’); // Aquí dará un error porque a s no se le ha asignado ningún valor. error: NullPointerException
        c. String s = "hello"; s.charAt(5); // Crea una cadena de 5 hello pero en java siempre empieza desde el cero por lo que intenta acceder al 5 que no existe, esto dará un error StringIndexOutOfBoundsException

        3.
        Primero dará que 0,98 esta fuera de rango y termina.

        4.
        Que imprimirá el mensaje de error que hemos puesto en rojo.

        5.
        Imprimira "El numero es 0,44" y luego imprimirá que 0,98 esta fuera de rango.

        6.
        Que al principio dividirá 100/0 lo que es un error, mostrará este error: Exception in thread "main" java.lang.ArithmeticException: / by zero
         */
    }
}
