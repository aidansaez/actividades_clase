package tema4.parte1.actividad1;

public class Calculadora {
    private double primerNumero;
    private double segundoNumero;

    public double getPrimerNumero() {
        return primerNumero;
    }

    public double getSegundoNumero() {
        return segundoNumero;
    }

    public void setPrimerNumero(double primerNumero) {
        this.primerNumero = primerNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public double getResultadoSuma() {
        return primerNumero + segundoNumero;
    }

    public double getResultadoResta() {
        return primerNumero - segundoNumero;
    }

    public double getMultiplicationResult() {
        return primerNumero * segundoNumero;
    }

    public  double getDivisionResult() {
        if (segundoNumero == 0) {
            return 0;
        }
        return primerNumero / segundoNumero;
    }
}
