package Ejercicios_Clase.Trimestre1;
import java.util.Random;
import java.util.Scanner;
public class bateriaMatrices {
    public static void Ejercicio1(Scanner sc) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Ejercicio 1: ");
        System.out.print("Inserta un número a buscar en la matriz: ");
        int num = sc.nextInt();

        // Recorro la matriz y busco el número
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                // Si el número se encuentra en la matriz, imprimo la posición
                if (matriz[filas][columnas] == num) {
                    System.out.println("El número " + num + " se encuentra en la posición [" + filas + "][" + columnas + "]\n");
                }
            }
        }
    }

    public static void Ejercicio2(Random rm) {
        int filas = rm.nextInt(5) + 1;
        int columnas = rm.nextInt(5) + 1;
        int[][] matriz = new int[filas][columnas];

        // Relleno la matriz con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rm.nextInt(10);
            }
        }

        System.out.println("Ejercicio 2: ");
        System.out.println("Matriz: ");
        // Imprimo la matriz
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Suma de filas: ");
        int suma = 0;
        // Sumo los elementos de cada fila
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + suma);
            suma = 0;
        }
        System.out.println();

        System.out.print("Suma de columnas: \n");
        // Sumo los elementos de cada columna
        for (int i = 0; i < matriz[0].length; i++) {
            // Recorro las filas y sumo los elementos de la columna i
            for (int[] ints : matriz) {
                suma += ints[i];
            }
            System.out.println("Columna " + i + ": " + suma);
            suma = 0;
        }
    }

    public static void Ejercicio3(Scanner sc) {
        System.out.println("\nEjercicio 3: ");
        System.out.print("¡Hola!, ¿Cuantos estudiantes tienes?: ");
        int estudiantes = sc.nextInt();

        System.out.print("¿Y cuantas asignaturas tienen?: ");
        int asignaturas = sc.nextInt();

        String[][] matriz = new String[estudiantes + 1][asignaturas + 1];
        System.out.println();

        // Relleno la matriz con los nombres de los estudiantes y las asignaturas
        for (int i = 0; i < estudiantes; i++) {
            System.out.print("Nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.next();
            // Relleno la primera columna de la matriz con los nombres de los estudiantes
            matriz[i + 1][0] = nombre;
        }
        System.out.println();

        // Relleno la matriz con los nombres de las asignaturas
        for (int j = 0; j < asignaturas; j++) {
            System.out.print("Nombre de la asignatura " + (j + 1) + ": ");
            String asignatura = sc.next();
            // Relleno la primera fila de la matriz con los nombres de las asignaturas
            matriz[0][j + 1] = asignatura;
        }
        System.out.println();

        // Relleno la matriz con las notas de los estudiantes
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.print("Introduce la nota de " + matriz[i][0] + " en " + matriz[0][j] + ": ");
                matriz[i][j] = Float.toString(sc.nextFloat());
            }
        }
        System.out.println();

        float media_estudiante = 0;
        // Calculo la media de cada estudiante
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                media_estudiante += Float.parseFloat(matriz[i][j]);
            }
            System.out.println("La media de " + matriz[i][0] + " es: " + media_estudiante / asignaturas);
            // Reinicio la variable para el siguiente estudiante
            media_estudiante = 0;
        }
        System.out.println();

        float media_asignatura = 0;
        // Calculo la media de cada asignatura
        for (int j = 1; j < matriz[0].length; j++) {
            for (int i = 1; i < matriz.length; i++) {
                media_asignatura += Float.parseFloat(matriz[i][j]);
            }
            System.out.println("La media de " + matriz[0][j] + " es: " + media_asignatura / estudiantes);
            // Reinicio la variable para la siguiente asignatura
            media_asignatura = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        Ejercicio1(sc);
        Ejercicio2(rm);
        Ejercicio3(sc);
    }
}