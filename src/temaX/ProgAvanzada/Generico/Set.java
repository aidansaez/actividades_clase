package temaX.ProgAvanzada.Generico;

public class Set<T> {
    private static final int TAM = 10;
    private T[] array = (T[]) new Object[TAM];

    public boolean insert(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                return true;
            }
        }
        return false;
    }

    public boolean delete(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(element)) { // Se verifica que no sea null
                array[i] = null;
                return true;
            }
        }
        return false;
    }

    public T find(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(element)) { // Se verifica que no sea null
                return element;
            }
        }
        return null;
    }
}
