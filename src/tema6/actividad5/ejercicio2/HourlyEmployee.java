package tema6.actividad5.ejercicio2;

public class HourlyEmployee extends Employee{
    protected double tasaPago;
    protected int horasTrabajadas;

    public HourlyEmployee(String cargo, String nombre, double tasaPago, int horasTrabajadas) {
        super(cargo, nombre);
        this.tasaPago = tasaPago;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void calculateWeeklyPay() {
        System.out.println("La paga del empleado " + nombre + " es de " + tasaPago*horasTrabajadas);
    }
}
