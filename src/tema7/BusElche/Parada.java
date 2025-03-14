package tema7.BusElche;

public class Parada {
    private int numero;
    private String nombre;
    private String direccion;

    public Parada(int numero, String nombre, String direccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return nombre +  " - " + direccion;
    }
}
