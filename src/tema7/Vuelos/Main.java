package tema7.Vuelos;

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
                System.out.println("Introduce un valor numerico");
                sc.nextLine(); //buffer
            }
        } while (!continuar);

        sc.nextLine();
        return num;
    }
    public static String buscarPorNumero(ArrayList<Vuelo> vuelos) {
        System.out.println("-- 🔍 Busca vuelo por nº --");
        if (!vuelos.isEmpty()) {
            System.out.print("Número de vuelo: ");
            String numVuelo = sc.nextLine();
            for (Vuelo vuelo : vuelos) {
                if (vuelo.numero.equalsIgnoreCase(numVuelo)) {
                    return String.valueOf(vuelo);
                }
            }
            return "El numero de vuelo no existe";
        } else return "No existen vuelos.";
    }
    public static void buscarPorClave(ArrayList<Vuelo> vuelos) {
        boolean encontrado = false;
        System.out.println("-- 🔍 Busca vuelo por clave --");
        if (!vuelos.isEmpty()) {
            System.out.print("Clave: ");
            String clave = sc.nextLine().toLowerCase();
            if (!Clave.existeClave(clave)) {
                System.out.println("Esa clave no existe");
            } else {
                System.out.print("Valor: ");
                String valor = sc.nextLine();
                switch (clave) {
                    case "numero":
                        for (Vuelo vuelo : vuelos) {
                            if (vuelo.numero.equalsIgnoreCase(valor)) {
                                System.out.println(vuelo);
                                encontrado = true;
                            }
                        }
                        break;
                    case "origen":
                        for (Vuelo vuelo : vuelos) {
                            if (vuelo.origen.equalsIgnoreCase(valor)) {
                                System.out.println(vuelo);
                                encontrado = true;
                            }
                        }
                        break;
                    case "destino":
                        for (Vuelo vuelo : vuelos) {
                            if (vuelo.destino.equalsIgnoreCase(valor)) {
                                System.out.println(vuelo);
                                encontrado = true;
                            }
                        }
                        break;
                    case "dia":
                        for (Vuelo vuelo : vuelos) {
                            if (vuelo.dia.equalsIgnoreCase(valor)) {
                                System.out.println(vuelo);
                                encontrado = true;
                            }
                        }
                    case "clase":
                        for (Vuelo vuelo : vuelos) {
                            if (vuelo.clase.equalsIgnoreCase(valor)) {
                                System.out.println(vuelo);
                                encontrado = true;
                            }
                        }
                }
                if (!encontrado) {
                    System.out.println("El vuelo con " + clave + " - " + valor + " no existe");
                }
            }
        } else System.out.println("No existen vuelos.");
    }
    public static void addVuelo(ArrayList<Vuelo> vuelos) {
        System.out.println("-- ➕ Añadir nuevo vuelo --");
        boolean esta = false;
        String numero;
        do {
            System.out.print("Numero: ");
            numero = sc.nextLine();

            for (Vuelo vuelo : vuelos) {
                if (vuelo.numero.equalsIgnoreCase(numero)) {
                    System.out.println("Error, ese numero de vuelo ya esta en la lista");
                    esta = true;
                    break;
                }
            }
        } while (esta);

        System.out.print("Origen: ");
        String origen = sc.nextLine();
        System.out.print("Destino: ");
        String destino = sc.nextLine();
        System.out.print("Dia: ");
        String dia = sc.nextLine();
        System.out.print("Clase: ");
        String clase = sc.nextLine();

        vuelos.add(new Vuelo(numero, origen, destino, dia, clase));
        System.out.println("Vuelo añadido a la lista");
    }
    public static void removeVuelo(ArrayList<Vuelo> vuelos) {
        System.out.println("-- 🗑️ Eliminar vuelo --");
        boolean encontrado = false;
        if (vuelos.isEmpty()) {
            System.out.println("No existen vuelos.");
        } else {
            System.out.print("Número de vuelo: ");
            String numVuelo = sc.nextLine();
            for (int i = 0; i < vuelos.size(); i++) {
                Vuelo vuelo = vuelos.get(i);
                if (vuelo.numero.equalsIgnoreCase(numVuelo)) {
                    vuelos.remove(vuelo);
                    System.out.println("Borrado con éxito");
                    encontrado = true;
                }
            }
            if (!encontrado) System.out.println("El número de vuelo no existe");
        }

    }
    public static void printVuelos(ArrayList<Vuelo> vuelos) {
        System.out.println("-- 📄 Datos de los vuelos --");
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
    public static void printmenu() {
        System.out.println("""
                ========================================
                    VUELOS DEL AEROPUERTO DE VALENCIA
                ========================================
                1 - Imprimir todos los vuelos
                2 - Buscar un número de vuelo
                3 - Buscar vuelo por clave
                4 - Añadir vuelo nuevo
                5 - Borrar vuelo por número
                0 - SALIR
                -------------------------------""");
    }
    public static void main(String[] args) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo("2023-01", "Valencia", "Menorca", "15-08", "turista"));
        vuelos.add(new Vuelo("2023-02", "Valencia", "Tenerife", "20-08", "turista"));
        vuelos.add(new Vuelo("2023-03", "París", "Valencia", "15-08", "primera"));
        vuelos.add(new Vuelo("2023-04", "Atenas", "Valencia", "20-08", "primera"));

        boolean continuar = true;
        printmenu();
        do {
            int opc = pedirNum("Elige una opción");


            switch (opc) {
                case 0:
                    continuar = false;
                    break;
                case 1:
                    printVuelos(vuelos);
                    break;
                case 2:
                    System.out.println(buscarPorNumero(vuelos));
                    break;
                case 3:
                    buscarPorClave(vuelos);
                    break;
                case 4:
                    addVuelo(vuelos);
                case 5:
                    removeVuelo(vuelos);
            }
            System.out.println("-------------------------------");
        } while (continuar);
    }
}
