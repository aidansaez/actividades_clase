package tema7.HeroesReino;

import java.util.ArrayList;

public class Arquero extends Heroe {
    protected int precision;

    public Arquero(String nombreHeroe, int nivel, int vida, ArrayList<Arma> armas, int precision) {
        super(nombreHeroe, nivel, vida, armas);
        this.precision = precision;
    }

    public void disparar() {
        System.out.println(nombreHeroe + " le ha metío un flechazo");
    }

    @Override
    public String toString() {
        return "Arquero:" +
                "\n-nombreHeroe: " + nombreHeroe +
                "\n-nivel: " + nivel +
                "\n-vida: " + vida +
                "\n-precision: " + precision;
    }
}