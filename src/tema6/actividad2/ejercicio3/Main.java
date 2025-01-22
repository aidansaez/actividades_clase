package tema6.actividad2.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // Create an Impresora object
        Impresora impresora = new Impresora(true, 50, 0); // Doble cara, nivel de toner 50, 0 páginas impresas

        // Test adding toner
        System.out.println("Nivel de toner inicial: " + impresora.getNiveldeToner());

        // Test valid toner addition
        int nuevoNivel = impresora.anadirToner(30);
        System.out.println("Nivel de toner después de añadir 30: " + nuevoNivel); // Expected: 80

        // Test invalid toner addition (exceeds max)
        nuevoNivel = impresora.anadirToner(30);
        System.out.println("Intento de añadir 30 más: " + nuevoNivel); // Expected: -1

        // Test invalid toner addition (out of range)
        nuevoNivel = impresora.anadirToner(0);
        System.out.println("Intento de añadir 0: " + nuevoNivel); // Expected: -1

        // Test updating number of pages
        int paginasImprimir = 5;
        int totalPaginas = impresora.actualizarNPaginas(paginasImprimir);
        System.out.println("Total de páginas después de imprimir " + paginasImprimir + " páginas: " + totalPaginas); // Expected: 10

        // Test single-sided printing
        Impresora impresoraSimple = new Impresora(false, 50, 0); // No doble cara
        totalPaginas = impresoraSimple.actualizarNPaginas(paginasImprimir);
        System.out.println("Total de páginas después de imprimir " + paginasImprimir + " páginas en impresora simple: " + totalPaginas); // Expected: 5
    }
}