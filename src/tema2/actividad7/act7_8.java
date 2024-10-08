package tema2.actividad7;
/*
 * Esto es una función para descubrir los primeros 50 números primos.
 * Aidan Sáez 20241005
 * */
public class act7_8 {
    public static void main(String[] args) {
        int divisores; // Número de divisores que encuentro durante el bucle
        int c = 0; // contador de números primos
        for (int i = 2; c < 50 ; i++) {
            divisores=0; // reinicializo la divisores a 0 cada vez que entro en el blucle ppal.
            for (int j = 2; j <= i ; j++)
                if (i % j == 0) // si el módulo de la división es 0 es porque es un divisor, por lo que sumo uno.
                    divisores++;
            if (divisores == 1) {   // si solo tengo un divisor es porque es primo.
                c++;   // aumento el contador de números primos descubiertos.
                System.out.println("Contador de números Primos: "+c+" | Número primo: " + i);
            }
        }
    }
}
