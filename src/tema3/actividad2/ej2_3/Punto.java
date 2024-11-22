package tema3.actividad2.ej2_3;

public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia() {
        return Math.sqrt(x * x + y * y);
    }

    public double distancia(int x, int y){
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distancia(Punto otro) {
        return Math.sqrt((otro.x - this.x) * (otro.x - this.x) + (otro.y - this.y) * (otro.y - this.y));
    }
}
