package temaX.ProgAvanzada.Generico;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> mySet = new Set<>();

        // Insertando elementos
        System.out.println("Insertando 5: " + mySet.insert(5));
        System.out.println("Insertando 10: " + mySet.insert(10));
        System.out.println("Insertando 15: " + mySet.insert(15));
        System.out.println("Insertando 10 otra vez: " + mySet.insert(10)); // Debería permitir duplicados

        // Buscando elementos
        System.out.println("Buscando 10: " + (mySet.find(10) != null ? "Encontrado" : "No encontrado"));
        System.out.println("Buscando 20: " + (mySet.find(20) != null ? "Encontrado" : "No encontrado"));

        // Eliminando elementos
        System.out.println("Eliminando 10: " + mySet.delete(10));
        System.out.println("Buscando 10 después de eliminar: " + (mySet.find(10) != null ? "Encontrado" : "No encontrado"));

        // Insertando hasta llenar el conjunto
        for (int i = 0; i < 12; i++) {
            System.out.println("Insertando " + i + ": " + mySet.insert(i));
        }
    }
}
