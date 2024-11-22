package tema3.actividad1;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private String editorial;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getbookByAutor() {
        if (autor.isEmpty()) {
            return titulo + " by Anon Writer";
        } else return titulo + " by " + autor;
    }

    public boolean getEsFiable() {
        if (editorial.equalsIgnoreCase("santillana") || editorial.equalsIgnoreCase("anaya")) {
            return true;
        } else return false;
    }

    public double getProcesoLectura (int paginas) {
        return ((double)paginas / numPaginas * 100);
    }
}
