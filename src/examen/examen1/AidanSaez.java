package examen.examen1;

import java.util.Scanner;

public class AidanSaez {
    public static String JugadorVSJugador() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre jugador1: ");
        String n1 = sc.next();
        System.out.print("Introduce tu nombre jugador2: ");
        String n2 = sc.next();

        int punt1 = 0;
        int punt2 = 0;

        int dado1 = random(6);
        int dado2 = random(6);

        while (dado1 == dado2) {
            dado1 = random(6);
            dado2 = random(6);
        }
        System.out.println(n1 + " ha sacado un " + dado1 + " y " + n2 + " ha sacado un " + dado2);

        int empezar;
        if (dado1 > dado2) {
            empezar = 2;
            System.out.println("Empieza " + n1);
        } else {
            empezar = 3;
            System.out.println("Empieza " + n2);
        }

        String sn = "n";
        int suma1 = 0;
        int suma2 = 0;
        int tirada = 1;
        int noint = 0;

        while (punt1 < 3 && punt2 < 3) {
            if (empezar % 2 == 0) {
                noint = 0;
                suma1 = 0;
                suma2 = 0;
                System.out.println("Juega " + n1);
                while (sn.equalsIgnoreCase("n")) {
                    int d1j1 = random(6);
                    int d2j1 = random(6);

                    int sumamom = d1j1 + d2j1;
                    suma1 += d1j1 + d2j1;
                    System.out.println("Tirada " + tirada + ": " + sumamom + " Total: " + suma1);
                    tirada++;

                    if (suma1 >= 14) {
                        System.out.println("A partir del 14 tiramos con un dado");
                        System.out.print("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }

                    while (suma1 >= 14 && sn.equalsIgnoreCase("n")) {
                        int d3j1 = random(6);
                        suma1 += d3j1;
                        System.out.println("Tirada" + tirada + ": " + d3j1 + " Total: " + suma1);
                        tirada++;

                        if (suma1 > 21 || suma1 == 21) {
                            break;
                        }

                        System.out.println("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }
                    if (suma1 > 21) {
                        System.out.println("Te has pasado de 21, ha ganado " + n2);
                        noint = 1;
                        break;
                    }
                    if (suma1 == 21) {
                        System.out.println("Ya has hecho 21 puntos");
                        break;
                    }
                }

                tirada = 1;
                sn = "n";

                System.out.println();
                System.out.println("Juega " + n2);
                while (sn.equalsIgnoreCase("n") && noint == 0) {
                    int d1j2 = random(6);
                    int d2j2 = random(6);

                    int sumamom = d1j2 + d2j2;
                    suma2 += d1j2 + d2j2;
                    System.out.println("Tirada" + tirada + ": " + sumamom + " Total: " + suma2);
                    tirada++;

                    if (suma2 >= 14) {
                        System.out.println("A partir del 14 tiramos con un dado");
                        System.out.print("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }

                    while (suma2 >= 14 && sn.equalsIgnoreCase("n")) {
                        int d3j2 = random(6);
                        suma2 += d3j2;
                        System.out.println("Tirada" + tirada + ": " + d3j2 + " Total: " + suma2);
                        tirada++;

                        if (suma2 > 21 || suma2 == 21) {
                            break;
                        }

                        System.out.println("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }
                    if (suma2 > 21) {
                        System.out.println("Te has pasado de 21, ha ganado " + n1);
                        break;
                    }
                }
                empezar++;

                if (suma1 == suma2) {
                    System.out.println("Empate, (ganador j1)");
                    punt1++;
                } else if (suma1 > 21) {
                    System.out.println(n1 + " se ha pasado, " + n2 + " gana");
                    punt2++;
                } else if (suma2 > 21) {
                    System.out.println(n2 + " se ha pasado, " + n1 + " gana");
                    punt1++;
                } else if (suma1 > suma2 && suma1 <= 21) {
                    System.out.println(n1 + " ha ganado");
                    punt1++;
                } else {
                    System.out.println(n2 + " ha ganado");
                    punt2++;
                }

                System.out.println("Puntuacion: " + n1 + " " + punt1 + " - " + punt2 + " " + n2);

            } else {
                suma1 = 0;
                suma2 = 0;
                noint = 0;
                System.out.println("Juega " + n2);
                while (sn.equalsIgnoreCase("n")) {
                    int d1j2 = random(6);
                    int d2j2 = random(6);

                    int sumamom = d1j2 + d2j2;
                    suma2 += d1j2 + d2j2;
                    System.out.println("Tirada" + tirada + ": " + sumamom + " Total: " + suma2);
                    tirada++;

                    if (suma2 >= 14) {
                        System.out.println("A partir del 14 tiramos con un dado");
                        System.out.print("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }

                    while (suma2 >= 14 && sn.equalsIgnoreCase("n")) {
                        int d3j2 = random(6);
                        suma2 += d3j2;
                        System.out.println("Tirada" + tirada + ": " + d3j2 + " Total: " + suma2);
                        tirada++;

                        if (suma2 > 21 || suma2 == 21) {
                            break;
                        }

                        System.out.print("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }
                    if (suma2 > 21) {
                        System.out.println("Te has pasado de 21, ha ganado " + n1);
                        noint = 1;
                        break;
                    }
                }

                tirada = 1;
                sn = "n";

                System.out.println();
                System.out.println("Juega " + n1);
                while (sn.equalsIgnoreCase("n") && noint == 0) {
                    int d1j1 = random(6);
                    int d2j1 = random(6);

                    int sumamom = d1j1 + d2j1;
                    suma1 += d1j1 + d2j1;
                    System.out.println("Tirada " + tirada + ": " + sumamom + " Total: " + suma1);
                    tirada++;

                    if (suma1 >= 14) {
                        System.out.println("A partir del 14 tiramos con un dado");
                        System.out.print("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }

                    while (suma1 >= 14 && sn.equalsIgnoreCase("n")) {
                        int d3j1 = random(6);
                        suma1 += d3j1;
                        System.out.println("Tirada" + tirada + ": " + d3j1 + " Total: " + suma1);
                        tirada++;

                        if (suma1 > 21 || suma1 == 21) {
                            break;
                        }

                        System.out.println("Quieres plantarte? (S/n): ");
                        sn = sc.next();
                    }
                    if (suma1 > 21) {
                        System.out.println("Te has pasado de 21, ha ganado " + n2);
                        break;
                    }
                    if (suma1 == 21) {
                        System.out.println("Ya has hecho 21 puntos");
                        break;
                    }
                }
                empezar++;

                if (suma1 == suma2) {
                    System.out.println("Empate, (ganador j1)");
                    punt1++;
                } else if (suma1 > 21) {
                    System.out.println(n1 + " se ha pasado, " + n2 + " gana");
                    punt2++;
                } else if (suma2 > 21) {
                    System.out.println(n2 + " se ha pasado, " + n1 + " gana");
                    punt1++;
                } else if (suma1 > suma2 && suma1 <= 21) {
                    System.out.println(n1 + " ha ganado");
                    punt1++;
                } else {
                    System.out.println(n2 + " ha ganado");
                    punt2++;
                }

                System.out.println("Puntuacion: " + n1 + " " + punt1 + " - " + punt2 + " " + n2);
            }
        }
        if (punt1 == 3) {
            return "VICTORIA FINAL " + n1;
        } else return "VICTORIA FINAL " + n2;
    }
    public static int random (int x) {
        return 1 + (int) (Math.random() * x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Jugar contra otro jugador");
        System.out.println("2. Jugar contra la maquina");
        System.out.println("3. Salir");
        System.out.print("Opcion: ");
        int opc = sc.nextInt();

        while (opc < 1 || opc > 3) {
            System.out.println("Opcion no valida");
            System.out.println("1. Jugar contra otro jugador");
            System.out.println("2. Jugar contra la maquina");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opc = sc.nextInt();
        }

        switch (opc) {
            case 1:
                System.out.println(JugadorVSJugador());
            case 3:
                break;
        }
    }
}
