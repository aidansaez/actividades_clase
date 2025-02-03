package tema6.actividad5.ejericicio7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante(170, 12, "Patri"),
                new Estudiante(173, 43, "Manuel"),
                new Estudiante(189, 72, "Javier"),
                new Estudiante(168, 52, "Alicia"),
                new Estudiante(189, 35, "Albero")
        };

        System.out.println("Sin ordenar");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }

        Arrays.sort(estudiantes);
        System.out.println("Ordenados");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}
