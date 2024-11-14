package tema4.actividadAdicional;

import java.util.Scanner;

public class ElCerdo {
    public static boolean letra(String name, int pos) {
        return !Character.isLetter(name.charAt(pos));
    }
    public static int contador_(String name) {
        int num = 0;
        for (int i = 0; i < name.length(); i++) {
            String c = String.valueOf(name.charAt(i));
            if (c.equals("_")) {
                num++;
            }
        }
        return num;
    }
    public static boolean guionBajoSeguido(String name) {
        int n = name.indexOf("_") + 1;
        String caracter = String.valueOf(name.charAt(n));
        return caracter.equals("_");
    }
    public static int random(int x) {
        return 1 + (int) (Math.random() * x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Juego del Cerdo --");
        System.out.print("Nombre del Jugador: ");
        String name = sc.nextLine();

        while (name.length() > 30 || letra(name, 0) || letra(name, (name.length() - 1)) || contador_(name) > 2 || guionBajoSeguido(name)) {
            System.out.print("Nombre del Jugador: ");
            name = sc.nextLine();
        }

        int puntIA = 0;
        int punttempIA1;
        int punttempIA2 = 0;
        int puntJ = 0;
        int punttempJ1;
        int punttempJ2 = 0;
        String sn = "S";

        while (sn.equalsIgnoreCase("S")) {
            while (puntIA < 50 && puntJ < 50) {
                int dadoJ;
                String pcJ = "C";
                System.out.println("Turno de " + name);
                while (pcJ.equalsIgnoreCase("C")) {
                    punttempJ1 = 0;
                    dadoJ = random(6);
                    System.out.println("Has sacado un " + dadoJ);

                    if (dadoJ != 6) {
                        punttempJ1 += dadoJ;
                    } else {
                        punttempJ2 = 0;
                        break;
                    }

                    punttempJ2 += punttempJ1;

                    System.out.print("Que quieres hacer (P)lantarte o (C)ontinuar: ");
                    pcJ = sc.nextLine();

                    while (!(pcJ.equalsIgnoreCase("P") || pcJ.equalsIgnoreCase("C"))) {
                        System.out.println("Error, caracter no valido");
                        System.out.print("Que quieres hacer (P)lantarte o (C)ontinuar: ");
                        pcJ = sc.nextLine();
                    }
                }

                puntJ += punttempJ2;
                System.out.println("Has acumulado " + puntJ + " puntos este turno.");
                punttempJ2 = 0;

                int dadoIA;

                String pcIA = "C";
                System.out.println("Turno de la IA");
                while (pcIA.equalsIgnoreCase("C")) {
                    punttempIA1 = 0;
                    dadoIA = random(6);
                    System.out.print("He sacado un " + dadoIA + ". ");

                    if (dadoIA != 6) {
                        punttempIA1 += dadoIA;
                    } else {
                        punttempIA2 = 0;
                        break;
                    }

                    punttempIA2 += punttempIA1;

                    if (punttempIA2 >= 10) {
                        System.out.println("Me planto");
                        pcIA = "P";
                    } else System.out.println("Voy a continuar");
                }

                puntIA += punttempIA2;
                System.out.println("La IA ha hecho " + puntIA + " puntos este turno.");
                punttempIA2 = 0;

                System.out.println("La puntuación total es " + name + " " + puntJ + " - " + puntIA + " IA");
            }
            if (puntJ >= 50) {
                System.out.println("Ha ganado " + name + "!!!!");
            } else if (puntIA >= 50) {
                System.out.println("Ha ganado la IA!!!!");
            } else System.out.println("Empate");
            System.out.print("Quieres seguir jugando? (S/n): ");
            sn = sc.nextLine();
            puntJ = 0;
            puntIA = 0;
        }
    }
}
