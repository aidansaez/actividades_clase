package tema7.HeroesReino;

public class Mago  extends Heroe{
    protected int mana;

    public Mago(String nombreHeroe, int nivel, int vida, Arma arma, int mana) {
        super(nombreHeroe, nivel, vida, arma);
        this.mana = mana;
    }

    public void hechizar() {
        System.out.println(nombreHeroe + " lo ha dejao embobao con su hechizo.");
    }

    @Override
    public String toString() {
        return "Mago:" +
                "\n-nombreHeroe: " + nombreHeroe +
                "\n-nivel: " + nivel +
                "\n-vida: " + vida +
                "\n-mana: " + mana +
                "\n-arma: " + (arma != null ? arma.nombreArma + "(Daño: " + arma.damage + ")" : "A puños");
    }
}
