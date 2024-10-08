package tema1.actividades5;

public class act5 {
    public static void main(String[] args) {

        int cuadrado = 5;
        System.out.println("area cuadrado: " + Math.pow(cuadrado, 2) + "cm");

        int lr1 = 8;
        int lr2 = 4;
        System.out.println("perimetro rectangulo: " + 2 * (lr1 + lr2) + "cm");

        int bt = 18;
        int ht = 15;
        System.out.println("area triangulo: " + (bt * ht) / 2 + "cm");

        double rc = 7.5;
        System.out.println("area circulo: " + Math.pow(rc, 2) * Math.PI + "cm");
        System.out.println("perimetro circulo: " + 2 * Math.PI * rc + "cm");
    }
}
