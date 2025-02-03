package tema6.actividad4.ejercicio4;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de las clases
        Bienes[] bienes = new Bienes[4];
        bienes[0] = new Bienes("Mesa", 150.0);;
        bienes[1] = new Comida("Pizza", 300.0, 250);
        bienes[2] = new Juguete("Muñeca", 50.0, 5);
        bienes[3] = new Libro("El Quijote", 20, "Miguel de Cervantes");

        Libro libro1 = new Libro("El Quijote", 20, "Miguel de Cervantes");
        System.out.println(bienes[1].toString());
        System.out.println(bienes[2].toString());
        System.out.println(bienes[3].toString());

        // No se calcula impuesto para comida


        System.out.println(libro1.getAutor());

        System.out.println();
    }
}