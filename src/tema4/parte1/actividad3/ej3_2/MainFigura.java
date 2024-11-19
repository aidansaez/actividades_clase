package tema4.parte1.actividad3.ej3_2;

public class MainFigura {
    public static void main(String[] args) {
        Figura figura1 = new Figura();
        System.out.println(figura1.area(5));
        System.out.println(figura1.area(-1));
        System.out.println(figura1.area(5,4));
        System.out.println(figura1.area(-1,4));
        System.out.println(figura1.area(8,6,4) + " cm2");
    }
}
