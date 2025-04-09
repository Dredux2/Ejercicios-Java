package UD3;
import java.util.Arrays;
import java.util.Scanner;
public class sopaLetras {
    // Incomplete code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            if (!palabra.matches("[a-zA-Z]+") || palabra.length() < columnas || palabra.length() > columnas){
                System.out.println("ERROR: Introduce datos validos (" + columnas + " Letras).\n");
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
            String buscar = sc.nextLine();

            if (!buscar.matches("[a-zA-Z]+")){
                System.out.println("ERROR: Palabra no valida");
            } else {
                String letrasBuscar[] = buscar.split("");
                String letrasEncontradas[] = letrasBuscar;
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        if (matriz[0][j].equals(letrasBuscar[j])){
                            letrasEncontradas[j] = letrasBuscar[j];
                        }
                    }
                }
                System.out.println(Arrays.toString(letrasBuscar));
                System.out.println(Arrays.toString(letrasEncontradas));
            }
        }
    }
}
