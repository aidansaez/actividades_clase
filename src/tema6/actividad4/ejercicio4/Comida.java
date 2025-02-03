package tema6.actividad4.ejercicio4;

public class Comida extends Bienes{
    protected double calorias;

    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "calorias=" + calorias +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
