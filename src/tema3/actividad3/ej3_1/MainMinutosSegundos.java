package tema3.actividad3.ej3_1;

public class MainMinutosSegundos {
    public static void main(String[] args) {
        MinutosSegundos minutosSegundos = new MinutosSegundos(834, 34);
        System.out.println(minutosSegundos.obtenerMensajeDuracion(minutosSegundos.getMinutos(), minutosSegundos.getSegundos()));
        System.out.println(minutosSegundos.obtenerMensajeDuracion(9872));
    }
}
