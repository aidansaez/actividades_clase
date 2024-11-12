package tema4;
import java.util.Scanner;

public class JuegoChinos {
    public static int random(int x) {
        return 1 + (int) (Math.random() * x);
    }
    public static int monedasJugador() {
        int monedasJ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Escoge las monedas (0 - 3): ");
        monedasJ = sc.nextInt();

        while (monedasJ < 0 || monedasJ > 3) {
            System.out.print("Escoge las monedas (0 - 3): ");
            monedasJ = sc.nextInt();
        }

        return monedasJ;
    }
    public static void main(String[] args) {
        int ia = 0;
        int j = 0;
        int c = 2;
        while (j < 5 && ia < 5) {
            Scanner sc = new Scanner(System.in);
            int monedasIA, monedasJ;

            if (c % 2 == 0) {
                monedasJ = monedasJugador();
                monedasIA = random(3);
            } else {
                monedasIA = random(3);
                monedasJ = monedasJugador();
            }

            c++;
            int suma = monedasJ + monedasIA;

            System.out.print("Cuantas monedas crees que sumáis: ");
            int apuestaJ = sc.nextInt();
            int apuestaIA = random(6);

            while (apuestaIA == apuestaJ || apuestaIA < monedasIA || apuestaIA > (monedasIA + 3)) {
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

            if (j == 5) System.out.println("El jugador ha ganado la serie de partidas. Enhorabuena!!!");
            if (ia == 5) System.out.println("La IA ha ganado la serie de partidas. Enhorabuena!!!");
        }
    }
}
