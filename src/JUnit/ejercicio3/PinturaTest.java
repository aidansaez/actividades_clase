package JUnit.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void TestPinturaNecesaria() {
        Rectangulo rectangulo = new Rectangulo(3,6);
        assertEquals(9, new Pintura(2).PinturaNecesaria(rectangulo));
    }
}