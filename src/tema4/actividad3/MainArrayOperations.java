package tema4.actividad3;

public class MainArrayOperations {
    public static void main(String[] args) {
        // Array definido directamente en el código
        int[] array = {-2, 45, -29, 77, 56, 31};

        System.out.println("Array inicial: " + ArrayOperations.print(array));
        ArrayOperations.reverse(array);
        System.out.println("Array invertido: " + ArrayOperations.print(array));

        System.out.println("Máximo valor del array: " + ArrayOperations.max(array));
        System.out.println("Mínimo valor del array: " + ArrayOperations.min(array));
        System.out.println("Suma de los valores del array: " + ArrayOperations.sum(array));

        // Crear una copia para eliminar números impares
        int[] array4 = {-2, 45, -29, 77, 56, 31};
        ArrayOperations.removeOddNumbers(array4);
        System.out.println("Array con los números impares eliminados: " + ArrayOperations.print(array4));

        System.out.println("Rango de valores (índices 1 a 3): " + ArrayOperations.print(ArrayOperations.printRange(array, 1, 3)));

        int[] array2 = {31, 77, -29};
        System.out.println("¿Array2 está contenido en Array?: " + ArrayOperations.isArrayOn(array, array2));

        int[] array3 = {-2, 45, 56, 31, 77, -29};
        System.out.println("¿Array es igual a Array3?: " + ArrayOperations.equals(array, array3));
        System.out.println("¿Array es igual a Array3 sin importar el orden?: " + ArrayOperations.equalsWithoutOrder(array, array3));

        ArrayOperations.sort(array.clone());
        System.out.println("Array ordenado: " + ArrayOperations.print(array));
        System.out.println("Concatenación de valores en el array: " + ArrayOperations.concatenar(array));

        int[] arrayEliminado = ArrayOperations.deleteOne(array.clone());
        System.out.println("Array después de eliminar números con más de un dígito: " + ArrayOperations.print(arrayEliminado));
    }
}
