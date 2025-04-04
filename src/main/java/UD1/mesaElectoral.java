package UD1;
import java.util.Scanner;
public class mesaElectoral {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Como te llamas?");
        String nombre = sc.nextLine();

        System.out.print("Hola " + nombre + ", Introduce tu edad: ");
        int edad = sc.nextInt();

        while (edad < 0) {
            System.out.print("Introduce de nuevo tu edad: ");
            edad = sc.nextInt();
        }

        if (edad < 18) {
            System.out.println("Lo siento " + nombre + ", no puedes votar");
            System.out.println("Te falta(n) " + (18 - edad) + " año(s) para ser mayor de edad");
        } else {
            System.out.println("Enhorabuena " + nombre + ", puedes votar");
        }
    }
}
