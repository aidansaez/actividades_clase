package tema2.actividad4;

public class act4_5 {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println(contador);
            if (contador % 4 == 0) {
                System.out.println("Múltiplo de 4 encontrado. Salir");
                contador = 10;
            }
            contador++;
        } while (contador <= 10);
        /*
        a.) Basicamente intentar encontrar multiplos de 4, hasta que no encuentra no para
        b.) 4
        c.) 5
        d.) 4
        e.)
        1a c=1 true c=2
        2a c=2 true c=3
        3a c=3 true c=4
        4a c=4 false c=10
        f.) que cuando haga el if termine el programa
        g.) solo se ejecutaria una vez porque 0%4 = 0
         */
    }
}
