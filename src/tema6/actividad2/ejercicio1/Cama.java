package tema6.actividad2.ejercicio1;

public class Cama {
    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colcha;

    public Cama(int almohadas, int altura, int colcha, String estilo, int sabanas) {
        this.almohadas = almohadas;
        this.altura = altura;
        this.colcha = colcha;
        this.estilo = estilo;
        this.sabanas = sabanas;
    }

    public void hacer() {
        System.out.println("Se ha hecho la cama");
    }

    public int getAlmohadas() {
        return almohadas;
    }

    public int getAltura() {
        return altura;
    }

    public int getColcha() {
        return colcha;
    }

    public String getEstilo() {
        return estilo;
    }

    public int getSabanas() {
        return sabanas;
    }
}
