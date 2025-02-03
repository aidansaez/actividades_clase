package tema6.actividad5.ejericicio7;

public class Estudiante implements Comparable<Estudiante> {
    protected String nombre;
    protected int edad;
    protected int altura;

    public Estudiante(int altura, int edad, String nombre) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Estudiante o) {
        int comparAltura = Integer.compare(o.getAltura(), this.getAltura());
        if (comparAltura != 0) {
            return comparAltura;
        } else return Integer.compare(o.getEdad(), this.getEdad());
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " - Edad: " + edad;
    }
}
