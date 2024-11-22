package tema3.actividad1;

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora ();
        calculator.setPrimerNumero(5.0);
        calculator.setSegundoNumero(4);
        System.out.println("suma = " + calculator.getResultadoSuma());
        System.out.println("resta = " + calculator. getResultadoResta ());
        calculator.setPrimerNumero(5.25);
        calculator.setSegundoNumero(0);
        System.out.println("multiplicación = " + calculator.getMultiplicationResult());
        System.out.println("división = " + calculator.getDivisionResult());
    }
}
