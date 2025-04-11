package ProgAvanzada.Lambda.Supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class ej11 {
    public static void main(String[] args) {
        Supplier<LocalDate> fecha = () -> LocalDate.now();
        System.out.println(fecha.get());
    }
}
