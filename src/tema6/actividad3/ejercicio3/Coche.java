package tema6.actividad3.ejercicio3;

public class Coche {
    protected String modelo;
    protected boolean motor;
    protected int ruedas;
    protected int cilindros;

    public Coche(int cilindros) {
        this.cilindros = cilindros;
        this.motor = true;
        this.ruedas = 4;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isMotor() {
        return motor;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void arrancar() {
        System.out.println(modelo + "arranca...");
    }

    public void acelerar() {
        System.out.println(modelo + "acelera...");
    }

    public void frenar() {
        System.out.println(modelo + "frena...");
    }
}

class CocheDeportivo extends Coche {
    public CocheDeportivo(int cilindros) {
        super(cilindros);
        this.modelo = "Coche Deportivo";
    }

    @Override
    public void arrancar() {
        System.out.println(modelo + " arranca con un rugido potente...");
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelera rápidamente...");
    }

    @Override
    public void frenar() {
        System.out.println(modelo + " frena con un sistema de frenos de alto rendimiento...");
    }
}

// Subclase para un coche familiar
class CocheFamiliar extends Coche {
    public CocheFamiliar(int cilindros) {
        super(cilindros);
        this.modelo = "Coche Familiar";
    }

    @Override
    public void arrancar() {
        System.out.println(modelo + " arranca suavemente...");
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelera de manera controlada...");
    }

    @Override
    public void frenar() {
        System.out.println(modelo + " frena con suavidad para la seguridad de la familia...");
    }
}

// Subclase para un coche eléctrico
class CocheElectrico extends Coche {
    public CocheElectrico(int cilindros) {
        super(cilindros);
        this.modelo = "Coche Eléctrico";
    }

    @Override
    public void arrancar() {
        System.out.println(modelo + " arranca en silencio...");
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " acelera de forma instantánea...");
    }

    @Override
    public void frenar() {
        System.out.println(modelo + " frena suvamente...");
    }
}
