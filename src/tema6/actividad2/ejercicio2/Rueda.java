package tema6.actividad2.ejercicio2;

public class Rueda {
    private int tamaño;
    private String tipo;

    public Rueda(int tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void inflar() {
        System.out.println("La rueda está inflada.");
    }
}