import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuboTest {
    Cubo cubo;

    @BeforeEach
    void setUp() {
        cubo = new Cubo(3, 5);
    }

    @Test
    void volume() {
        assertEquals(125, cubo.volume(), "Il volume deve essere 125");
    }

    @Test
    void superficie() {
        assertTrue(cubo.superficie() > 0, "La superficie per definizione deve essere maggiore di 0");
    }

    @Test
    void testToString() {
        assertTrue("Sono un solidoSono un cubo, la mia superficie è 150,00 e il mio volume è 125,00".equals(cubo.toString()));
    }
}