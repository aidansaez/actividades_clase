package tema4;

public class LibroMain {
    public static void main(String[] args) {
        Libro libro = new Libro();

        // Establecer los valores del libro
        libro.setTitulo("El Señor de los Anillos");
        libro.setAutor("J.R.R. Tolkien");
        libro.setNumPaginas(500);
        libro.setPaginaActual(100); // Iniciamos en la página 100

        // Mostrar información del libro
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Número total de páginas: " + libro.getNumPaginas());
        System.out.println("Página actual: " + libro.getPaginaActual());

        // Avanzar 50 páginas
        System.out.println("\nAvanzar 50 páginas...");
        System.out.println(libro.avanzarPaginas(50));

        // Retroceder 30 páginas
        System.out.println("\nRetroceder 30 páginas...");
        System.out.println(libro.retrocederPaginas(30));

        // Verificar si el libro está completamente leído
        System.out.println("\n¿El libro está completamente leído?");
        boolean leido = libro.marcarLeido();
        if (leido) {
            System.out.println("Sí, el libro está completamente leído.");
        } else {
            System.out.println("No, aún queda por leer.");
        }

        // Mostrar el porcentaje de lectura
        System.out.println("\nPorcentaje de lectura actual: " + libro.getProcesoLectura() + "%");
    }
}
