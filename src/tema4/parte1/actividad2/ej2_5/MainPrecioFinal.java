package tema4.parte1.actividad2.ej2_5;

public class MainPrecioFinal {
    public static void main(String[] args) {
        ComponentesPrecio componentesPrecio = new ComponentesPrecio(34.5, 87.4, 88);
        NumeroOrdenadores numeroOrdenadores = new NumeroOrdenadores();
        numeroOrdenadores.setNumeroOrdenadores(5);
        PrecioTotal precioTotal = new PrecioTotal(componentesPrecio, numeroOrdenadores);

        System.out.println("total = " + precioTotal.getPrecioFinal());
    }
}
