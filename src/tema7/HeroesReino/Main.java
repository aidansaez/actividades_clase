package tema7.HeroesReino;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static int pedirNum(String text) {
        boolean continuar = false;
        int num = 0;
        do {
            try {
                System.out.print(text + ": ");
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("El nivel no puede ser negativo");
                } else continuar = true;
            } catch (InputMismatchException nonum) {
                System.out.println("Introduce un valor numerico porfa");
                continuar = false;
                sc.nextLine(); //buffer
            }
        } while (!continuar);

        return num;
    }
    public static boolean heroeYaAgregado(ArrayList<Heroe> heroes, String nombre) {
        for (int i = 0; i < heroes.size(); i++) {
            Heroe heroe = heroes.get(i);
            if (heroe.nombreHeroe.equalsIgnoreCase(nombre)){
                System.out.println("Error, ese nombre ya esta ocupado");
                return true;
            }
        }
        return false;
    }
    public static void addHeroe(ArrayList<Heroe> heroes, ArrayList<Arma> armasArsenal) {
        int opcMenu;
        System.out.println("\n-- ➕ Añadir Heroe --");

        do {
            System.out.println("""
                       Tipos de heroe:
                       1. Guerrero
                       2. Mago
                       3. Arquero
                       4. Asesino""");
            opcMenu = pedirNum("Elige una opción");
        } while (opcMenu > 4);

        sc.nextLine(); // Limpiar Buffer
        String nombre;
        do {
            System.out.print("Nombre del Guerrero: ");
            nombre = sc.nextLine();
        } while (heroeYaAgregado(heroes, nombre));

        int nivel = pedirNum("Nivel");
        int vida = pedirNum("Vida");
        sc.nextLine(); // limpiar buffer

        if (armasArsenal.isEmpty()) {
            String decision;
            do {
                System.out.print("No hay armasArsenal en el arsenal\nDeseas añadir una (S/n)? ");
                decision = sc.nextLine();
                if (!decision.equalsIgnoreCase("s") && !decision.equalsIgnoreCase("n")) {
                    System.out.println("Error, ese caracter no es válido.");
                }
            } while (!decision.equalsIgnoreCase("s") && !decision.equalsIgnoreCase("n"));

            if (decision.equalsIgnoreCase("s")) {
                addArma(armasArsenal);
            }
        }
        
        ArrayList<Arma> armasHeroe = null;

        switch (opcMenu) {
            case 1:
                int fuerza = pedirNum("Fuerza");
                armasHeroe = elegirArma(armasArsenal);
                heroes.add(new Guerrero(nombre, nivel, vida, armasHeroe, fuerza));
                break;
            case 2:
                int mana = pedirNum("Mana");
                armasHeroe = elegirArma(armasArsenal);
                heroes.add(new Mago(nombre, nivel, vida, armasHeroe, mana));
                break;
            case 3:
                int precision = pedirNum("Precision");
                armasHeroe = elegirArma(armasArsenal);
                heroes.add(new Arquero(nombre, nivel, vida, armasHeroe, precision));
                break;
            case 4:
                int sigilo = pedirNum("Sigilo");
                armasHeroe = elegirArma(armasArsenal);
                heroes.add(new Asesino(nombre, nivel, vida, armasHeroe, sigilo));
                break;
            default:
                System.out.println("Error");
        }

        if (armasHeroe != null) {
            System.out.println(nombre + " ha sido añadido al gremio");
        } else System.out.println(nombre + " ha sido añadido al gremio sin arma!");

        System.out.println("---------------------\n");
    }
    public static void addArma(ArrayList<Arma> armas) {
        System.out.println("\n-- ➕ Añadir Arma --");
        System.out.print("Nombre de la nueva arma: ");
        String nombreArma = sc.nextLine();
        int damage = pedirNum("Daño que inflingirá");

        armas.add(new Arma(damage, nombreArma));
        System.out.println(nombreArma + " ha sido añadida al arsenal");
        System.out.println("--------------------\n");
    }
    public static void removeHeroe(ArrayList<Heroe> heroes) {
        System.out.println("\n-- 🗑️ Eliminar heroe --");
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
        System.out.print("Nombre del heroe a buscar: ");
        String nombreHeroeEliminar = sc.nextLine();

        for (int i = 0; i < heroes.size(); i++) {
            Heroe heroe = heroes.get(i);
            if (heroe.nombreHeroe.equalsIgnoreCase(nombreHeroeEliminar)) {
                System.out.println("-- Información del heroe --");
                System.out.println(heroe);
                System.out.println("Armas: ");
                for (int j = 0; j < heroe.armas.size(); j++) {
                    System.out.println(heroe.armas.get(j));
                }
            }
        }
    }
    public static ArrayList<Arma> elegirArma(ArrayList<Arma> armasArsenal) {
        if (!armasArsenal.isEmpty()) {
            ArrayList<Arma> armasHeroe = new ArrayList<>();
            int opc;
            String quieresOtroArma;
            do {
                do {
                    System.out.println("Armas: ");
                    printArmas(armasArsenal);
                    opc = pedirNum("Elige un arma");
                } while (opc < 1 || opc > armasArsenal.size());
                armasHeroe.add(armasArsenal.get(opc - 1));

                sc.nextLine();
                
                do {
                    System.out.print("Quieres añadir otro arma (S/n)? ");
                    quieresOtroArma = sc.nextLine();
                } while (!quieresOtroArma.equalsIgnoreCase("s") && !quieresOtroArma.equalsIgnoreCase("n"));
                
            } while (quieresOtroArma.equalsIgnoreCase("s"));
            
            return armasHeroe;
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
                5. Listar Héroes
                6. Listar Armas
                7. Listar Menu""");
    }
    public static void printArmas(ArrayList<Arma> armas) {
        if (!armas.isEmpty()) {
            for (int i = 0; i < armas.size(); i++) {
                System.out.println((i + 1) + ". " + armas.get(i).nombreArma + " (Daño: " + armas.get(i).damage + ")");
            }
        } else System.out.println("No hay armas en el arsenal");
        System.out.println();
    }
    public static void printHeroes(ArrayList<Heroe> heroes) {
        if (!heroes.isEmpty()) {
            System.out.println("---------------------------");
            for (int i = 0; i < heroes.size(); i++) {
                System.out.println((i + 1) + ". " + heroes.get(i));
                System.out.println();
            }
            System.out.println("---------------------------");
        } else System.out.println("No hay heroes en el gremio");
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Heroe> heroes = new ArrayList<>();
        ArrayList<Arma> armasArsenal = new ArrayList<>();

        System.out.println("Bienvenido a Héroes 1J");
        printMenu();
        boolean seguir = true;

        do {
            System.out.print("Elige una opción: ");
            int opc = sc.nextInt();
            sc.nextLine(); // buffer

            switch (opc) {
                case 0:
                    seguir = false;
                    break;
                case 1:
                    addHeroe(heroes, armasArsenal);
                    break;
                case 2:
                    addArma(armasArsenal);
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
                    printArmas(armasArsenal);
                    break;
                case 7:
                    printMenu();
                    break;
                default:
                    System.out.println("Error, esa opcion no existe");
            }
        } while (seguir);

    }
}
