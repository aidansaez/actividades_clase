package tema2.actividad2;

public class act2_2 {
    public static void main(String[] args) {
        /*a.)
        int k = 0;
        switch (k) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        }
        Simplemente aqui sobra el case 1 ya que pone solo la k, entonces no puede ser 1, break del default */

        /*b.)
        int k = 0;
        switch (k + 1) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        El break del default(}) */

        /*c
        int k = 6;
        switch (k / 3.0) {
            case 2:
                System.out.println("zero");
                break;
            case 3:
                System.out.println("one");
                break;
            default:
                System.out.println("default");
                break;
        }
        Aqui lo que pasa es que el switch no permite doubles entonces no funciona y habria que corregirlo haciendo que sea un int */

        /*d
        int k = 6;
        switch (k / 3) {
            case 1:
                System.out.println("zero");
                break;
            case 3:
                System.out.println("one");
                break;

         Lo que ocurre es que falta el cierre de llave y que no hay case 2 que es el que da el resultado*/

        /*e
        int k = 3;
        switch (k) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
            default:
                System.out.println("default");
        }
        Lo que pasa aqui es que al ser 3 el valor por defecto y no hay breaks en ninguno pues dara three four default entonces habra que poner breaks*/

        /*f
        int k = 3;
        switch (k) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }

        Aqui lo que pasa es que dara three four porque no hay un break despues del case 3*/

        /*g
        int k = 1;
        switch (k) {
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default");
        }

        Aqui pasan varias cosas; una de ellas es que no pasa nada si fuese case 1, otra que no hay breaks en el case 1 por lo que seguira y dara el del 2. */

        /*h
        int k = 1;
        switch (k) {
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 2:
                System.out.println("four");
                break;
        }

        Aqui lo mismo que el anterior añadiendo que el case 2 se repite, por lo que es erroneo ya que eso no se puede hacer */
        /*i
        int k = 1;
        switch (k) {
            case 1:
            case 2:
                System.out.println("one");
                System.out.println("two");
                break;
            System.out.println("four");
        }

        Lo que pasa aqui es que no se puede poner un "sout" despues de un break ya que "corta" hasta ahi y ya no se puede mas y tambien que no hay nada en el case 1 como en los dos ultimos casos */
    }
}
