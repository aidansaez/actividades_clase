package ProgAvanzada.Lambda.Supplier;


import java.time.LocalDate;
import java.util.function.Supplier;

public class ej12 {
    public static Programador fabricaProgramadores(Supplier<Programador> programadorSupplier) {
        if (programadorSupplier.get().getSalario() == 0 && programadorSupplier.get().getFechaInicio() == null) {
            String nombre = programadorSupplier.get().getNombre();
             programadorSupplier = () -> new Programador(nombre, 50000, LocalDate.now());
             return programadorSupplier.get();
        } else {
            return programadorSupplier.get();
        }
    }
    public static void main(String[] args) {
        Supplier<Programador> nombre = () -> new Programador("Paco");
        Supplier<Programador> todo = () -> new Programador("pepe", 2100, LocalDate.of(2025, 12, 5));
    }
}

class Programador {
    private String nombre;
    private int salario;
    private LocalDate fechaInicio;

    public Programador(String nombre, int salario, LocalDate fechaInicio) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
    }

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }
}