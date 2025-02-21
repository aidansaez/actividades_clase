package tema7.HeroesReino;

import java.util.ArrayList;

public class Heroe {
    protected String nombreHeroe;
    protected int nivel;
    protected int vida;
    protected ArrayList<Arma> armas;

    public Heroe(String nombreHeroe, int nivel, int vida, ArrayList<Arma> armas) {
        this.nombreHeroe = nombreHeroe;
        this.nivel = nivel;
        this.vida = vida;
        this.armas = armas;
    }
}
