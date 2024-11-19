package tema4.parte1.actividad2.ej2_4;

public class Alfombra {
    private double coste;

    public Alfombra(double coste) {
        if (coste < 0) {
            this.coste = 0;
        } else this.coste = coste;
    }

    public double getCoste() {
        return coste;
    }
}
