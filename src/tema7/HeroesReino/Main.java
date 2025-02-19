package tema7.HeroesReino;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void addHeroe(ArrayList<Heroe> heroes, ArrayList<Arma> armas) {
        int opcMenu;
        System.out.println("\n-- ➕ Añadir Heroe --");

        do {
            System.out.println("""
                       Tipos de heroe:
                       1. Guerrero
                       2. Mago
                       3. Arquero
                       4. Asesino""");
            System.out.print("Elige una opción: ");
            opcMenu = sc.nextInt();
        } while (opcMenu < 1 || opcMenu > 4);

        sc.nextLine(); // Limpiar Buffer
        System.out.print("Nombre del Guerrero: ");
        String nombre = sc.nextLine();
        System.out.print("Nivel: ");
        int nivel = sc.nextInt();
        System.out.print("Vida: ");
        int vida = sc.nextInt();
        Arma arma = null;

        switch (opcMenu) {
            case 1:
                System.out.print("Fuerza: ");
                int fuerza = sc.nextInt();
                arma = elegirArma(armas);
                heroes.add(new Guerrero(nombre, nivel, vida, arma, fuerza));
                break;
            case 2:
                System.out.print("Maná: ");
                int mana = sc.nextInt();
                arma = elegirArma(armas);
                heroes.add(new Mago(nombre, nivel, vida, arma, mana));
                break;
            case 3:
                System.out.print("Precision: ");
                int precision = sc.nextInt();
                arma = elegirArma(armas);
                heroes.add(new Arquero(nombre, nivel, vida, arma, precision));
                break;
            case 4:
                System.out.print("Sigilo: ");
                int sigilo = sc.nextInt();
                arma = elegirArma(armas);
                heroes.add(new Asesino(nombre, nivel, vida, arma, sigilo));
                break;
            default:
                System.out.println("Error");
        }

        if (arma != null) {
            System.out.println(nombre + " ha sido añadido al gremio con su " + arma.nombreArma + "!");
        } else System.out.println(nombre + " ha sido añadido al gremio sin arma!");

        System.out.println("---------------------\n");
    }
    public static void addArma(ArrayList<Arma> armas) {
        System.out.println("\n-- ➕ Añadir Arma --");
        sc.nextLine(); // limpiar buffer
        System.out.print("Nombre de la nueva arma: ");
        String nombreArma = sc.nextLine();
        System.out.print("Daño que inflingirá: ");
        int damage = sc.nextInt();

        armas.add(new Arma(damage, nombreArma));
        System.out.println(nombreArma + " ha sido añadida al arsenal");
        System.out.println("--------------------\n");
    }
    public static void removeHeroe(ArrayList<Heroe> heroes) {
        System.out.println("\n-- 🗑️ Eliminar heroe --");
        sc.nextLine();
        System.out.print("Nombre del heroe a eliminar: ");
        String nombreHeroeEliminar = sc.nextLine();

        for (int i = 0; i < heroes.size(); i++) {
            Heroe heroe = heroes.get(i);
            if (heroe.nombreHeroe.equalsIgnoreCase(nombreHeroeEliminar)) {
                heroes.remove(heroe);
                System.out.println(nombreHeroeEliminar + " ha sido eliminado del gremio");
            }
        }

        System.out.println("--------------------\n");
    }
    public static void buscarHeroe(ArrayList<Heroe> heroes) {
        System.out.println("\n-- 🔍 Buscar heroe --");
        sc.nextLine();
        System.out.print("Nombre del heroe a buscar: ");
        String nombreHeroeEliminar = sc.nextLine();

        for (int i = 0; i < heroes.size(); i++) {
            Heroe heroe = heroes.get(i);
            if (heroe.nombreHeroe.equalsIgnoreCase(nombreHeroeEliminar)) {
                System.out.println("-- Información del heroe --");
                System.out.println(heroe);
            }
        }
    }
    public static Arma elegirArma(ArrayList<Arma> armas) {
        if (!armas.isEmpty()) {
            int opc;
            do {
                System.out.println("Armas: ");
                printArmas(armas);
                System.out.print("Elige un arma: ");
                opc = sc.nextInt();
            } while (opc < armas.size() || opc > armas.size());
            return armas.get(opc);
        } else {
            System.out.println("El heroe irá a puños");
            return null;
        }
    }
    public static void printMenu() {
        System.out.println("""
                0. Salir
                1. Añadir Héroe
                2. Añadir Arma
                3. Eliminar Héroe
                4. Buscar Héroe
                5. Listar Héroes""");
    }
    public static void printArmas(ArrayList<Arma> armas) {
        if (!armas.isEmpty()) {
            for (int i = 0; i < armas.size(); i++) {
                System.out.println(i + ". " + armas.get(i).nombreArma + " (Daño: " + armas.get(i).damage + ")");
            }
        } else System.out.println("No hay armas en el arsenal");
        System.out.println();
    }
    public static void printHeroes(ArrayList<Heroe> heroes) {
        for (int i = 0; i < heroes.size(); i++) {
            System.out.println(i + ". " + heroes.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Heroe> heroes = new ArrayList<>();
        ArrayList<Arma> armas = new ArrayList<>();

        System.out.println("Bienvenido a Héroes 1J");
        printMenu();
        boolean seguir = true;

        do {
            System.out.print("Elige una opción: ");
            int opc = sc.nextInt();


            switch (opc) {
                case 0:
                    seguir = false;
                    break;
                case 1:
                    addHeroe(heroes, armas);
                    break;
                case 2:
                    addArma(armas);
                    break;
                case 3:
                    removeHeroe(heroes);
                    break;
                case 4:
                    buscarHeroe(heroes);
                    break;
                case 5:
                    printHeroes(heroes);
                    break;
                case 6:
                    printArmas(armas);
                    break;
                default:
                    System.out.println("Error, esa opcion no existe");
            }
        } while (seguir);

    }
}
