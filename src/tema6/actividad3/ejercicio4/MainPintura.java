package tema6.actividad3.ejercicio4;

public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);

        Rectangulo rectangulo = new Rectangulo(20, 35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10, 30);

        pintura.PinturaNecesaria(rectangulo);
        pintura.PinturaNecesaria(esfera);
        pintura.PinturaNecesaria(cilindro);
    }
}
