package tema2.actividad8;

public class act8_7 {
    public static void main(String[] args) {
        try {
            for (int k = 0; k < 5; k++){
                System.out.println(100 / k);
            }
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
            e.printStackTrace();
        }
    }
}
