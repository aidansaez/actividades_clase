package tema4.parte1.actividad2.ej2_1;

public class ClienteVip {
    private String nombre;
    private double limiteCredito;
    private String email;
    private TipoVip tipoVIP;

    public enum TipoVip{GOLD, SILVER, NORMAL}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Constructor por defecto
    public ClienteVip() {
        this("aidan", 76, "hola@hola.com", TipoVip.GOLD);
    }

    //Constructor de 2
    public ClienteVip(String nombre, double limiteCredito) {
        this(nombre, limiteCredito, "hola@hola.com", TipoVip.SILVER);
    }

    //Constructor de 4

    public ClienteVip(String nombre, double limiteCredito, String email, TipoVip tipoVip) {
        this.nombre = nombre;
        this.limiteCredito = limiteCredito;
        this.email = email;
        this.tipoVIP = tipoVip;
    }
}
