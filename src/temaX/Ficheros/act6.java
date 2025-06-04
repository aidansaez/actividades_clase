package temaX.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class act6 {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/palabras.txt");
        try {
            Scanner entrada = new Scanner(f);
            int voc = 0, con = 0, num = 0;

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();

                for (int i = 0; i < linea.length(); i++) {
                    char c = linea.charAt(i);
                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        voc++;
                    } else if (Character.isLetter(c)) {
                        con++;
                    } else if (Character.isDigit(c)) {
                        num++;
                    }
                }
            }
            System.out.println("vocales: " + voc);
            System.out.println("consonantes: " + con);
            System.out.println("num: " + num);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
