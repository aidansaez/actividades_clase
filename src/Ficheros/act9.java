package Ficheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class act9 {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/empleados.bin");
        Empleado e1 = new Empleado("12345678Y", "Maria", 23, 2100);
        Empleado e2 = new Empleado("87654321P", "Pedro", 18, 1000);
        Empleado e3 = new Empleado("1111111U", "Juanito", 45, 3500);
        Empleado e4 = new Empleado("2222222J", "Koko", 34, 1999);

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e1);
            oos.writeObject(e2);
            oos.writeObject(e3);
            oos.writeObject(e4);
            fos.close();
            oos.close();
            System.out.println("Añadidos con éxito");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
