package temaX.ProgAvanzada.Lambda.Supplier;

import java.util.HashMap;
import java.util.function.Supplier;

public class ej6 {
    public static void main(String[] args) {
        Supplier<HashMap<String, String>> crearMapa = () -> new HashMap<>();
        HashMap<String, String> map = crearMapa.get();
        map.put("1", "Uno");
        map.put("2", "Dos");
        map.put("3", "Tres");
        System.out.println(map);
    }
}
