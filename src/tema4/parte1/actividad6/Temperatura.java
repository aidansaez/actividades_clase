package tema4.parte1.actividad6;

public class Temperatura {
    public static String CF (double c) {
        return (c * 9 / 5) + 32 + " ºF";
    }
    public static String FC (double f) {
        return (f - 32) * 5 / 9 + " ºC";
    }
}
