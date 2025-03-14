package tema7.BusElche;

public class Linea {
    private String linea;

    public Linea(String linea) {
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Bus linea: " + linea;
    }
}
