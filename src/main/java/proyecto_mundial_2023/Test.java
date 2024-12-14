package proyecto_mundial_2023;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class MainTest {
    /**
     * Prueba que verifica que el metodo devuelve el código correcto
     * cuando el último dígito del número de ticket es par.
     */
    @Test
    void codigoVerificacion_ReturnsCorrectCodeForEvenLastDigit() {
        int numeroTicket = 2468;
        int expectedCodigo = 2 * 3 + 4 * 3 + 6 * 3 + 8 * 3;
        int actualCodigo = Main.codigoVerificacion(numeroTicket);
        assertEquals(expectedCodigo, actualCodigo);
    }

    /**
     * Prueba que verifica que el metodo devuelve el código correcto
     * cuando el último dígito del número de ticket es impar.
     */
    @Test
    void codigoVerificacion_ReturnsCorrectCodeForOddLastDigit() {
        int numeroTicket = 1357;
        int expectedCodigo = 1 * 2 + 3 * 2 + 5 * 2 + 7 * 2;
        int actualCodigo = Main.codigoVerificacion(numeroTicket);
        assertEquals(expectedCodigo, actualCodigo);
    }

    /**
     * Prueba que verifica que el metodo devuelve cero
     * cuando el número de ticket es cero.
     */
    @Test
    void codigoVerificacion_ReturnsZeroForZeroTicket() {
        int numeroTicket = 0;
        int expectedCodigo = 0;
        int actualCodigo = Main.codigoVerificacion(numeroTicket);
        assertEquals(expectedCodigo, actualCodigo);
    }

    /**
     * Prueba que verifica que el metodo devuelve el código correcto
     * cuando el número de ticket es un solo dígito.
     */
    @Test
    void codigoVerificacion_ReturnsCorrectCodeForSingleDigitTicket() {
        int numeroTicket = 5;
        int expectedCodigo = 5 * 2;
        int actualCodigo = Main.codigoVerificacion(numeroTicket);
        assertEquals(expectedCodigo, actualCodigo);
    }

    /**
     * Prueba que verifica que el metodo devuelve el código correcto
     * cuando el número de ticket es un número grande.
     */
    @Test
    void codigoVerificacion_ReturnsCorrectCodeForLargeNumber() {
        int numeroTicket = 987654321;
        int expectedCodigo = 9 * 2 + 8 * 2 + 7 * 2 + 6 * 2 + 5 * 2 + 4 * 2 + 3 * 2 + 2 * 2 + 1 * 2;
        int actualCodigo = Main.codigoVerificacion(numeroTicket);
        assertEquals(expectedCodigo, actualCodigo);
    }
}