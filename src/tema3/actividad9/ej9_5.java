package tema3.actividad9;
import java.util.Scanner;

public class ej9_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número en decimal: ");
        int dec = sc.nextInt();
        int bin= 0;
        int factor = 1;

        while (dec > 0) {
            int resto = dec % 2; // Almacena el resto que sera el número binario
            bin = bin + resto * factor;
            factor *= 10;
            dec = dec / 2;
        }
        System.out.println(bin);
    }
}
