package tema6.actividad5.ejercicio4_5_6;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
//        Rectangulo r = new Rectangulo(3, 2);
//        Triangulo t = new Triangulo(3, 5);
//
//        System.out.println("area: " + r.getArea() + ", perimetro: " + r.getPerimeter()); //t.getPerimeter();t.getArea();
//        r.redimensionar(2);
//        System.out.println("area: " + r.getArea() + ", perimetro: " + r.getPerimeter());

        Rectangulo[] rectangulos = {
                new Rectangulo(4, 8),
                new Rectangulo(3, 6),
                new Rectangulo(2, 7),
                new Rectangulo(9, 4),
                new Rectangulo(3, 6),
                new Rectangulo(6, 2),
                new Rectangulo(9, 5),
                new Rectangulo(4, 2),
                new Rectangulo(7, 8),
                new Rectangulo(9, 10)
        };

        Arrays.sort(rectangulos);
        System.out.println("Rectangulos segun su area");
        for (Rectangulo rectangulo : rectangulos) {
            System.out.println(rectangulo);
        }
    }
}
