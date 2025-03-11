package tema7.actividad5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {
    public enum TipoCuerpoCeleste {
        ESTRELLA, PLANETA, PLANETA_ENANO, LUNA, COMETA, ASTEROIDE;
    }

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;

    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return satelites;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }

    public boolean addSatelite(CuerpoCeleste cuerpoCeleste) {
        if (satelites.contains(cuerpoCeleste)) {
            return false;
        } else {
            satelites.add(cuerpoCeleste);
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this.nombre == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return Double.compare(periodoOrbital, that.periodoOrbital) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(satelites, that.satelites) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, periodoOrbital, satelites, tipoCuerpo);
    }

    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", tipoCuerpo=" + tipoCuerpo +
                ", periodoOrbital=" + periodoOrbital +
                '}';
    }
}
