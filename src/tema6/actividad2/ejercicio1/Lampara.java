package tema6.actividad2.ejercicio1;

public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(boolean bateria, int calificacion, String estilo) {
        this.bateria = bateria;
        this.calificacion = calificacion;
        this.estilo = estilo;
    }

    public void encender() {
        System.out.println("Encendiendo la lampara");
    }

    public String getEstilo() {
        return estilo;
    }

    public boolean hayBateria() {
        return bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }
}
