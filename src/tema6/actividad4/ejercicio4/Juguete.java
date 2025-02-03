package tema6.actividad4.ejercicio4;

public class Juguete extends Bienes implements Imponible {
    protected int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "edadMinima=" + edadMinima +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", impuesto= " + calcularImpuesto() + '}';
    }

    @Override
    public double calcularImpuesto() {
        return impuesto*precio;
    }
}
