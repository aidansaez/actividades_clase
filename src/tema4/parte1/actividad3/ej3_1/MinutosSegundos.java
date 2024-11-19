package tema4.parte1.actividad3.ej3_1;

public class MinutosSegundos {
    private int minutos, segundos;

    public MinutosSegundos(int minutos, int segundos) {
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String obtenerMensajeDuracion(int min, int seg) {
        if (min >= 0 && seg >= 0 && seg <= 59) {
            int horas = 0;
            for (; min >= 60; horas++) {
                min -= 60;
            }
            return horas + "h " + min + "m " + seg + "s";
        } else return "Valor inválido";
    }

    public String obtenerMensajeDuracion(int seg) {
        int min = 0;
        if (seg >= 0) {
            while (seg >= 60) {
               min++;
               seg -= 60;
            }
            return obtenerMensajeDuracion(min, seg);
        }else return "Valor inválido";
    }
}
