package tema2.actividad7;

public class act7_5b {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <= c; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
