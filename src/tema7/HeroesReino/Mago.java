package tema7.HeroesReino;

import java.util.ArrayList;

public class Mago  extends Heroe{
    protected int mana;

    public Mago(String nombreHeroe, int nivel, int vida, ArrayList<Arma> armas, int mana) {
        super(nombreHeroe, nivel, vida, armas);
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
                "\n-mana: " + mana;
    }
}
