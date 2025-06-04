package temaX.Ficheros;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class act1 {
    public static void main(String[] args) {
        try {
            PrintWriter salida = new PrintWriter("C:/ficheros/numerosnaturales.txt");
            int numero = 1;
            while (numero <= 100) {
                salida.println(numero++);
            }
            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
