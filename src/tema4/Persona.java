package tema4;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) {
            this.edad = 0;
        } else this.edad = edad;
    }

    public boolean esAdolescente() {
        if (edad > 12 && edad < 20) {
            return true;
        } else return false;
    }

    public String getFullName() {
        if (nombre.isEmpty() && apellido.isEmpty()) {
            return "";
        } else if (nombre.isEmpty()) {
            return apellido;
        } else if (apellido.isEmpty()) {
            return nombre;
        } else return nombre + " " + apellido;
    }
}
