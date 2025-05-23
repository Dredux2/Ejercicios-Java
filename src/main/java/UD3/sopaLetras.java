package UD3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class sopaLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el número de filas: ");
            int filas = sc.nextInt();

            System.out.print("Introduce el número de columnas: ");
            int columnas = sc.nextInt();

            String matriz[][] = new String[filas][columnas];
            sc.nextLine();

            boolean valido = false;
            for (int i = 0; i < filas; i++) {
                System.out.print("Introduce las letras de la fila " + (i + 1) + ": ");
                String palabra = sc.nextLine();
                if (!palabra.matches("[a-zA-Z]+") || palabra.length() != columnas){
                    System.out.print("ERROR: Introduce datos validos (" + columnas + " Letras).");
                    valido = false;
                    break;
                } else {
                    String letras[] = palabra.split("");
                    for (int j = 0; j < columnas; j++) {
                        matriz[i][j] = letras[j];
                    }
                    valido = true;
                }
            }

            if (valido){
                // region Imprimir matriz
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(matriz[i][j] + " ");
                    }
                    System.out.println();
                }
                // endregion

                System.out.print("\nIntroduce la palabra a buscar: ");
                String buscar = sc.nextLine().toLowerCase();
                if (!buscar.matches("[a-zA-Z]+")){
                    System.out.print("ERROR: Palabra no valida");
                } else {
                    boolean encontrada = false;
                    // region Horizontal
                    for (int i = 0; i < filas; i++) {
                        String fila = "";
                        for (int j = 0; j < columnas; j++) {
                            fila += matriz[i][j].toLowerCase();
                            if (fila.contains(buscar)) {
                                encontrada = true;
                                int posicionJ;
                                if (buscar.length() < j){
                                    posicionJ = (j - buscar.length()) + 1;
                                } else {
                                    posicionJ = (buscar.length() - j) + 1;
                                }
                                System.out.println("Encontrada!!! En la posicion " + i + " " + posicionJ);
                                break;
                            }
                        }
                        if (encontrada){
                            break;
                        }
                    }
                    // endregion

                    // region Vertical
                    if (!encontrada) {
                        for (int j = 0; j < columnas; j++) {
                            String columna = "";
                            for (int i = 0; i < filas; i++) {
                                columna += matriz[i][j].toLowerCase();
                                if (columna.contains(buscar)) {
                                    encontrada = true;
                                    int posicionI;
                                    if (buscar.length() < i){
                                        posicionI = (i - buscar.length()) + 1;
                                    } else {
                                        posicionI = (buscar.length() - i) + 1;
                                    }
                                    System.out.println("Encontrada!!! En la posicion " + posicionI + " " + j);
                                    break;
                                }
                            }
                            if (encontrada){
                                break;
                            }
                        }
                    }
                    // endregion
                }
            }
        } catch (InputMismatchException error){
            System.out.print("ERROR: Valores incorrectos");
        }
    }
}