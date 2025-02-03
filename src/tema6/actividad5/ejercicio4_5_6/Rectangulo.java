package tema6.actividad5.ejercicio4_5_6;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{
    protected double alto;
    protected double ancho;

    public Rectangulo(double alto, double ancho) {
        super(4);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double getPerimeter() {
        return  2 * (alto + ancho);
    }

    @Override
    public double getArea() {
        return alto*ancho;
    }

    @Override
    public void redimensionar(int x) {
        this.alto = alto * x;
        this.ancho = ancho * x;

        System.out.println("Ahora el ancho es " + ancho + " y el alto " + alto);
    }

    @Override
    public int compareTo(Rectangulo o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public String toString() {
        return "Rectangulo --> Ancho: " + ancho + ", alto: " + alto +  ", area: " + getArea();
    }
}
