package Proyecto_Mundial_2023;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Verificacion_Entradas {
    /**
     * Metodo principal que lee el número de casos y los números de ticket,
     * calcula el código de verificación para cada ticket y lo imprime.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int casos = sc.nextInt();
            // Leo los números de ticket y calculo el código de verificación
            for (int i = 0; i < casos; i++) {
                int numeroTicket = sc.nextInt();
                // Calculo y muestro el código de verificación
                int codigo = codigoVerificacion(numeroTicket);
                System.out.println(codigo);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        }
    }

    /**
     * Metodo que calcula el código de verificación para un número de ticket dado.
     * La lógica de cálculo depende del último dígito del número de ticket.
     *
     * @param numeroTicket El número de ticket para el cual se calcula el código de verificación.
     * @return El código de verificación calculado.
     */
    public static int codigoVerificacion(int numeroTicket) {
        int codigo = 0;
        int digitoActual;
        int ultimoDigito = numeroTicket;
        while (ultimoDigito > 0) {
            // Obtener el último dígito del número de ticket
            digitoActual = ultimoDigito % 10;
            // Multiplicar el dígito por 2 o 3 según el último dígito del número de ticket
            codigo += (digitoActual * ((numeroTicket % 10) % 2 == 0 ? 3 : 2));
            // Eliminar el último dígito del número de ticket para la siguiente iteración
            ultimoDigito /= 10;
        }
        return codigo;
    }
}