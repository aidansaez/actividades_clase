package tema4;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int paginaActual;

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

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    public int avanzarPaginas(int paginas) {
        if ((paginaActual + paginas) < numPaginas) {
            return paginaActual += paginas;
        } else return 0; //si se pasa devuelve 0
    }

    public int retrocederPaginas(int paginas) {
        if((paginaActual - paginas) >= 1) {
            return paginaActual -= paginas;
        } else return 0;
    }

    public boolean marcarLeido() {
        if (paginaActual == numPaginas) {
            return true;
        } else return false;
    }

    public double getProcesoLectura () {
        return ((double)paginaActual / numPaginas * 100);
    }
}
