package Intermodular;

public class Plato {
    private String idplato;
    private String nombre;
    private String tipo;
    private double precio;
    private String descripcion;

    public Plato(String descripcion, String idplato, String nombre, double precio, String tipo) {
        this.descripcion = descripcion;
        this.idplato = idplato;
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "descripcion='" + descripcion + '\'' +
                ", idplato='" + idplato + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdplato() {
        return idplato;
    }

    public void setIdplato(String idplato) {
        this.idplato = idplato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
