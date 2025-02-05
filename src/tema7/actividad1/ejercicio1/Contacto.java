package tema7.actividad1.ejercicio1;

import java.util.Objects;

public class Contacto implements Comparable<Contacto> {
    protected String nombre;
    protected String phoneNumber;

    public Contacto(String nombre) {
        this.nombre = nombre;
    }

    public Contacto(String nombre, String phoneNumber) {
        this.nombre = nombre;
        this.phoneNumber = phoneNumber;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contacto createContact(String nombre, String phoneNumber) {
        return new Contacto(nombre, phoneNumber);
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre) && Objects.equals(phoneNumber, contacto.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, phoneNumber);
    }
}
