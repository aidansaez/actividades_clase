package Intermodular;

import java.util.InputMismatchException;
import java.util.Scanner;

// Nombre: [Tu Nombre y Apellidos]
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plato plato = null;
        String idplato, nombre, tipo, descripcion;
        double precio;

        while (true) {
            try {
                System.out.print("Ingrese el ID del plato (máx. 15 caracteres): ");
                idplato = scanner.nextLine();
                if (idplato.length() > 15) {
                    throw new IllegalArgumentException("El ID del plato no puede exceder los 15 caracteres.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el nombre del plato (máx. 20 caracteres): ");
                nombre = scanner.nextLine();
                if (nombre.length() > 20) {
                    throw new IllegalArgumentException("El nombre del plato no puede exceder los 20 caracteres.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el tipo de plato (máx. 20 caracteres): ");
                tipo = scanner.nextLine();
                if (tipo.length() > 20) {
                    throw new IllegalArgumentException("El tipo de plato no puede exceder los 20 caracteres.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese el precio del plato: ");
                precio = scanner.nextDouble();
                scanner.nextLine(); // Limpiar buffer
                if (precio < 0) {
                    throw new IllegalArgumentException("El precio no puede ser negativo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número para el precio.");
                scanner.nextLine(); // Limpiar entrada incorrecta
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Ingrese la descripción del plato (máx. 50 caracteres): ");
                descripcion = scanner.nextLine();
                if (descripcion.length() > 50) {
                    throw new IllegalArgumentException("La descripción no puede exceder los 50 caracteres.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Creación del objeto Plato
        plato = new Plato(descripcion, idplato, nombre, precio, tipo);
        scanner.close();

        System.out.println("\nPlato creado exitosamente:");
        System.out.println(plato);
    }
}
