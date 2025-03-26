package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/nombres.txt");
        try {
            Scanner entrada = new Scanner(f);
            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine().toUpperCase();
                linea = linea.replace(" ", "");
                System.out.println(linea);
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
