package tema7.actividad1.ejercicio1;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static TelefonoMovil telefonoMovil = new TelefonoMovil();

    private static void addNewContact() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        if (telefonoMovil.addNewContact(new Contacto(nombre, telefono))) {
            System.out.println("Añadido con éxito");
        } else {
            System.out.println("Error, el contacto ya existe");
        }
    }

    private static void printContacts() {
        telefonoMovil.printContactos();
    }

    private static void updateContact() {
        System.out.print("Nombre del Contacto Actual: ");
        String nombreAnt = sc.nextLine();
        System.out.print("Telefono Actual: ");
        String telefonoAnt = sc.nextLine();
        Contacto antiguoContacto = new Contacto(nombreAnt, telefonoAnt);

        System.out.print("Nombre del Contacto Actualizado: ");
        String nombreNew = sc.nextLine();
        System.out.print("Telefono Actualizado: ");
        String tlfActualizado = sc.nextLine();
        Contacto nuevoContacto = new Contacto(nombreNew, tlfActualizado);

        if (telefonoMovil.updateContact(antiguoContacto, nuevoContacto)) {
            System.out.println("Actualización realizada con éxito");
        } else {
            System.out.println("Error, el contacto no existe");
        }
    }

    private static void removeContact() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        if (telefonoMovil.removeContact(new Contacto(nombre, telefono))) {
            System.out.println("Contacto eliminado con éxito");
        } else {
            System.out.println("Error, el contacto no existe");
        }
    }

    private static void findContactName() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        int index = telefonoMovil.findContactPorNombre(nombre);
        if (index != -1) {
            System.out.println("Contacto encontrado en la posición: " + index);
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    private static void findContactTlf() {
        System.out.print("Tlf: ");
        String tlf = sc.nextLine();
        int index = telefonoMovil.findContactPorTlf(tlf);
        if (index != -1) {
            System.out.println("Contacto encontrado en la posición: " + index);
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    private static void findContactClaves() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();
        int index = telefonoMovil.findContactPorClaves(new Contacto(nombre, telefono));
        if (index != -1) {
            System.out.println("Contacto encontrado en la posición: " + index);
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    private static void imprimirMenu() {
        System.out.println("""
                0. Salir
                1. Imprimir Contactos
                2. Agregar Contacto
                3. Actualizar Contacto
                4. Eliminar Contacto
                5. Buscar/Encontrar Contacto por Nombre
                6. Imprimir Opciones
                7. Buscar/Encontrar Contacto por Tlf
                8. Ordenar
                9. Borrar Todo
                10. Contar Contactos
                11. Buscar/Encontrar Contacto por Claves""");
    }

    public static void main(String[] args) {
        boolean continuar = true;
        int opcion = 0;
        imprimirMenu();

        while (continuar) {
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContactName();
                    break;
                case 6:
                    imprimirMenu();
                    break;
                case 7:
                    findContactTlf();
                case 8:
                    telefonoMovil.ordenar();
                    break;
                case 9:
                    telefonoMovil.borrarTodo();
                    break;
                case 10:
                    telefonoMovil.numeroContactos();
                    break;
                case 11:
                    findContactClaves();
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            System.out.println();
        }
    }
}