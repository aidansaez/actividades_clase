package tema4.actividad4;

import java.util.Scanner;

public class ej4_1 {
    public static String pedirString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        return sc.nextLine();
    }
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        return sc.nextInt();
    }
    public static char ObtenerCaracter(String cadena, int pos) {
        return cadena.charAt(pos);
    }
    public static int ObtenerCaracterUnicode(String cadena, int pos) {
        return cadena.codePointAt(pos - 1);
    }
    public static boolean CompararCadenas(String cadena1, String cadena2) {
        return cadena1.equalsIgnoreCase(cadena2);
    }
    public static String CompararLexico(String cadena1, String cadena2) {
        if (cadena1.equals(cadena2)) {
            return cadena1 + " es igual a " + cadena2;
        } else if (cadena1.compareToIgnoreCase(cadena2) > 0) {
            return cadena1 + " es mayor a " + cadena2;
        } else return cadena1 + " es menor a " + cadena2;
    }
    public static boolean ContieneX(String cadena1, String cadena2) {
        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();
        return cadena1.contains(cadena2);
    }
    public static boolean EmpiezaPor(String cadena1, String cadena2, String caracter) {
        cadena1 = cadena1.toLowerCase();
        cadena2 = cadena2.toLowerCase();
        caracter = caracter.toLowerCase();

        if (cadena1.startsWith(caracter) && cadena2.startsWith(caracter)) {
            return true;
        } else return false;
    }
    public static String IndiceC(String cadena) {
        int x = 0;
        String fin = "";
        for (; x < cadena.length(); x++) {
            fin = fin + ", " +  cadena.charAt(x) + " indice " + x;
        }
        return fin;
    }
    public static String Replace(String cadena, String c1, String c2) {
        return cadena.replace(c1, c2);
    }
    public static String EliminarC(String cadena, int pos) {
        return cadena.substring(0, pos) + cadena.substring((pos + 1));
    }
    public static String Revert(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        sb.reverse();
        return sb.toString();
    }
    public static String Recorte(String cadena, int c1, int c2) {
        return cadena.substring(c1, c2);
    }
    public static String NoDuplicados(String cadena) {
        StringBuilder y = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (y.indexOf(String.valueOf(c)) == -1) {
                y.append(c);
            }
        }
        return y.toString();
    }
    public static String NoRepetidos(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (cadena.indexOf(String.valueOf(c)) == cadena.lastIndexOf(String.valueOf(c))) {
                return String.valueOf(c);
            }
        }
        return cadena;
    }
    public static String Dividir(String cadena, int divisor) {
        if (divisor > cadena.length()) {
            return "El texto no es divisible entre " + divisor;
        }
        String fin = "";
        int dividido = cadena.length() / divisor;
        for (int i = 0; i < cadena.length(); i += dividido) {
            fin = fin + cadena.substring(i, i + dividido) + ", ";
        }
        return fin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige: ");
        System.out.println("1. Obtener Caracter");
        System.out.println("2. Obtener Caracter Unicode");
        System.out.println("3. Comparar cadenas");
        System.out.println("4. Comparar lexico");
        System.out.println("5. Contiene X?");
        System.out.println("6. Empieza por?");
        System.out.println("7. Indice");
        System.out.println("8. Remplazar");
        System.out.println("9. Eliminar caracter");
        System.out.println("10. Revertir");
        System.out.println("11. Recorte");
        System.out.println("12. No duplicados");
        System.out.println("13. No repetidos");
        System.out.println("14. Dividir");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Introduce la cadena de caracteres y la posicion del que deseas obtener: ");
                String x = pedirString();
                int y = pedirNumero();
                System.out.println("El caracter de la posicion " + y + " es " + ObtenerCaracter(x, y));
                break;
            case 2:
                System.out.println("Cadena y posicion");
                x = pedirString();
                y = pedirNumero();
                System.out.println("El caracter de la posicion " + y + " es " + ObtenerCaracterUnicode(x, y));
                break;
            case 3:
                System.out.println("2 cadenas: ");
                x = pedirString();
                String z = pedirString();
                System.out.println(CompararCadenas(x, z));
                break;
            case 4:
                System.out.println("2 cadenas: ");
                x = pedirString();
                z = pedirString();
                System.out.println(CompararLexico(x, z));
                break;
            case 5:
                System.out.println("2 cadenas: ");
                x = pedirString();
                z = pedirString();
                System.out.println(ContieneX(x, z));
                break;
            case 6:
                System.out.println("3 cadenas: ");
                x = pedirString();
                z = pedirString();
                String w = pedirString();
                System.out.println(EmpiezaPor(x, z, w));
                break;
            case 7:
                System.out.println(IndiceC(pedirString()));
                break;
            case 8:
                System.out.println("3 cadenas: ");
                x = pedirString();
                z = pedirString();
                w = pedirString();
                System.out.println(Replace(x, z, w));
                break;
            case 9:
                System.out.println("2 cadenas: ");
                x = pedirString();
                y = pedirNumero();
                System.out.println(EliminarC(x, y));
                break;
            case 10:
                System.out.println(Revert(pedirString()));
                break;
            case 11:
                System.out.println("3 cadenas: ");
                x = pedirString();
                y = pedirNumero();
                int v = pedirNumero();
                System.out.println(Recorte(x, y, v));
                break;
            case 12:
                System.out.println(NoDuplicados(pedirString()));
                break;
            case 13:
                System.out.println(NoRepetidos(pedirString()));
                break;
            case 14:
                System.out.println("Cadena y divisor");
                x = pedirString();
                y = pedirNumero();
                System.out.println(Dividir(x, y));
        }
    }
}
