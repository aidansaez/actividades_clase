package finalesRepaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class repasoSupermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Producto> catalogo = new HashMap<>();
        Map<Producto, Integer> compra = new LinkedHashMap<>();

        // Catálogo inicial
        catalogo.put("avena", new Producto("avena", 2.21));
        catalogo.put("garbanzos", new Producto("garbanzos", 2.39));
        catalogo.put("tomate", new Producto("tomate", 1.59));
        catalogo.put("jengibre", new Producto("jengibre", 3.13));
        catalogo.put("quinoa", new Producto("quinoa", 4.50));
        catalogo.put("guisantes", new Producto("guisantes", 1.60));

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Añadir producto");
            System.out.println("3. Modificar precio");
            System.out.println("4. Comprar productos");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nCatálogo de productos:");
                    for (Producto p : catalogo.values()) {
                        System.out.println("- " + p.getNombre() + " : " + p.getPrecio() + " €");
                    }
                    break;

                case 2:
                    System.out.print("Nombre del nuevo producto: ");
                    String nuevoNombre = sc.nextLine().toLowerCase();
                    if (catalogo.containsKey(nuevoNombre)) {
                        System.out.println("Ya existe ese producto.");
                    } else {
                        System.out.print("Precio: ");
                        double nuevoPrecio = sc.nextDouble();
                        sc.nextLine();
                        catalogo.put(nuevoNombre, new Producto(nuevoNombre, nuevoPrecio));
                        System.out.println("Producto añadido.");
                    }
                    break;

                case 3:
                    System.out.print("Producto a modificar: ");
                    String modNombre = sc.nextLine().toLowerCase();
                    if (catalogo.containsKey(modNombre)) {
                        System.out.print("Nuevo precio: ");
                        double nuevoPrecio = sc.nextDouble();
                        sc.nextLine();
                        catalogo.get(modNombre).setPrecio(nuevoPrecio);
                        System.out.println("Precio actualizado.");
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 4:
                    compra.clear();
                    String producto;
                    System.out.print("Producto (o 'fin' para terminar): ");
                    producto = sc.nextLine().toLowerCase();

                    while (!producto.equals("fin")) {
                        if (catalogo.containsKey(producto)) {
                            Producto p = catalogo.get(producto);
                            System.out.print("Cantidad: ");
                            int cantidad = sc.nextInt();
                            sc.nextLine();

                            compra.put(p, compra.getOrDefault(p, 0) + cantidad);
                        } else {
                            System.out.println("Producto no existe.");
                        }
                        System.out.print("Producto (o 'fin' para terminar): ");
                        producto = sc.nextLine().toLowerCase();
                    }

                    // Código descuento
                    System.out.print("Introduce un código de descuento: ");
                    String codigo = sc.nextLine();
                    boolean descuento = codigo.equals("PROMOECO");

                    // Mostrar ticket
                    System.out.println("\nProducto    Precio  Cantidad  Subtotal");
                    double total = 0;
                    for (Producto p : compra.keySet()) {
                        int cant = compra.get(p);
                        double subtotal = p.getPrecio() * cant;
                        System.out.printf("%-10s  %.2f    %3d      %.2f%n", p.getNombre(), p.getPrecio(), cant, subtotal);
                        total += subtotal;
                    }

                    System.out.println("----------------------------------------");
                    if (descuento) {
                        System.out.printf("Descuento aplicado: %.2f%n", total * 0.1);
                        System.out.println("Total sin descuento: " + total);
                        total *= 0.9;
                    }
                    System.out.printf("TOTAL: %.2f €%n", total);

                    // Guardar en fichero
                    File f = new File("C:/ficheros/ticket.txt");
                    try (PrintWriter pw = new PrintWriter(f)) {
                        pw.println("Producto  Precio  Cantidad  Subtotal");
                        pw.println("----------------------------------------");
                        for (Producto p : compra.keySet()) {
                            int cant = compra.get(p);
                            double subtotal = p.getPrecio() * cant;
                            pw.printf("%-10s %.2f    %3d     %.2f%n", p.getNombre(), p.getPrecio(), cant, subtotal);
                        }
                        pw.println("----------------------------------------");
                        if (descuento) {
                            pw.printf("Descuento aplicado: %.2f%n", total * 0.1 / 0.9);
                            pw.printf("Total sin descuento: %.2f%n", total / 0.9);
                        }
                        pw.printf("TOTAL: %.2f €%n", total);
                    } catch (FileNotFoundException e) {
                        System.out.println("Error al guardar el ticket.");
                    }

                    break;

                case 5:
                    System.out.println("Gracias por usar el programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }
}
