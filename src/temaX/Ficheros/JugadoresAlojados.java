package temaX.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JugadoresAlojados {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/jogadors.txt");
        File fA = new File("C:/ficheros/alojados.txt");

        try (Scanner sc = new Scanner(f)) {
            PrintWriter pw = new PrintWriter(fA);

            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] partes = linea.split(";");
                if (linea.contains("H")) {
                    System.out.println(partes[0] + " - " + partes[2]);
                    pw.println(partes[0] + " - " + partes[2]);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
