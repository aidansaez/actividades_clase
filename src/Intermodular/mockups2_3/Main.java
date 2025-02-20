package Intermodular.mockups2_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Nombre: [Aidan Sáez García]

public class Main {
    private static final ArrayList<Plato> platos = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);
    private static boolean datosValidos;

    private static String pedirIDPlato() {
        String idplato = "";

        do {
            try {
                System.out.print("Ingrese el ID del plato (máx. 15 caracteres): ");
                idplato = sc.next();
                if (idplato.length() > 15) {
                    throw new IllegalArgumentException("El ID del plato no puede exceder los 15 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        return idplato;
    }

    private static String pedirNombre() {
        String nombre = "";

        do {
            try {
                System.out.print("Ingrese el nombre del plato (máx. 20 caracteres): ");
                sc.nextLine();
                nombre = sc.nextLine();
                if (nombre.length() > 20) {
                    throw new IllegalArgumentException("El nombre del plato no puede exceder los 20 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        return nombre;
    }

    private static String pedirTipo() {
        String tipo = "";

        do {
            try {
                System.out.print("Ingrese el tipo de plato (máx. 20 caracteres): ");
                tipo = sc.nextLine();
                if (tipo.length() > 20) {
                    throw new IllegalArgumentException("El tipo de plato no puede exceder los 20 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        return tipo;
    }

    private static double pedirPrecio() {
        double precio = 0.0;

        do {
            try {
                System.out.print("Ingrese el precio del plato: ");
                precio = sc.nextDouble();
                sc.nextLine();
                if (precio < 0) {
                    throw new IllegalArgumentException("El precio no puede ser negativo.");
                }
                datosValidos = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Se esperaba un número para el precio.");
                sc.nextLine();
                datosValidos = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                datosValidos = false;
            }
        } while (!datosValidos);

        return precio;
    }

    private static String pedirDescripcion() {
        String descripcion = "";

        do {
            try {
                System.out.print("Ingrese la descripción del plato (máx. 50 caracteres): ");
                descripcion = sc.nextLine();
                if (descripcion.length() > 50) {
                    throw new IllegalArgumentException("La descripción no puede exceder los 50 caracteres.");
                }
                datosValidos = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
                datosValidos = false;
            }
        } while (!datosValidos);

        return descripcion;
    }

    private static boolean containsIDPlato(String idPlato) {
        for (int i = 0; i < platos.size(); i++) {
            Plato plato = platos.get(i);
            if (plato.getIdplato().equalsIgnoreCase(idPlato)) {
                return true;
            }
        }

        return false;
    }

    private static void addPlato() {
        String idplato;

        System.out.println("-- ➕ Agregar plato --");
        do {
            idplato = pedirIDPlato();
            if (containsIDPlato(idplato)) {
                System.out.println("❌ Error ese idplato ya esta contenido en la lista");
            }
        } while (containsIDPlato(idplato));

        String nombre = pedirNombre();
        String tipo = pedirTipo();
        double precio = pedirPrecio();
        String descripcion = pedirDescripcion();

        platos.add(new Plato(idplato, nombre, tipo, precio, descripcion));
        System.out.println("✅ Agregado con éxito");
    }

    private static void updatePlato() {
        String idplato;

        System.out.println("-- 🔄️ Actualizar plato --");
        System.out.println("Introduce a continuacion el idplato del plato a cambiar");
        do {
            idplato = pedirIDPlato();
            if (!containsIDPlato(idplato)) {
                System.out.println("❌ Error, ese plato no esta en la lista");
            }
        } while (!containsIDPlato(idplato));

        System.out.println("- Nuevos datos del plato -");
        String nombre = pedirNombre();
        String tipo = pedirTipo();
        double precio = pedirPrecio();
        String descripcion = pedirDescripcion();

        platos.set(findPlatoIDPlato(idplato), new Plato(idplato, nombre, tipo, precio, descripcion));
        System.out.println("🔄️ Plato actualizado con éxito");
    }

    private static void removePlato() {
        String idplato;

        System.out.println("-- 🗑️ Borrar plato --");
        System.out.println("Introduce a continuacion el idplato del plato a borrar");
        do {
            idplato = pedirIDPlato();
            if (!containsIDPlato(idplato)) {
                System.out.println("❌ Error, ese plato no esta en la lista");
            }
        } while (!containsIDPlato(idplato));

        platos.remove(findPlatoIDPlato(idplato));
        System.out.println("✅ Plato eliminado con éxito");
    }

    private static int findPlatoObjeto(Plato platoEncontrar) {
        if (platos.contains(platoEncontrar)) {
            return platos.indexOf(platoEncontrar);
        } else return -1;
    }

    private static int findPlatoIDPlato(String idplato) {
        for (int i = 0; i < platos.size(); i++) {
            Plato plato = platos.get(i);
            if (plato.getIdplato().equalsIgnoreCase(idplato)) {
                return i;
            }
        }

        return -1;
    }

    private static void findPlato() {
        int opc;
        String idplato;

        System.out.println("-- 🔎 Buscar Plato --");
        do {
            System.out.print("""
                1. Por clave (idplato)
                2. Por objeto
                Como quieres buscar al plato:""");

            opc = sc.nextInt();
            if (opc != 1 && opc != 2) {
                System.out.println("Error, opcion no encontrada");
            }
        } while (opc != 1 && opc != 2);

        if (opc == 1) {
            idplato = pedirIDPlato();
            System.out.println("El idplato: " + idplato + " esta en la posición " + findPlatoIDPlato(idplato));
        } else {
            do {
                idplato = pedirIDPlato();
                if (!containsIDPlato(idplato)) {
                    System.out.println("❌ Error, ese plato no esta en la lista");
                }
            } while (!containsIDPlato(idplato));

            String nombre = pedirNombre();
            String tipo = pedirTipo();
            double precio = pedirPrecio();
            String descripcion = pedirDescripcion();

            System.out.println("El plato se encuentra en la posicion: " + findPlatoObjeto(new Plato(idplato, nombre, tipo, precio, descripcion)));
        }
    }

    private static Plato queryPlato(String idplato) {
        for (int i = 0; i < platos.size(); i++) {
            Plato plato = platos.get(i);
            if (plato.getIdplato().equalsIgnoreCase(idplato)) {
                return plato;
            }
        }

        return new Plato(null, null, null, null, null);
    }

    private static void printPlatos() {
        System.out.println("-- 🍽️ Platos --");
        if (!platos.isEmpty())  {
            for (int i = 0; i < platos.size(); i++) {
                Plato plato = platos.get(i);
                System.out.println(i + ". - " + plato);
            }
        } else System.out.println("No hay platos.");

    }

    private static void printMenu() {
        System.out.println("""
                0. 🖨️ Mostrar menu
                1. ➕ Insertar plato
                2. 🗑️ Eliminar plato
                3. 🔄️ Actualizar plato
                4. 🔎 Consultar plato
                5. 🍽️ Imprimir lista de platos
                6. 💨 Salir
                """);
    }

    public static void main(String[] args) {
        int opc;
        boolean seguir = true;
        printMenu();

        do {
            do {
                System.out.print("Elige una opción: ");
                opc = sc.nextInt();

                if (opc < 0 || opc > 6) {
                    System.out.println("Error, esa opción no existe");
                }
            } while (opc < 0 || opc > 6);

            switch (opc) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    addPlato();
                    break;
                case 2:
                    removePlato();
                    break;
                case 3:
                    updatePlato();
                    break;
                case 4:
                    findPlato();
                    break;
                case 5:
                    printPlatos();
                    break;
                case 6:
                    seguir = false;
                default:
                    System.out.println("Error, opción no válida");
            }
            System.out.println();
        } while (seguir);
    }
}