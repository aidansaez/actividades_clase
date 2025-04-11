package ProgAvanzada.Lambda.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ej3 {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        Consumer<String> print = s -> System.out.println(s.substring(s.length() - 1));

        miLista.add("Hola");
        miLista.add("Mundo");
        miLista.add("Java");
        miLista.add("Programación");
        miLista.add("Desarrollo");
        miLista.add("Web");
        miLista.add("Backend");
        miLista.add("Frontend");
        miLista.add("Base de datos");
        miLista.add("API");

        miLista.forEach(print);
    }
}
