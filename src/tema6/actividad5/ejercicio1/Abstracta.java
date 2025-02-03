package tema6.actividad5.ejercicio1;

public abstract class Abstracta {
    public Abstracta() {
        System.out.println("Este es un constructor de clase abstracta");
    }

    public abstract void abstract_method();

    public void noAbstractMethod() {
        System.out.println("Este es un método normal de clase abstracta");
    }
}
