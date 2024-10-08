package tema2.actividad1;

import java.util.Scanner;

public class act1_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Eres el propietario de la maquina? (true or false) ");
        boolean isOwner = scan.nextBoolean();

        if (isOwner) {
            System.out.println("Hola bienvenido al sistema");
        } else {
            System.out.println("No eres bienvenido");
        }
    }
}
