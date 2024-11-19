package tema4.parte1.actividadAdicional;
import java.util.Scanner;

public class JuegoChinos {
    public static int random(int x) {
        return 1 + (int) (Math.random() * x); // numero random de 0 a x
    }
    public static int Jugador(int x, String text) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.print(text + "(0 - " + x + "): ");
        num = sc.nextInt();

        while (num < 0 || num > x) { // mientrás que el numero de que elija no este en el rango de 0 - x sigue preguntando
            System.out.print(text + "(0 - " + x + "): ");
            num = sc.nextInt();
        }

        return num;
    }
    public static void main(String[] args) {
        System.out.println("-- Juego de los Chinos --");
        int ia = 0, j = 0, c = 2;

        while (j < 5 && ia < 5) { // mientras los dos tengan una puntuación menor que cinco sigue
            int monedasIA, monedasJ;

            if (c % 2 == 0) { // en cada ronda empieza uno
                monedasJ = Jugador(3, "Escoge las monedas ");
                monedasIA = random(3);
            } else {
                monedasIA = random(3);
                monedasJ = Jugador(3, "Escoge las monedas ");
            }

            c++;
            int suma = monedasJ + monedasIA; // suma de las monedas de los dos

            int apuestaJ = Jugador(6, "Cuantas monedas crees que sumais ");
            int apuestaIA = random(6);

            while (apuestaIA == apuestaJ || apuestaIA < monedasIA || apuestaIA > (monedasIA + 3)) { // si la apuesta de la ia es la misma que la del jugador la vuelve a hacer de nuevo, si la apuesta de la ia es menor que las monedas que tiene la ia la vuelve a hacer, si la apuesta de la ia es mayor que las monedas que tiene +3 la vuelve a hacer
                apuestaIA = random(6);
            }

            System.out.println("El jugador escogio " + monedasJ + " monedas, y aposto " + apuestaJ);
            System.out.println("La IA escogio " + monedasIA + " monedas, y aposto " + apuestaIA);

            if (apuestaJ == suma) {
                System.out.println("Ganador de la ronda: Jugador");
                j++;
            } else if (apuestaIA == suma) {
                System.out.println("Ganador de la ronda: IA");
                ia++;
            } else System.out.println("Empate, ninguno acertó.");
            System.out.println("Jugador " + j +  " - " + ia + " IA");

            if (j == 5) System.out.println("El jugador ha ganado la serie de partidas. Enhorabuena!!!"); // si alguno de los 2 llega a 5 gana
            if (ia == 5) System.out.println("La IA ha ganado la serie de partidas. Enhorabuena!!!");
        }
    }
}