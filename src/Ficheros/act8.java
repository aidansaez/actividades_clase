package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class act8 {
    public static void mostrarFichero (String name, String palabra) throws FileNotFoundException {
        File f = new File("C:/ficheros/" + name);
        Scanner entry = new Scanner(f);
        int c = 0;

        while (entry.hasNextLine()) {
            String linea = entry.nextLine();
            int indice = linea.indexOf(palabra);
            while (indice != -1) {
                c++;
                indice = linea.indexOf(palabra, indice + palabra.length());
            }
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String name = sc.nextLine();
        System.out.print("Palabra a encontrar: ");
        String palabra = sc.nextLine();
        try {
            mostrarFichero(name, palabra);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
