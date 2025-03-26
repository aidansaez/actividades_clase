package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args){
        File f = new File("C:/ficheros/numerosnaturales.txt");
        int numero, suma = 0;

        try {
            Scanner entrada = new Scanner(f);
            while (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                suma = suma + numero;
            }
            System.out.println("Suma total de 100 numeros: " + suma);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
