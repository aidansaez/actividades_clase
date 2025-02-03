package tema6.actividad5.ejercicio2;

public class SalaryEmployee extends Employee{
    protected int salarioSemanal;

    public SalaryEmployee(String cargo, String nombre, int salarioSemanal) {
        super(cargo, nombre);
        this.salarioSemanal = salarioSemanal;
    }

    public int getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(int salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public void calculateWeeklyPay() {
        System.out.println("La paga del empleado " + nombre + " es de " + salarioSemanal);
    }
}
