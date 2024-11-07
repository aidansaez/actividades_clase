package tema4.actividad2.ej2_5;

public class PrecioTotal {
    private ComponentesPrecio componentes;
    private NumeroOrdenadores numPCs;

    public PrecioTotal(ComponentesPrecio componentes, NumeroOrdenadores numPCs) {
        this.componentes = componentes;
        this.numPCs = numPCs;
    }

    public double getPrecioFinal() {
        return componentes.total() * numPCs.getNumeroOrdenadores();
    }
}
