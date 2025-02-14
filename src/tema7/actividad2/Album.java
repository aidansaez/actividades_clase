package tema7.actividad2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String nombre;
    private String artista;
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    private Cancion findSong (String titulo) {
        for (int i = 0; i < canciones.size(); i++) {
            Cancion cancion = canciones.get(i);
            if (cancion.getTitulo().equalsIgnoreCase(titulo)) {
                return cancion;
            }
        }

        return null;
    }

    public boolean addSong(String titulo, double duracion) {
        if (findSong(titulo) == null) {
            canciones.add(new Cancion(duracion, titulo));
            return true;
        } else return false;
    }

    public boolean addToPlaylist(int numeroPista, LinkedList<Cancion> listaReproduccion){
        for (int i = 0; i < canciones.size(); i++) {
            if (i == numeroPista - 1) {
                listaReproduccion.add(canciones.get(i));
                return true;
            }
        }

        return false;
    }

    public boolean addToPlaylist(String titulo, LinkedList<Cancion> listaReproduccion) {
        if (findSong(titulo) != null) {
            listaReproduccion.add(findSong(titulo));
            return true;
        } else return false;
    }
}
