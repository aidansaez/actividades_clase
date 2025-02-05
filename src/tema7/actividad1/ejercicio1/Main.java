package tema7.actividad1.ejercicio1;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final TelefonoMovil telefonoMovil = new TelefonoMovil();

    private static boolean validarTlf(String tlf) {
        if (tlf.isEmpty() || tlf.length() > 9) {
            return false;
        } else return tlf.matches("\\d+");
    }

    private static boolean validarNombre(String nombre) {
        return !nombre.isEmpty() && nombre.matches("^[A-Za-z].*");
    }

    private static String pedirNombre() {
        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = sc.next();
            if (!validarNombre(nombre)) {
                System.out.println("⚠️ Error: El nombre debe comenzar con una letra");
            }
        } while (!validarNombre(nombre));

        return nombre;
    }

    private static String pedirTlf() {
        String tlf;
        do {
            System.out.print("Telefono: ");
            tlf = sc.next();
            if (!validarTlf(tlf)) {
                System.out.println("⚠️ Error: El teléfono debe contener 9 numeros o menos");
            }
        } while (!validarTlf(tlf));

        return tlf;
    }

    private static void addNewContact() {
        String nombre = pedirNombre();
        String telefono = pedirTlf();

        if (telefonoMovil.addNewContact(new Contacto(nombre, telefono))) {
            System.out.println("✅ Añadido con éxito");
        } else {
            System.err.println("❌ Error, el contacto ya existe");
        }
    }

    private static void printContacts() {
        telefonoMovil.printContactos();
    }

    private static void updateContact() {
        System.out.println("🔄 Actualizar Contacto");

        System.out.println("\n📌 Introduce los datos actuales:");
        String nombreAnt = pedirNombre();
        String telefonoAnt = pedirTlf();

        Contacto antiguoContacto = new Contacto(nombreAnt, telefonoAnt);

        System.out.println("\n✏️ Introduce los datos nuevos:");
        String nombreNew = pedirNombre();
        String telefonoNew = pedirTlf();

        Contacto nuevoContacto = new Contacto(nombreNew, telefonoNew);

        if (telefonoMovil.updateContact(antiguoContacto, nuevoContacto)) {
            System.out.println("✅ Actualización realizada con éxito.");
        } else {
            System.err.println("❌ Error, el contacto no existe.");
        }
    }

    private static void removeContact() {
        String nombre = pedirNombre();
        String telefono = pedirTlf();

        if (telefonoMovil.removeContact(new Contacto(nombre, telefono))) {
            System.out.println("✅ Contacto eliminado con éxito");
        } else {
            System.err.println("❌ Error, el contacto no existe");
        }
    }

    private static void findContactName() {
        String nombre = pedirNombre();
        int index = telefonoMovil.findContactPorNombre(nombre);
        if (index != -1) {
            System.out.println("✅ Contacto encontrado en la posición: " + index);
        } else {
            System.err.println("❌ Contacto no encontrado");
        }
    }

    private static void findContactTlf() {
        String tlf = pedirTlf();
        int index = telefonoMovil.findContactPorTlf(tlf);
        if (index != -1) {
            System.out.println("✅ Contacto encontrado en la posición: " + index);
        } else {
            System.out.println("❌ Contacto no encontrado");
        }
    }

    private static void findContactClaves() {
        String nombre = pedirNombre();
        String telefono = pedirTlf();

        int index = telefonoMovil.findContactPorClaves(new Contacto(nombre, telefono));
        if (index != -1) {
            System.out.println("✅ Contacto encontrado en la posición: " + index);
        } else {
            System.out.println("❌ Contacto no encontrado");
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
        int opcion;
        imprimirMenu();

        while (continuar) {
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();


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