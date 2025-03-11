package tema7.actividad5;

public class Planeta extends CuerpoCeleste {
    public Planeta(String nombrePlaneta, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombrePlaneta, periodoOrbital, tipoCuerpo);
    }

    public boolean addSatelite(CuerpoCeleste cuerpoCeleste) {
        if (cuerpoCeleste.getTipoCuerpo() == TipoCuerpoCeleste.LUNA) {
            return super.addSatelite(cuerpoCeleste);
        } else return false;
    }
}
