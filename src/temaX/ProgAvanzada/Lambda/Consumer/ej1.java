package temaX.ProgAvanzada.Lambda.Consumer;

import java.util.function.Consumer;

public class ej1 {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        print.accept("Estoy en clase de programación");
    }
}
