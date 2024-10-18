package tema3.actividad9;

public class ej9_2 {
    public static void main(String[] args) {
        int divisores; // Número de divisores que encuentro durante el bucle
        for (int i = 2; i <= 1000 ; i++) {
            divisores=0; // reinicializo la divisores a 0 cada vez que entro en el blucle.
            for (int j = 2; j <= i ; j++)
                if (i % j == 0) // si el módulo de la división es 0 es porque es un divisor, por lo que sumo uno.
                    divisores++;
            if (divisores == 1) {   // si solo tengo un divisor es porque es primo ya que el 1 no cuenta porque empezamos por el 2.
                System.out.println("Primo: " + i);
            }
        }
    }
}
