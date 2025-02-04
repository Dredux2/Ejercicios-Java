package Ejercicios_Clase.Trimestre1;
import java.util.Scanner;
public class bateriaMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1");
        System.out.print("Introduce un número: ");
        Ejercicio1(sc);
        System.out.println("\nEjercicio 2");
        Ejercicio2();
        System.out.println("\nEjercicio 3");
        Ejercicio3();
        System.out.println("\nEjercicio 4");
        Ejercicio4();
    }

    public static void Ejercicio1(Scanner sc) {
        int a = sc.nextInt();
        int b = a * a * a;
        System.out.println("El cubo de " + a + " es " + b);
    }

    public static void Ejercicio2() {

    }

    public static void Ejercicio3() {

    }

    public static void Ejercicio4() {

    }
}
