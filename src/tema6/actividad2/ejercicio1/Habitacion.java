package tema6.actividad2.ejercicio1;

public class Habitacion {
    private String nombre;
    private Pared pared1;
    private Pared pared2;
    private Pared pared3;
    private Pared pared4;
    private Techo techo;
    private Cama cama;
    private Lampara lampara;

    public Habitacion(Cama cama, Lampara lampara, String nombre, Pared pared1, Pared pared2, Pared pared3, Pared pared4, Techo techo) {
        this.cama = cama;
        this.lampara = lampara;
        this.nombre = nombre;
        this.pared1 = pared1;
        this.pared2 = pared2;
        this.pared3 = pared3;
        this.pared4 = pared4;
        this.techo = techo;
    }

    public Lampara getLampara() {
        return lampara;
    }

    public void hacerLaCama() {
        cama.hacer();
    }
}
