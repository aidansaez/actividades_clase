package JUnit.actividad1.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImpresoraTest {
    @Test
    void testImprimirDobleCaraActivada() {
        boolean dobleCara = true;
        int niveldeToner = 50;
        int NPaginas = 10;
        Impresora impresora = new Impresora(dobleCara, niveldeToner, NPaginas);
        int entrada = 10;
        int salidaEsperada = 5;
        int salidaRecibida = impresora.imprimirNPaginas(entrada);
        assertEquals(salidaEsperada, salidaRecibida);
    }

    @Test
    void testAnadirToner() {
        Impresora impresora = new Impresora(false, 50, 50);
        assertEquals(100, impresora.anadirToner(50));
    }
}