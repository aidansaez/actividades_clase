package tema4.parte1.actividad2.ej2_4;

public class MainSueloAlfombra {
    public static void main(String[] args) {
        Alfombra alfombra = new Alfombra(3.5);
        Suelo suelo = new Suelo(2.75, 4.0);
        Calculadora calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
        alfombra = new Alfombra(1.5);
        suelo = new Suelo(5.4, 4.5);
        calculadora = new Calculadora(suelo, alfombra);
        System.out.println("total= " + calculadora.getCosteTotal());
    }
}
