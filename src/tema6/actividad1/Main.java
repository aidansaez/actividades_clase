package tema6.actividad1;

public class Main {
    public static void main(String[] args) {
        /*
        Video ob1 = new Video(90, 900, "VHS");
        Pelicula ob2 = new Pelicula(90, 900 ,"VHS", "myke", 5);
        VideoMusical ob3 = new VideoMusical(45, 60, "Siuuu", "cr7", "furbo");
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString()); */

        Coche opel = new Coche("Opel Astra", 67, 4, "0122");
        opel.Mover(3);

        Combustion seat = new Combustion("Leon", 34, 3, "2345", 4);
        seat.CambiarMarcha(2);

        Electrico tesla = new Electrico("Cybertruck", 452, 6, "7853", 2);
        tesla.Baterias(2);
    }
}
