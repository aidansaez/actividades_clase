package tema4.parte1.actividad2.ej2_3;

public class PuntoMain {
    public static void main(String[] args) {
        Punto primero = new Punto(6, 5);
        Punto segundo = new Punto(3, 1);
        System.out.println("distancia(0,0)= " + primero.distancia());
        System.out.println("distancia(segundo)= " + primero.distancia(segundo));
        System.out.println("distancia(2,2)= " + primero.distancia(2, 2));
        Punto punto = new Punto();
        System.out.println("distancia()= " + punto.distancia());
    }
}
