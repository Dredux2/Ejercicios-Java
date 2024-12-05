package Ejercicios_Clase;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej8sopaLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Solicita el numero de filas de la sopa de letras
            System.out.print("Introduce un numero de filas: ");
            int filas = sc.nextInt();

            // Solicita el numero de columnas de la sopa de letras
            System.out.print("Introduce un numero de columnas: ");
            int columnas = sc.nextInt();

            // Inicializa la matriz de la sopa de letras
            char[][] sopa = new char[filas][columnas];
            for (int i = 0; i < filas; i++) {
                // Solicita las letras de cada fila
                System.out.print("Introduce las letras de la fila " + (i + 1) + ": ");
                String letras = sc.next();

                // Verifica que las letras introducidas sean solo letras y que sean igual al número de columnas
                while (!letras.matches("[a-zA-Z]+") || letras.length() != columnas) {
                    System.out.println("ERROR");
                    System.out.print("Introduce las letras de la fila " + (i + 1) + ": ");
                    letras = sc.next();
                }

                // Llena la fila de la sopa de letras con los caracteres de la palabra
                for (int j = 0; j < columnas; j++) {
                    sopa[i][j] = letras.charAt(j);
                }
            }

            // Imprime la sopa de letras
            for (int i = 0; i < sopa.length; i++) {
                for (int j = 0; j < sopa[i].length; j++) {
                    // Imprime cada letra de la sopa de letras
                    System.out.print(sopa[i][j] + " ");
                }
                System.out.println();
            }

            // Solicita la palabra a buscar en la sopa de letras
            System.out.println("\nIntroduce la palabra a buscar: ");
            String buscar = sc.next();
            boolean encontrada = false;
            // Inicializa las posiciones de la palabra en la sopa de letras
            int posInicial;
            int posFinal;

            // Busca la palabra en las filas de la sopa de letras
            for (int i = 0; i < sopa.length; i++) {
                // Recorre las columnas de la sopa de letras
                for (int j = 0; j <= sopa[i].length - buscar.length(); j++) {
                    encontrada = true;
                    // Compara las letras de la palabra con las letras de la sopa de letras
                    for (int k = 0; k < buscar.length(); k++) {
                        // Si no coinciden las letras, la palabra no se encuentra en la sopa de letras
                        if (sopa[i][j + k] != buscar.charAt(k)) {
                            encontrada = false;
                        }
                    }

                    // Si se encontró la palabra en la sopa de letras, imprime la posición
                    if (encontrada) {
                        posInicial = i + 1;
                        posFinal = j + 1;
                        System.out.println("¡Encontrada!, Empieza en la posición: (" + posInicial + ", " + posFinal + ")");
                    }
                }
            }

            // Si no se encontró en las filas, busca la palabra en las columnas de la sopa de letras
            if (!encontrada) {
                // Recorre las columnas de la sopa de letras
                for (int j = 0; j < sopa[0].length; j++) {
                    // Recorre las filas de la sopa de letras
                    for (int i = 0; i <= sopa.length - buscar.length(); i++) {
                        encontrada = true;
                        // Compara las letras de la palabra con las letras de la sopa de letras
                        for (int k = 0; k < buscar.length(); k++) {
                            // Si no coinciden las letras, la palabra no se encuentra en la sopa de letras
                            if (sopa[i + k][j] != buscar.charAt(k)) {
                                encontrada = false;
                            }
                        }

                        // Si se encontró la palabra en la sopa de letras, imprime la posición
                        if (encontrada) {
                            posInicial = i + 1;
                            posFinal = j + 1;
                            System.out.println("¡Encontrada!, Empieza en la posición: (" + posInicial + ", " + posFinal + ")");
                        }
                    }
                }
            }

            // Si no se encontró la palabra en la sopa de letras, imprime un mensaje
            if (!encontrada) {
                System.out.println("\nLa palabra no se encontró en la sopa de letras.");
            }

        } catch (InputMismatchException e) {
            // Maneja la excepción si el usuario no introduce un número entero
            System.out.println("ERROR: Debes introducir un numero entero");
        }
    }
}