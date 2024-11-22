package tema3.actividad1;

public class LibroMain {
    public static void main(String[] args) {
        Libro libro = new Libro();

        // Establecer los valores del libro
        libro.setTitulo("El Señor de los Anillos");
        libro.setAutor("J.R.R. Tolkien");
        libro.setNumPaginas(500);
        libro.setEditorial("Santillana");


        // Mostrar información del libro
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Número total de páginas: " + libro.getNumPaginas());
        System.out.println("Editorial: " + libro.getEditorial());

        // Libro by Autor
        System.out.println("\nTitulo y autor: " + libro.getbookByAutor());
        libro.setAutor("");
        System.out.println("Titulo y autor: " + libro.getbookByAutor());


        //Editorial es fiable o no?
        System.out.println("Es fiable la editorial " + libro.getEditorial() + "? " + libro.getEsFiable());
        libro.setEditorial("Almadraba");
        System.out.println("Es fiable la editorial " + libro.getEditorial() + "? " + libro.getEsFiable());

        // Mostrar el porcentaje de lectura
        System.out.println("Porcentaje de lectura actual: " + libro.getProcesoLectura(120) + "%");
        System.out.println("Porcentaje de lectura actual: " + libro.getProcesoLectura(467) + "%");
    }
}
