package tema2.actividad7;

public class act7_7 {
    public static void main(String[] args) {
        int c = 2;
        for (int i = 1; i <= 5; i += 1) {
            for (int j = 0; j < i; j++) {
                if (c % 2 == 0) {
                    System.out.print("* ");
                } else System.out.print("o ");
                c++;
            }
            System.out.println();
            c = 2;
        }
    }
}
