package tema7.HeroesReino;

import java.util.ArrayList;

public class Guerrero extends Heroe {
    protected int fuerza;

    public Guerrero(String nombreHeroe, int nivel, int vida, ArrayList<Arma> armas, int fuerza) {
        super(nombreHeroe, nivel, vida, armas);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(nombreHeroe + " le ha metido un torton");
    }

    @Override
    public String toString() {

        return "Guerrero:" +
                "\n-nombreHeroe: " + nombreHeroe +
                "\n-nivel: " + nivel +
                "\n-vida: " + vida +
                "\n-fuerza: " + fuerza;
    }
}
