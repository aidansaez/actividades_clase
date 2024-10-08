package tema2.actividad7;

public class act7_1_2_3 {
    public static void main(String[] args) {
        //1.) No es correcto porque es infinito
        //2.) Imprime numeros hasta que iguale los 4 caracteres
        for (int i=0; i<4; i++) {
            for (int j=i; j>=0; j--)
                System.out.print(j);
            System.out.println();
        }
        //3.) Imprime cadenas de numeros menos el 123
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j < i; j++) {
                if(i == 4)
                    break;
                System.out.print(j);
            }
            System.out.println( );
        }

    }
}
