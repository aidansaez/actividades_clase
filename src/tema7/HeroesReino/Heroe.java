package tema7.HeroesReino;

public class Heroe {
    protected String nombreHeroe;
    protected int nivel;
    protected int vida;
    protected Arma arma;

    public Heroe(String nombreHeroe, int nivel, int vida, Arma arma) {
        this.arma = arma;
        this.nivel = nivel;
        this.nombreHeroe = nombreHeroe;
        this.vida = vida;
    }
}
