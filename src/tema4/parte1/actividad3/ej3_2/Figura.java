package tema4.parte1.actividad3.ej3_2;

public class Figura {
    public double area(double radio) {
        if (radio < 0) {
            return -1.0;
        } else return Math.PI * Math.pow(radio, 2);
    }
    public double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }else return x * y;
    }
    public double area(double Bm, double bm, double h) {
        if (Bm < 0 || bm < 0 || h < 0) {
            return -1;
        } else return ((Bm + bm) / 2) * h;
    }
}
