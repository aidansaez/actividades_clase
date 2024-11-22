package tema3.actividadAdicional;

import java.util.Scanner;

public class dni {
    public static boolean sonDigitos(String dni) {
        for (int i = 0; i < dni.length(); i++) { // cuenta la longitud y no termina hasta que termine la longitud
            if (!Character.isDigit(dni.charAt(i))) { // comprueba caracter a caracter para comprobar si es un digito, en caso de ser una letra devuelve falso
                return false;
            }
        }
        return true; // si no ha dado falso da verdadero
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- CALCULADORA DE LETRA DNI --");
        System.out.print("DNI (8 digitos): ");
        String x = sc.nextLine();

        while (x.length() != 8 || !sonDigitos(x)) { // Si no es tiene exactamente 8 digitos o tiene alguna letra o algo que no sea un digito vuelve a preguntar
            System.out.print("DNI (8 digitos): ");
            x = sc.nextLine();
        }
        int num = Integer.parseInt(x);
        String letra = "";
        int division = num % 23;

        switch (division) {
            case 0: letra = "T"; break;
            case 1: letra = "R"; break;
            case 2: letra = "W"; break;
            case 3: letra = "A"; break;
            case 4: letra = "G"; break;
            case 5: letra = "M"; break;
            case 6: letra = "Y"; break;
            case 7: letra = "F"; break;
            case 8: letra = "P"; break;
            case 9: letra = "D"; break;
            case 10: letra = "X"; break;
            case 11: letra = "B"; break;
            case 12: letra = "N"; break;
            case 13: letra = "J"; break;
            case 14: letra = "Z"; break;
            case 15: letra = "S"; break;
            case 16: letra = "Q"; break;
            case 17: letra = "V"; break;
            case 18: letra = "H"; break;
            case 19: letra = "L"; break;
            case 20: letra = "C"; break;
            case 21: letra = "K"; break;
            case 22: letra = "E"; break;
        }

        System.out.println("Tu DNI es: " + x + " - " + letra);
    }
}