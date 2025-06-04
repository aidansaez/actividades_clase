package temaX.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class act3 {
    public static void leerPrimo() throws FileNotFoundException {
        File f = new File("C:/ficheros/primos.dat");
        Scanner entrada = new Scanner(f);
        while (entrada.hasNextInt()) {
            System.out.println(entrada.nextInt());
        }
    }
    public static void escribirPrimo() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("C:/ficheros/primos.dat");

        for (int i = 2; i <= 500; i++) {
            int c = 0;
            if (esPrimo(i)) {
                pw.println(i);
            }
        }
        pw.close();
    }
    public static boolean esPrimo(int i) {
        int c = 0;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                c++;
            }
        }
        return c == 0;
    }
    public static void main(String[] args) {
        try {
            escribirPrimo();
            leerPrimo();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }
    }
}
