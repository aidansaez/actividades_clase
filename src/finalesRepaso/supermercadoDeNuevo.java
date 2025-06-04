package finalesRepaso;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class supermercadoDeNuevo {
    public static void main(String[] args) {
        Map<String, Producto> catalogo = new HashMap<>();
        catalogo.put("avena", new Producto("avena", 2.21));
        catalogo.put("garbanzos", new Producto("garbanzos", 2.39));
        catalogo.put("tomate", new Producto("tomate", 1.59));
        catalogo.put("jengibre", new Producto("jengibre", 3.13));
        catalogo.put("quinoa", new Producto("quinoa", 4.5));
        catalogo.put("guisantes", new Producto("guisantes", 1.6));

        Map<Producto, Integer> carrito = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Producto: ");
        String nombreProducto = sc.nextLine();

        while (!nombreProducto.equalsIgnoreCase("fin")) {
            if (catalogo.containsKey(nombreProducto)) {
                System.out.println("Cantidad: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                Producto p = catalogo.get(nombreProducto);

                carrito.put(p, carrito.getOrDefault(p, 0) + cantidad);

                System.out.println("Producto: ");
                nombreProducto = sc.nextLine();
            } else if (!catalogo.containsKey(nombreProducto) && !nombreProducto.equalsIgnoreCase("fin")) {
                System.out.println("Nombre de producto incorrecto");
                System.out.println("Producto: ");
                nombreProducto = sc.nextLine();
            }
        }

        for (Producto p : carrito.keySet()) {
            ;
        }
    }
}
