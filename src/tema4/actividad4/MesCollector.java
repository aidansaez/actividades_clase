package tema4.actividad4;

import java.time.Year;

public class MesCollector {
    private int mes;
    private int anyo;
    private int diasMes;
    private int[] temperatura;

    public MesCollector(int mes, int anyo) {
        this.mes = mes;
        this.anyo = anyo;

        if (Year.isLeap(anyo) && mes == 2) {
            diasMes = 29;
        } else if (mes == 2) {
            diasMes = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = 30;
        } else diasMes = 31;

        if (mes > 12 || mes < 1) {
            diasMes = 0;
        }

        this.temperatura = new int[diasMes];
    }

    public int getTemperatura(int dia) {
        if (dia >= 1 && dia <= diasMes) {
            return temperatura[dia - 1];
        } else {
            return -1;
        }
    }

    public void setTemperatura(int dia, int temp) {
        if (dia >= 1 && dia <= diasMes) {
            temperatura[dia - 1] = temp;
        }
    }

    @Override
    public String toString() {
        if (mes == 0 || diasMes == 0) {
            return "Mes inválido.";
        }

        String resultado = "Mes: " + mes + ", Año: " + anyo + ", Días en el mes: " + diasMes + "\n";
        resultado += "Temperaturas:\n";

        for (int i = 0; i < diasMes; i++) {
            resultado += "Día " + (i + 1) + ": ";
            if (temperatura[i] == 0) {
                resultado += "No hay datos\n";
            } else {
                resultado += temperatura[i] + "°C\n";
            }
        }

        return resultado;
    }
}
