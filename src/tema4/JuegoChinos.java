package tema4;
import java.util.Scanner;

public class JuegoChinos {
    public static int random(int x) {
        return 1 + (int) (Math.random() * x);
    }
    public static void main(String[] args) {
        int ia = 0;
        int j = 0;
        while (j < 5 || ia < 5) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Escoge las monedas (0 - 3): ");
            int monedasJ = sc.nextInt();

            while (monedasJ < 0 || monedasJ > 3) {
                System.out.print("Escoge las monedas (0 - 3): ");
                monedasJ = sc.nextInt();
            }

            int monedasIA = random(3);
            int suma = monedasJ + monedasIA;

            System.out.print("Cuantas monedas crees que sumáis: ");
            int apuestaJ = sc.nextInt();
            int apuestaIA = random(6);

            while (apuestaIA == apuestaJ) {
                apuestaIA = random(6);
            }

            if (apuestaJ == suma) {
                System.out.println("Ganador de la ronda: Jugador");
                j++;
            } else if (apuestaIA == suma) {
                System.out.println("Ganador de la ronda: IA");
                ia++;
            } else System.out.println("Empate, ninguno acertó.");
        }
    }
}
