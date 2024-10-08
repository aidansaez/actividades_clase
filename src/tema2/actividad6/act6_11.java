package tema2.actividad6;

public class act6_11 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int j = 0; j <= 8; j=j+2 ) {
            sumEven = j;
            System.out.print(sumEven+" ");
        }
        System.out.println();
        for (int j = 1; j <= 8; j=j+2 ) {
            sumOdd = j;
            System.out.print(sumOdd+" ");
        }
    }
}
