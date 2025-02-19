package tema7.HeroesReino;

public class Guerrero extends Heroe {
    protected int fuerza;

    public Guerrero(String nombreHeroe, int nivel, int vida, Arma arma, int fuerza) {
        super(nombreHeroe, nivel, vida, arma);
        this.fuerza = fuerza;
    }

    public void atacar() {
        System.out.println(nombreHeroe + " le ha metido un torton con el/la " + arma.nombreArma);
    }

    @Override
    public String toString() {
        return "Guerrero:" +
                "\n-nombreHeroe: " + nombreHeroe +
                "\n-nivel: " + nivel +
                "\n-vida: " + vida +
                "\n-fuerza: " + fuerza +
                "\n-arma: " + (arma != null ? arma.nombreArma + "(Daño: " + arma.damage + ")" : "A puños");
    }
}
