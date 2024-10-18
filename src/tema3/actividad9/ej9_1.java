package tema3.actividad9;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ej9_1 {
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        return sc.nextInt();
    }
    public static boolean esCapicua(int num) {
        boolean esCapicua;
        esCapicua = num == voltea(num);
        return esCapicua;
    }
    public static boolean esPrimo(int num) {
        boolean esPrimo = false;
        int divisores = 0;
        for (int j = 2; j <= num ; j++)
            if (num % j == 0) // si el módulo de la división es 0 es porque es un divisor, por lo que sumo uno.
                divisores++;
        if (divisores == 1) {   // si solo tengo un divisor es porque es primo.
           esPrimo = true;
        }
        return esPrimo;
    }
    public static int siguientePrimo(int num) {
        num++;
        int divisores; // Número de divisores que encuentro durante el bucle
        int c = 0; // contador de números primos
        for (; c < 1 ; num++) {
            divisores=0; // reinicializo la divisores a 0 cada vez que entro en el blucle.
            for (int j = 2; j <= num ; j++)
                if (num % j == 0) // si el módulo de la división es 0 es porque es un divisor, por lo que sumo uno.
                    divisores++;
            if (divisores == 1) {   // si solo tengo un divisor es porque es primo.
                c++;   // aumento el contador de números primos descubiertos.
            }
        }
        num--;
        return num;
    }
    public static int digitos(int num) {
        int x = 0;
        while (Math.abs(num) > 0) {
            num /= 10;
            x++;
        }
        return x;
    }
    public static double potencia(int num, int num2){
        return Math.pow(num, num2);
    }
    public static int voltea(int num) {
        int volteado = 0;
        int digito;

        while (num > 0) {
            digito = num % 10;
            num = num/10;
            volteado = volteado * 10 + digito;
        }

        return volteado;
    }
    public static int digitoN(int num, int pos) {
        int digitos = digitos(num);
        pos--;
        int resta = digitos - pos;
        for (; resta != digitos; digitos--) {
            num = num / 10;
        }
        return num % 10;
    }
    public static int posicionDelDigito(int numero, int digito) {
        int i = 1;
        int o = 1;
        while (numero > 0) {
            int contador = numero % 10;
            if (contador == digito) {
                o++;
                break;
            } else o++;
            numero /= 10;
            i++;
        }
        if (o == i) {
            i = -1;
        }
        return i;
    }
    public static int quitaPorDetras (int num, int veces) {
        for (int i = 1; i <= veces; i++) {
            num /= 10;
        } return num;
    }
    public static int quitaPorDelante (int num, int veces) {
        num = voltea(num);
        for (int i = 1; i <= veces; i++) {
            num /= 10;
        }
        num = voltea(num);
        return num;
    }
    public static int pegaPorDetras (int num, int digito){
        num = (num * 10) + digito;
        return num;
    }
    public static int pegaPorDelante (int num, int digito) {
        num = (voltea(num) * 10) + digito;
        return voltea(num);
    }
    public static int trozoDeNumero (int num, int pos1, int pos2){
        int digitos = digitos(num);
        int resta = digitos - pos2;
        for (int i = 0; i < resta; i++) {
            num /= 10;
        }
        num = voltea(num);
        digitos = digitos - resta;
        resta = digitos - pos1;
        for (int i = 0; i < resta; i++) {
            num /= 10;
        }
        return voltea(num);
    }
    public static int juntaNumeros (int num, int num2) {
        num2 = voltea(num2);
        int digito;
        int digitos = digitos(num2);
        for (int i = 1; i <= digitos; i++) {
            digito = num2 % 10;
            num2 /= 10;
            num = (num * 10) + digito;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println("- 1. esCapicua");
                System.out.println("- 2. esPrimo");
                System.out.println("- 3. siguientePrimo");
                System.out.println("- 4. potencia");
                System.out.println("- 5. digitos");
                System.out.println("- 6. voltea");
                System.out.println("- 7. digitoN");
                System.out.println("- 8. posicionDeDigito");
                System.out.println("- 9. quitaPorDetras");
                System.out.println("- 10. quitaPorDelante");
                System.out.println("- 11. pegaPorDetras");
                System.out.println("- 12. pegaPorDelante");
                System.out.println("- 13. trozoDeNumeros");
                System.out.println("- 14. juntaNumeros");
                System.out.print("Opcion: ");
                int i = sc.nextInt();
                if (i >= 0 && i <= 15) {
                    switch (i) {
                        case 0:
                            System.out.println("Fin del programa");
                            break;
                        case 1:
                            System.out.println("Es verdadero que es capicua? " + esCapicua(pedirNumero()));
                            break;
                        case 2:
                            System.out.println("Es verdadero que es primo? " + esPrimo(pedirNumero()));
                            break;
                        case 3:
                            System.out.println("El siguiente numero primo es " + siguientePrimo(pedirNumero()));
                            break;
                        case 4:
                            System.out.println("Introduce base y exponente: ");
                            int x = pedirNumero();
                            int y = pedirNumero();
                            System.out.println("Resultdo: " + potencia(x, y));
                            break;
                        case 5:
                            System.out.println("El número tiene " + digitos(pedirNumero()) + " digitos");
                            break;
                        case 6:
                            System.out.println("El numero volteado es " + voltea(pedirNumero()));
                            break;
                        case 7:
                            System.out.println("Introduce el numero y la posicion: ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println("El digito en esa posición es " + digitoN(x, y));
                            break;
                        case 8:
                            System.out.println("Introduce el numero y el valor deseado: ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println("La posicion del digito es " + posicionDelDigito(x, y));
                            break;
                        case 9:
                            System.out.println("Introduce el número y cuantos digitos (por la derecha) le deseas quitar: ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println("El numero quedaría así: " + quitaPorDetras(x, y));
                            break;
                        case 10:
                            System.out.println("Introduce el número y cuantos digitos (por la izquierda) le deseas quitar: ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println("El número quedaría así " + quitaPorDelante(x, y));
                            break;
                        case 11:
                            System.out.println("Introduce el numero y el digito que le pegaras (por la derecha): ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println("Resultado: " + pegaPorDetras(x, y));
                            break;
                        case 12:
                            System.out.println("Introduce el numero y el digito que le pegaras (por la izquierda): ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println("Resultado: " + pegaPorDelante(x, y));
                            break;
                        case 13:
                            System.out.println("Introduce el número y la posición inicial y final de los digitos: ");
                            x = pedirNumero();
                            y = pedirNumero();
                            int z = pedirNumero();
                            System.out.println(trozoDeNumero(x, y, z));
                            break;
                        case 14:
                            System.out.println("Introduce los dos numeros: ");
                            x = pedirNumero();
                            y = pedirNumero();
                            System.out.println(juntaNumeros(x, y));
                            break;
                    }
                } else System.out.println("Opcion no valida");
                correcto = true;
            }catch (InputMismatchException e) {
                System.out.println("ERROR: No has introducido un numero");
                sc.next();
            }
        } while (!correcto);
    }
}
