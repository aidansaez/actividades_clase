package tema4.actividad2.ej2_4;

public class Suelo {
    private double ancho;
    private double largo;

    public Suelo(double ancho, double alto) {
        this.ancho = ancho;
        this.largo = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho < 0) {
            this.ancho = 0;
        } else this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        if (largo < 0) {
            this.largo = 0;
        } else this.largo = largo;
    }

    public double getArea() {
        return ancho * largo;
    }
}
