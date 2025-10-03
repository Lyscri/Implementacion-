import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.List;


public class NumeroMayorTest {
    @Test
    void unSoloElemento() {
        List<Integer> numeros = List.of(42);
        assertEquals(42, NumeroMayor.encontrarMayor(numeros));
    }
}