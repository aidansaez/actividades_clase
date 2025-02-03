package tema6.actividad5.ejercicio2;

public abstract class Employee {
    protected String nombre;
    protected String cargo;

    public Employee(String cargo, String nombre) {
        this.cargo = cargo;
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calculateWeeklyPay();
}
