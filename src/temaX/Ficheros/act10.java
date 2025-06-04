package temaX.Ficheros;

import java.io.*;

public class act10 {
    public static void main(String[] args) {
        File f = new File("C:/ficheros/empleados.bin");

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                Empleado empleado = (Empleado) ois.readObject();
                if (empleado.getSueldo() >= 2000) {
                    System.out.println(empleado);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
