package tema3.actividad9;

public class ej9_3 {
    public static int voltea(int num) {
        int volteado = 0;
        int digito;

        while (num > 0) {
            digito = num % 10;
            num = num/10;
            volteado = volteado * 10 + digito;
        }
        return volteado;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            if (i == voltea(i)) {
                System.out.println("Capicua: " + i);
            }
        }
    }
}
