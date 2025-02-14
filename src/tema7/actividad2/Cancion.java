package tema7.actividad2;

import java.util.Comparator;

public class Cancion implements Comparator<Cancion> {
    private String titulo;
    private double duracion;

    public Cancion(double duracion, String titulo) {
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + ": " + duracion;
    }

    @Override
    public int compare(Cancion o1, Cancion o2) {
        return o1.titulo.compareToIgnoreCase(o2.titulo);
    }
}
