package temaX.ProgAvanzada.Lambda.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class ej5 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> new Random().nextInt(200);
        System.out.println(random.get());
    }
}
