package tema3.actividad8;

import java.util.Scanner;

public class act8_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Coordenadas: ");
        int x = sc.nextInt();
        try {
            if (x < 0) throw new Exception("Valor negativo en la coordenada " + "(" + x + ")");
        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
