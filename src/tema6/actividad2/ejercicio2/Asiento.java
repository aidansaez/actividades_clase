package tema6.actividad2.ejercicio2;

public class Asiento {
    private String material;
    private boolean reclinable;

    public Asiento(String material, boolean reclinable) {
        this.material = material;
        this.reclinable = reclinable;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isReclinable() {
        return reclinable;
    }

    public void ajustar() {
        System.out.println("El asiento ha sido ajustado.");
    }
}