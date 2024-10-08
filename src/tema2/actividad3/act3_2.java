package tema2.actividad3;

import java.util.Scanner;

public class act3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor inicial: ");
        int contador = sc.nextInt();
        System.out.print("Valor limite: ");
        int vl = sc.nextInt();

        while (contador <= vl) {
            System.out.println("Valor inicial es ahora: " + contador);
            contador = contador + 1;
        }

        System.out.println("Fin, el valor inicial ahora es " + contador);

        //3. lo ira imprimiendo hasta que llegue a 1. no iniciara el while ya que 9 ya es mayor.
    }
}
