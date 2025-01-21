package tema4.actividad5;

public class act5_1 {
    public static void main(String[] args) {
        /*
        1. Pues con métodos u objetos almacenar la información de esas cadenas y con un bucle.

        2. Str[0] = "Programación"

        3. No ya, que en una celda puede haber uno con 4 caracteres y en otra celda otro con 1 caracter

        4. Str[Str.length - 1] = "Java"

        5. Pues sin contener nada o un espacio es decir "" o " ".

        6. Contará cuantos caractere tiene cada celda de nuestro string.

        7.
         */

        System.out.println("-- Ejercicio 7 --");
        String[] str = {"Pera", "Manzana", "", "", "Naranja"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].isEmpty()){
                System.out.println("Posicion: " + i + ", esta vacía");
            } else System.out.println("Posicion: " + i + ", Texto: " + str[i]);
        }

        /*
        8.
        a. 5
        b.str.length
        c.
         */
        System.out.println();
        System.out.println("-- Ejercicio 8 --");
        String[] str2 = {">java", "Programa", "321", "0032.4", "severo"};
        System.out.println("Longitud" + str2.length);
        for (String i : str2) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("-- Ejercicio 9 --");
        String[] str3 = {">java", "Demo", "15", "79", "34", "68", "-20"};
        int sum = 0;
        for (int i = 2; i < str3.length; i++) {
            sum += Integer.parseInt(str3[i]);
        }
        System.out.println("Suma final: " + sum);

        //10. a.20      b.80    c.60    d.80    e.40
    }
}
