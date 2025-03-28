package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class act5 {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/palabras.txt");
        File fOrdered = new File("C:/ficheros/palabrasordenadas.txt");
        try {
            PrintWriter pw = new PrintWriter(fOrdered);
            Scanner entrada = new Scanner(f);
            ArrayList<String> lineas = new ArrayList<>();
            while (entrada.hasNextLine()) {
                lineas.add(entrada.nextLine());
            }
            Collections.sort(lineas);
            System.out.println(lineas);
            for (String l : lineas) {
                pw.println(l);
            }

            entrada.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        }
    }
}
