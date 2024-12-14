package proyecto_mundial_2023;
import java.util.Scanner;
public class Main {
    /**
     * Metodo principal que lee el número de casos y los números de ticket,
     * calcula el código de verificación para cada ticket y lo imprime.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int numeroTicket = sc.nextInt();
            int codigo = codigoVerificacion(numeroTicket);
            System.out.println(codigo);
        }
    }

    /**
     * Calcula el código de verificación para un número de ticket dado.
     * La lógica de cálculo depende del último dígito del número de ticket.
     *
     * @param numeroTicket El número de ticket para el cual se calcula el código de verificación.
     * @return El código de verificación calculado.
     */
    public static int codigoVerificacion(int numeroTicket) {
        int codigo = 0;
        int digito;
        int entrada = numeroTicket;
        while (entrada > 0) {
            digito = entrada % 10;
            codigo += (digito * ((numeroTicket % 10) % 2 == 0 ? 3 : 2));
            entrada /= 10; // Reducir el valor de entrada
        }
        return codigo;
    }
}