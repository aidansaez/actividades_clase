package JUnit.ejercicio3;

public class Forma {
    protected String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
}

class Esfera extends Forma {
    protected double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4*Math.PI*radio*radio;
    }
}

class Rectangulo extends Forma {
    protected double longitud;
    protected double ancho;

    public Rectangulo(double longitud, double ancho) {
        super("Rectangulo");
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double area() {
        return longitud*ancho;
    }
}

class Cilindro extends Forma {
    protected double radio;
    protected double altura;

    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio*altura;
    }
}

class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double PinturaNecesaria(Forma forma) {
        return forma.area() / cobertura;
    }
}