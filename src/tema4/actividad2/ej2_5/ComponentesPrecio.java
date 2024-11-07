package tema4.actividad2.ej2_5;

public class ComponentesPrecio {
    private double procesador;
    private double placaBase;
    private double fuenteAlmt;

    public ComponentesPrecio(double procesador, double placaBase, double fuenteAlmt) {
        this.procesador = procesador;
        this.placaBase = placaBase;
        this.fuenteAlmt = fuenteAlmt;
    }

    public double getProcesador() {
        return procesador;
    }

    public void setProcesador(double procesador) {
        this.procesador = procesador;
    }

    public double getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(double placaBase) {
        this.placaBase = placaBase;
    }

    public double getFuenteAlmt() {
        return fuenteAlmt;
    }

    public void setFuenteAlmt(double fuenteAlmt) {
        this.fuenteAlmt = fuenteAlmt;
    }

    public double total() {
        return procesador + placaBase + fuenteAlmt;
    }
}
