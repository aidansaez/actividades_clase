package JUnit.actividad1.ejercicio1;

public class Impresora {
    protected int niveldeToner;
    protected int NPaginas;
    protected boolean dobleCara;

    public Impresora(boolean dobleCara, int niveldeToner, int NPaginas) {
        this.dobleCara = dobleCara;
        this.niveldeToner = niveldeToner;
        this.NPaginas = NPaginas;
    }

    public int anadirToner(int tonerParaAnadir) {

        if (tonerParaAnadir < 1 || tonerParaAnadir > 100) {
            return -1;
        } else if ((tonerParaAnadir + niveldeToner) > 100) {
            return -1;
        } else {
            niveldeToner += tonerParaAnadir;
            return niveldeToner;
        }
    }

    public int imprimirNPaginas(int paginasImprimir) {
        if (dobleCara) {
            NPaginas = NPaginas / 2;
        } else {
            NPaginas += paginasImprimir;
        }
        return NPaginas;
    }

    public int getNPaginas() {
        return NPaginas;
    }

    public boolean isDobleCara() {
        return dobleCara;
    }

    public int getNiveldeToner() {
        return niveldeToner;
    }


}
