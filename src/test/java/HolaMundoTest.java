import org.trabajo3.HolaMundo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HolaMundoTest {

    @Test
    void testSaludo() {
        HolaMundo hola = new HolaMundo();
        assertEquals("¡Hola Mundo!", hola.saludo());
    }
}