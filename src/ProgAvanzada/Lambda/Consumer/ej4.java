package ProgAvanzada.Lambda.Consumer;

interface Frase {
    String[] dividir(String frase);
}

public class ej4 {
    public static void main(String[] args) {
        Frase frase = frase1 -> frase1.split(" ");

        for (String f : frase.dividir("Te voy a matar")) {
            System.out.println(f);
        }
    }
}
