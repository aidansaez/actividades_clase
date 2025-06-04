package temaX.Ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/empleados.bin");
        Scanner sc = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("DNI: ");
            String dni = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Sueldo: ");
            int sueldo = sc.nextInt();
            sc.nextLine();
            empleados.add(new Empleado(dni, nombre, edad, sueldo));
        }

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Empleado e : empleados) {
                oos.writeObject(e);
            }
            fos.close();
            oos.close();
            System.out.println("Añadidos con éxito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
