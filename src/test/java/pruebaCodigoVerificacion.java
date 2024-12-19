import static org.junit.jupiter.api.Assertions.assertEquals;
import Proyecto_Mundial_2023.Verificacion_Entradas;
import org.junit.jupiter.api.Test;
public class pruebaCodigoVerificacion {
    @Test
    public void testCodigoVerificacion1() {
        int resultado = Verificacion_Entradas.codigoVerificacion(12345);
        assertEquals(30, resultado, "El resultado esperado es 30");
    }

    @Test
    public void codigoVerificacionNumeroNegativo() {
        int resultado = Verificacion_Entradas.codigoVerificacion(-12345);
        assertEquals(0, resultado, "El resultado esperado es 0 para números negativos");
    }

    @Test
    public void codigoVerificacionNumeroCero() {
        int resultado = Verificacion_Entradas.codigoVerificacion(0);
        assertEquals(0, resultado, "El resultado esperado es 0 para el número 0");
    }
}