package tema4.parte1.actividad2.ej2_2;

public class MuroMain {
    public static void main(String[] args) {
        Muro muro = new Muro(5,4);
        System.out.println("area= " + muro.getArea());

        muro.setAlto(-1.5);
        System.out.println("ancho= " + muro.getAncho());
        System.out.println("alto= " + muro.getAlto());
        System.out.println("area= " + muro.getArea());
    }
}
