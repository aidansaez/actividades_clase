package tema6.actividad1;

import java.util.Scanner;

public class Vehiculo {
    protected String nombre;
    protected int velocidad;

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }
}

class Coche extends Vehiculo {
    int ruedas;
    String matricula;

    public Coche(String nombre, int velocidad, int ruedas, String matricula) {
        super(nombre, velocidad);
        this.ruedas = ruedas;
        this.matricula = matricula;
    }

    public void Mover(int num) {
        Scanner sc = new Scanner(System.in);

        String mover = "Estado del vehiculo con matricula " + matricula + ": ";

        while (num != 0) {
            if (num == 1) {
                System.out.println(mover + "moviendose");
            } else if (num == 2) {
                System.out.println(mover + "parado");
            }
            System.out.println();

            System.out.println("(1)Mover, (2)Parar, (0)Salir");
            System.out.print("Que quieres hacer ahora? ");
            num = sc.nextInt();
        }

        System.out.println("Saliendo...");
    }
}

class Combustion extends Coche {
    protected int marcha;

    public Combustion(String nombre, int velocidad, int ruedas, String matricula, int marchas) {
        super(nombre, velocidad, ruedas, matricula);
        this.marcha = marchas;
    }

    public void CambiarMarcha(int num) {
        Scanner sc = new Scanner(System.in);

        String mover = "Marcha del vehiculo con matricula " + matricula + ": ";

        while (num != 0) {
            switch (num) {
                case 1:
                    this.marcha = 1;
                    System.out.println(mover + marcha);
                    break;
                case 2:
                    this.marcha = 2;
                    System.out.println(mover + marcha);
                    break;
                case 3:
                    this.marcha = 3;
                    System.out.println(mover + marcha);
                    break;
                case 4:
                    this.marcha = 4;
                    System.out.println(mover + marcha);
                    break;
                case 5:
                    this.marcha = 5;
                    System.out.println(mover + marcha);
                    break;
                case 6:
                    this.marcha = 6;
                    System.out.println(mover + marcha);
            }

            System.out.println();
            System.out.println("(1-6)Marcha, (0)Salir");
            System.out.print("Que marcha quieres meter? ");
            num = sc.nextInt();
        }

        System.out.println("Saliendo...");
    }
}

class Electrico extends Coche {
    protected int baterias;

    public Electrico(String nombre, int velocidad, int ruedas, String matricula, int baterias) {
        super(nombre, velocidad, ruedas, matricula);
        this.baterias = baterias;
    }

    public void Baterias(int num) {
        Scanner sc = new Scanner(System.in);
        String bateriasString = "Baterias del vehiculo con matricula " + matricula + ": ";

        while (num != 0) {
            System.out.print("Cuantas baterías tiene? ");
            num = sc.nextInt();
            baterias = num;
            System.out.println(bateriasString + baterias);
        }

        System.out.println("Saliendo...");
    }
}