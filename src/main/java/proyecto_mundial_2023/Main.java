package proyecto_mundial_2023;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int numeroTicket = sc.nextInt();
            int codigo = codigoVerificacion(numeroTicket);
            System.out.println(codigo);
        }
    }

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