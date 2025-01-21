package tema6.actividad1;

public class Circulo {
    protected double radio;

    public Circulo(double radio) {
        if (radio < 0) {
            this.radio = 0;
        } else this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }
}

class Cilindro extends Circulo {
    protected double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        if (altura < 0 ) {
            this.altura = 0;
        } else this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getVolume() {
        return getArea() * altura;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}