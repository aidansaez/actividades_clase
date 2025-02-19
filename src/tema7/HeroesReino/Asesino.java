package tema7.HeroesReino;

public class Asesino extends Heroe {
    protected int sigilo;

    public Asesino(String nombreHeroe, int nivel, int vida, Arma arma, int sigilo) {
        super(nombreHeroe, nivel, vida, arma);
        this.sigilo = sigilo;
    }

    public void asesinar() {
        System.out.println(nombreHeroe + "lo ha rajao primo");
    }

    @Override
    public String toString() {
        return "Asesino:" +
                "\n-nombreHeroe: " + nombreHeroe +
                "\n-nivel: " + nivel +
                "\n-vida: " + vida +
                "\n-sigilo: " + sigilo +
                "\n-arma: " + (arma != null ? arma.nombreArma + "(Daño: " + arma.damage + ")" : "A puños");
    }
}
