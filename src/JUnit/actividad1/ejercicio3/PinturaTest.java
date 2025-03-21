package JUnit.actividad1.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void TestToString() {
        assertEquals("nombre=Esfera", new Esfera(3).toString());
        assertEquals("nombre=Rectangulo", new Rectangulo(3, 5).toString());
        assertEquals("nombre=Cilindro", new Cilindro(3, 5).toString());
    }

    @Test
    void TestDevolverArea() {
        assertEquals(4*Math.PI*3*3, new Esfera(3).area());
        assertEquals(15, new Rectangulo(3,5).area());
        assertEquals(Math.PI*3*3*5, new Cilindro(3,5).area());
    }

    @Test
    void TestPinturaNecesaria() {
        Rectangulo rectangulo = new Rectangulo(3,6);
        assertEquals(9, new Pintura(2).PinturaNecesaria(rectangulo));
    }
}