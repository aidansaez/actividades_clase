package tema2.actividad7;

public class act7_5d {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
