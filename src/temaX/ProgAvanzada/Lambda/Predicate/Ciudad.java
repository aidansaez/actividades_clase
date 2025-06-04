package temaX.ProgAvanzada.Lambda.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ciudad {
    private String nombre;
    private int numeroHab;
    public Ciudad(String nombre, int numeroHab) {
        this.nombre = nombre;
        this.numeroHab = numeroHab;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", numeroHab=" + numeroHab +
                '}';
    }

    public static void main(String[] args) {
        List<Ciudad> list = new ArrayList<>();
        list.add(new Ciudad("Luis", 1));
        list.add(new Ciudad("Cox", 5000));
        list.add(new Ciudad("Albacete", 2000));
        list.add(new Ciudad("Eranada", 500000));
        list.add(new Ciudad("Valencia", 1000000));
        list.add(new Ciudad("Eadrid", 5000000));
        list.add(new Ciudad("Barcelona", 3000000));
        list.add(new Ciudad("Catarroja", 30000));
        list.add(new Ciudad("Elche", 99000));
        list.add(new Ciudad("L'eliana", 10000));
        list.add(new Ciudad("Luis", 5000));

        Predicate<Ciudad> grande = ciudad -> ciudad.numeroHab >= 100000 && ciudad.nombre.startsWith("E") || ciudad.nombre.startsWith("e");
        printList(list, grande);

    }

    public static void printList(List<Ciudad> list, Predicate<Ciudad> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }
}
