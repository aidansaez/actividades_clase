package tema3.actividad9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ej9_6 {
    public static int pedirNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        return sc.nextInt();
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
    public static int binToDec (int bin) {
        int valor = 1, num, suma = 0;

        while (bin > 0) {
            num = bin % 10;
            num *= valor;
            suma = suma + num;
            valor *= 2;
            bin /= 10;
        }
        return suma;
    }
    public static int binToOct (int bin) {
        int dec = binToDec(bin);
        int resto, suma = 0;

        while (dec > 0) {
            resto = dec % 8;
            suma = (suma + resto) * 10;
            dec /= 8;
        }
        suma /= 10;
        return voltea(suma);
    }
    public static int binToHex (int bin) {
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        do {
            try {
                System.out.println("1 - Binario a decimal");
                System.out.println("2 - Binario a octal");
                System.out.println("3 - Binario a hexadecimal");
                System.out.println("4 - Decimal a binario");
                System.out.println("5 - Decimal a octal");
                System.out.println("6 - Decimal a hexadecimal");
                System.out.println("7 - Octal a binario");
                System.out.println("8 - Octal a decimal");
                System.out.println("9 - Octal a hexadecimal");
                System.out.println("10 - Hexadecimal a binario");
                System.out.println("11 - Hexadecimal a decimal");
                System.out.println("12 - Hexadecimal a octal");
                System.out.print("Elige una opción: ");
                int i = sc.nextInt();
                if (i >= 1 && i <= 12) {
                    switch (i) {
                        case 1:
                            System.out.println("El número en decimal es " + binToDec(pedirNum()));
                            break;
                        case 2:
                            System.out.println("El número en octal es " + binToOct(pedirNum()));
                            break;
                        case 3:
                            System.out.println("El número en hexadecimal " + binToHex(pedirNum()));
                    }
                } else System.out.println("Opción no valida");
                correcto = true;
            }catch (InputMismatchException e) {
                System.out.println("ERROR: No has introducido un numero");
                sc.next();
            }
        } while (!correcto);
    }
}
