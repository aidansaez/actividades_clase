package temaX.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class act7 {
    public static void mostrarFichero (String name) throws FileNotFoundException {
        File f = new File("C:/ficheros/" + name);
        Scanner entry = new Scanner(f);

        while (entry.hasNextLine()) {
            System.out.println(entry.nextLine());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero: ");
        String name = sc.nextLine();
        try {
            mostrarFichero(name);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
