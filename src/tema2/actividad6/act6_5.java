package tema2.actividad6;

public class act6_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i+" ");
        }
        /*
        1. i=1 true i=3
        2. i=3 true i=5
        3. i=5 true i=7
        4. i=7 true i=9
        5. i=9 false
         */
        System.out.println();
        for (int i = 1; i <= 16; i=i*2) {
            System.out.print(i+" ");
        }
    }
}
