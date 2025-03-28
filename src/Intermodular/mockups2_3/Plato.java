package Intermodular.mockups2_3;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Plato {
    private String idplato;
    private String nombre;
    private String tipo;
    private double precio;
    private String descripcion;

    public Plato(String idplato, String nombre, String tipo, Double precio, String descripcion) {
        this.idplato = idplato;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "idplato='" + idplato + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdplato() {
        return idplato;
    }

    public void setIdplato(String idplato) {
        this.idplato = idplato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plato plato = (Plato) o;
        return Double.compare(precio, plato.precio) == 0 && Objects.equals(idplato, plato.idplato) && Objects.equals(nombre, plato.nombre) && Objects.equals(tipo, plato.tipo) && Objects.equals(descripcion, plato.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idplato, nombre, tipo, precio, descripcion);
    }

    public static String toXML(ArrayList<Plato> platos, int num) {
        Class<?> c;
        c = platos.get(0).getClass();
        String r = "";
        String plato = c.getSimpleName().toLowerCase();
        if (num > 1) r += "<" + plato + "s>";
        for (Object o : platos) {
            if (num != 0) {
                r += "\n    <" + c.getSimpleName().toLowerCase() + ">";
                try {
                    for (int i = 0; i < c.getDeclaredFields().length; i++) {
                        Field name = c.getDeclaredFields()[i];
                        name.setAccessible(true);
                        r += "\n      <" + name.getName() + ">" + name.get(o) + "</" + name.getName() + ">";
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                r += "\n    </" + plato + ">";
            }
        }
        if (num > 1) r += "\n</" + plato + "s>";
        return r;
    }

    public static void toFileXML(String xml) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del fichero (xml): ");
        File f = new File("C:/ficheros/" + sc.nextLine() + ".xml");

        try {
            PrintWriter pw = new PrintWriter(f);
            pw.println(xml);
            System.out.println(xml);
            pw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}