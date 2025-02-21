package tema7.HeroesReino;

import java.util.ArrayList;

public class Asesino extends Heroe {
    protected int sigilo;

    public Asesino(String nombreHeroe, int nivel, int vida, ArrayList<Arma> armas, int sigilo) {
        super(nombreHeroe, nivel, vida, armas);
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
                "\n-sigilo: " + sigilo;
    }
}
