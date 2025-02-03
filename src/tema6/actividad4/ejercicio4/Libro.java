package tema6.actividad4.ejercicio4;

public class Libro extends Bienes implements Imponible {
    protected String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", impuesto= " + calcularImpuesto() + '}';
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public double calcularImpuesto() {
        return impuesto*precio;
    }
}
