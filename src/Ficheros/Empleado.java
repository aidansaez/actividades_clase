package Ficheros;

import java.io.Serializable;

public class Empleado implements Serializable {
    private String dni;
    private String nombre;
    private int edad;
    private int sueldo;

    public int getSueldo() {
        return sueldo;
    }

    public Empleado(String dni, String nombre, int edad, int sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }
}
