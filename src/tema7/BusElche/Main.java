package tema7.BusElche;

import java.util.*;

public class Main {
    static Map<Parada, Integer> tiempo = new HashMap<>();
    static Map<Linea, Parada> elcheBus = new HashMap<>();
    static Set<Parada> paradas = new HashSet<>();
    public static final Scanner sc = new Scanner(System.in);
    public static Parada buscarParada(int pi) {
        Parada paradaini = null;
        for (Parada p : paradas) {
            if (p.getNumero() == pi) {
                paradaini = p;
            }
        }

        return paradaini;
    }
    public static void main(String[] args) {
        Linea a = new Linea("A");
        Parada p001 = new Parada(1, "Doctor Caro", "C/ Doctor Caro");
        Parada p002 = new Parada(2, "Vicente Blasco Ibáñez, 22", "C/Vicente Blasco Ibáñez");
        Parada p003 = new Parada(3, "Vicente Blasco Ibánez, 80", "C/Vicente Blasco Ibáñez");
        Parada p004 = new Parada(4, "Inem Carrús", "C/Pedro Moreno Sastre");
        Parada p005 = new Parada(5, "Pedro Moreno Sastre, 62", "C/Pedro Moreno Sastre");
        paradas.add(p001);
        paradas.add(p002);
        paradas.add(p003);
        paradas.add(p004);
        paradas.add(p005);

        for (Parada parada : Arrays.asList(p001, p002, p003, p004, p005)) {
            elcheBus.put(a, parada);
        }

        tiempo.put(p001, 75);
        tiempo.put(p002, 60);
        tiempo.put(p003, 40);
        tiempo.put(p004, 50);
        tiempo.put(p005, 80);

        System.out.print("Elige la parada inicial: ");
        int pi = sc.nextInt();

        System.out.println("Que linea (A - I - J - F");
        System.out.println("Has elegido " + buscarParada(pi));
        for (Parada p : elcheBus.values()) {
            if (p.getNumero() == pi) {
                System.out.println(elcheBus.keySet());
            }
            System.out.println(p);
        }
    }
}
