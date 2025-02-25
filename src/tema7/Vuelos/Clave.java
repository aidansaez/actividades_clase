package tema7.Vuelos;

public enum Clave {
    NUMERO, ORIGEN, DESTINO, DIA, CLASE;

    public static boolean existeClave(String clave) {
        for (Clave c : Clave.values()) {
            if (c.name().equalsIgnoreCase(clave)) {
                return true;
            }
        }
        return false;
    }
}
