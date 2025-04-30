import java.util.Scanner;
//Aidan Sáez y Pau Lledó
public class MainConcurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            int n = sc.nextInt();
            String n1 = String.valueOf(n);

            int[] num = new int[n1.length()];
            for (int j = 0; j < n1.length(); j++) {
                num[j] = Integer.parseInt(n1.substring(j, j+1));
            }

            int suma = 0;
            for (int j = 0; j < num.length; j++) {
                if (j % 2 != 0) {
                    int menor = 0;
                    for (int k = 0; k < num.length - (j + 1); k++) {
                        if (num[j+(k+1)] < menor){
                            menor = num[j+(k+1)];
                        }
                    }
                    suma += (num[j] * 3 + menor);
                } else {
                    int mayor = 0;
                    int contador = j;
                    for (int k = j; k != 0 ; k--) {
                        if (num[j-contador] > mayor) {
                            mayor = num[j-contador];
                        }
                        contador--;
                    }
                    suma += (num[j] * 2 + mayor);
                }
            }

            System.out.println(suma);
        }
    }
}
