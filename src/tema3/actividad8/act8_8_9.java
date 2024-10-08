package tema3.actividad8;

public class act8_8_9 {
    public static void main(String[] args) {
        /*
        8.
        Imprimira el error de que el numero 1000 es muy grande.

        9.
        Imprime lo de entrar al try y salir de este.
         */

        int m = 50;
        try {
            System.out.println("Entrando en el try");
            if (m> 100)
                throw new Exception (m + " es muy grande");
            System.out.println("saliendo del bloque try");
        }catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
