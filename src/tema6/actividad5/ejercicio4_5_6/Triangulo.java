package tema6.actividad5.ejercicio4_5_6;

public class Triangulo extends Forma{
    protected double alto;
    protected double ancho;

    public Triangulo(double alto, double ancho) {
        super(3);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return ancho*alto/2;
    }

    @Override
    public double getPerimeter() {
        return ancho*3;
    }
}
