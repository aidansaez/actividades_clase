package Intermodular.mockups1;

import java.util.InputMismatchException;
import java.util.Scanner;

// Nombre: [Aidan Sáez García]
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String idplato = "", nombre = "", tipo = "", descripcion = "";
        double precio = 0;
        boolean datosValidos;

        do {
            try {
                System.out.print("Ingrese el ID del plato (máx. 15 caracteres): ");
                idplato = scanner.nextLine();
                if (idplato.length() > 15) {
                    throw new IllegalArgumentException("El ID del plato no puede exceder los 15 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        do {
            try {
                System.out.print("Ingrese el nombre del plato (máx. 20 caracteres): ");
                nombre = scanner.nextLine();
                if (nombre.length() > 20) {
                    throw new IllegalArgumentException("El nombre del plato no puede exceder los 20 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        do {
            try {
                System.out.print("Ingrese el tipo de plato (máx. 20 caracteres): ");
                tipo = scanner.nextLine();
                if (tipo.length() > 20) {
                    throw new IllegalArgumentException("El tipo de plato no puede exceder los 20 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        do {
            try {
                System.out.print("Ingrese el precio del plato: ");
                precio = scanner.nextDouble();
                scanner.nextLine();
                if (precio < 0) {
                    throw new IllegalArgumentException("El precio no puede ser negativo.");
                }
                datosValidos = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número para el precio.");
                scanner.nextLine();
                datosValidos = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        do {
            try {
                System.out.print("Ingrese la descripción del plato (máx. 50 caracteres): ");
                descripcion = scanner.nextLine();
                if (descripcion.length() > 50) {
                    throw new IllegalArgumentException("La descripción no puede exceder los 50 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
                datosValidos = false;
            }
        } while (!datosValidos);

        // Creación del objeto Plato
        Plato plato = new Plato(idplato, nombre, tipo, precio, descripcion);

        System.out.println("\nPlato creado exitosamente:");
        System.out.println(plato);
    }
}
