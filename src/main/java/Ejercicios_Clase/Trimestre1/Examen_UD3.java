package Ejercicios_Clase.Trimestre1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Clase principal que genera un número aleatorio de bolas,
 * solicita al usuario que introduzca los datos de su cartón,
 * y muestra si el cartón es ganador o no.
 */
public class Examen_UD3 {
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);

        // Genéro un número de bolas (Array) entre 10 a 40
        int[] numBolas = new int[rm.nextInt(10, 40)];
        // Lleno el array con valores aleatorios de 1 a 90
        for (int i = 0; i < numBolas.length; i++) {
            numBolas[i] = rm.nextInt(1, 90);
        }

        // Elimino las bolas que se repiten
        numBolas = Arrays.stream(numBolas).distinct().toArray();

        // Solicito al usuario que introduzca los datos de su cartón
        int[][] carton = new int[3][3];
        System.out.println("*** INTRODUZCA LOS DATOS DE SU CARTON [N-N-N] ***");
        for (int i = 0; i < carton.length; i++){
            System.out.print("Fila " + (i + 1) + ": ");
            String fila = sc.next();

            // Compruebo que los valores introducidos sean válidos
            if (!fila.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}")){
                System.out.println("\nERROR: Los valores introducidos no son validos. Vuelva a intentarlo.");
                i--;
                continue;
            }

            // Convierto los valores de la fila a un array separado por "-"
            String[] filaArray = fila.split("-");
            // Convierto los valores del array a enteros y los guardo en el cartón
            for (int j = 0; j < filaArray.length; j++) {
                carton[i][j] = Integer.parseInt(filaArray[j]);
            }
        }

        // Muestro el cartón introducido por el usuario
        System.out.println("\n*** SU CARTÓN ES ***");
        for (int[] fila : carton){
            for (int numero : fila){
                System.out.print(numero + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Muestro las bolas premiadas
        System.out.print(numBolas.length + " Bolas premiadas: ");
        for (int i : numBolas){
            System.out.print(i + " ");
        }

        // Le paso los valores de las bolas premiadas y el cartón al metodo Comparar
        Comparar(numBolas, carton);
    }

    /**
     * Metodo que compara los números del array numBolas con los números del cartón y determina si el cartón es ganador.
     *
     * @param numBolas Array de números de bolas premiadas.
     * @param carton Matriz de números del cartón del usuario.
     */
    public static void Comparar(int[] numBolas, int[][] carton) {
        boolean ganador = true;
        for (int[] fila : carton) {
            for (int numero : fila) {
                // Compruebo si todos los valores del cartón están en las bolas premiadas mediante allMatch
                if (Arrays.stream(numBolas).noneMatch(bola -> bola == numero)) {
                    ganador = false;
                }
            }
        }

        // Muestro el resultado de la comparación
        if (ganador) {
            System.out.println("\n¡BINGO!");
        } else {
            System.out.println("\nLo siento, su cartón no es el ganador.");
        }
    }
}