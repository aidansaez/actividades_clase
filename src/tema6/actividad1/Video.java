package tema6.actividad1;

public class Video {
    protected String titulo;
    protected int minutos;
    protected int precio;

    public Video(int minutos, int precio, String titulo) {
        this.minutos = minutos;
        this.precio = precio;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "minutos=" + minutos +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

class Pelicula extends Video {
    private String director;
    private int valoracion;

    public Pelicula(int minutos, int precio, String titulo, String director, int valoracion) {
        super(minutos, precio, titulo);
        this.director = director;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", valoracion=" + valoracion +
                ", minutos=" + minutos +
                ", precio=" + precio +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}

class VideoMusical extends Video {

    private String artista;
    private String categoria;

    public VideoMusical(int minutos, int precio, String titulo, String artista, String categoria) {
        super(minutos, precio, titulo);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoMusical{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", minutos=" + minutos +
                ", categoria='" + categoria + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}