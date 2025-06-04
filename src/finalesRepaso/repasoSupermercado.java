package finalesRepaso;

import temaX.ProgAvanzada.Generico.Set;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class repasoSupermercado {
    public static void main(String[] args) {
        Map<String, Producto> catalogo = new HashMap<>();
        catalogo.put("avena", new Producto("avena", 2.21));
        catalogo.put("garbanzos", new Producto("garbanzos", 2.39));
        catalogo.put("tomate", new Producto("tomate", 1.59));
        catalogo.put("jengibre", new Producto("jengibre", 3.13));
        catalogo.put("quinoa", new Producto("quinoa", 4.50));
        catalogo.put("guisantes", new Producto("guisantes", 1.60));

        Map<Producto, Integer> compra = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Producto: ");
        String producto = sc.nextLine().toLowerCase();

        while (!producto.equalsIgnoreCase("fin")) {
            if (catalogo.containsKey(producto)) {
                Producto producto1 = catalogo.get(producto);

                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                compra.put(producto1, compra.getOrDefault(producto1, 0) + cantidad);

                System.out.print("Producto: ");
                producto = sc.nextLine().toLowerCase();
            } else if (!catalogo.containsKey(producto) && !producto.equalsIgnoreCase("fin")) {
                System.out.println("Nombre de producto incorrecto, vuelva a intentar");
                System.out.print("Producto: ");
                producto = sc.nextLine().toLowerCase();
            }
        }

        System.out.println("Producto    Precio  Cantidad    Subtotal");
        double c = 0;

        for (Producto p : compra.keySet()) {
            int cantidad = compra.get(p);
            System.out.println(p.getNombre()+ "    " + p.getPrecio()+"  " + cantidad + "     " + p.getPrecio() * cantidad);
            c += p.getPrecio() * cantidad;
        }
        System.out.println("--------------------------------");
        System.out.println("                    Total: " + c);

        File f = new File("C:/ficheros/ticket.txt");
        try (PrintWriter pw = new PrintWriter(f)) {
            pw.println("Producto   Precio   Cantidad Subtotal");
            pw.println("----------------------------------------");
            for (Producto p : compra.keySet()) {
                int cantidad = compra.get(p);
                pw.println(p.getNombre()+ "    " + p.getPrecio()+"  " + cantidad + "     " + p.getPrecio() * cantidad);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
