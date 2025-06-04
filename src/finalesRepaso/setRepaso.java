package finalesRepaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setRepaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        boolean seguir = true;
        File f = new File("C:/ficheros/joseAndres.txt");


        while (seguir) {

            System.out.println("""
                    1. Mostrar Fichero""");
            System.out.print("Elige una opción: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 0:
                    seguir = false;
                case 1:
                    try {
                        Scanner entrada = new Scanner(f);
                        Set<String> set = new HashSet<>();
                        while (entrada.hasNextLine()) {
                            System.out.println(entrada.nextLine());
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
            }
        }
    }
}
