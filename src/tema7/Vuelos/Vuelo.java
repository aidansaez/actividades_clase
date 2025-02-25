package tema7.Vuelos;

public class Vuelo {
    protected String numero;
    protected String origen;
    protected String destino;
    protected String dia;
    protected String clase;

    public Vuelo(String numero, String origen, String destino, String dia, String clase) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.clase = clase;
    }

    @Override
    public String toString() {
        return "numero:" + numero + '\'' +
                ", origen: " + origen + '\'' +
                ", destino: " + destino + '\'' +
                ", dia: " + dia + '\'' +
                ", clase: " + clase + '\'' +
                '}';
    }

    public String getValorPorClave(Clave clave) {
        return switch (clave) {
            case NUMERO -> numero;
            case ORIGEN -> origen;
            case DESTINO -> destino;
            case DIA -> dia;
            case CLASE -> clase;
        };
    }
}
