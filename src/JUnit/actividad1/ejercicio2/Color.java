package JUnit.actividad1.ejercicio2;

public class Color {
    protected String nombre;

    public static String queColorSoy(String nombre) {
        if (!Character.isLetter(nombre.charAt(0))) {
            return "blanco";
        } else if (nombre.charAt(0) >= 'A' && nombre.charAt(0) <= 'F') {
            return "rojo";
        } else if (nombre.charAt(0) >= 'G' && nombre.charAt(0) <= 'M') {
            return "verde";
        } else if (nombre.charAt(0) >= 'N' && nombre.charAt(0) <= 'S') {
            return "azul";
        } else return "amarillo";
    }
}
