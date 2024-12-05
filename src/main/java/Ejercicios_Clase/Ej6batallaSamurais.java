package Ejercicios_Clase;
import java.util.Random;
import java.util.Scanner;
public class Ej6batallaSamurais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];
        int bajas1 = 0;
        int bajas2 = 0;

        System.out.println("Equipo 1");
        // Bucle infinito hasta que la suma de los numeros sea 30
        while (true) {
            System.out.print("Introduce la fuerza de ataque de los 7 samurais: ");
            String Entrada = sc.nextLine();
            // Uso ".split" para definir los caracteres que pueden dividir la cadena, incluido los espacios en blanco.
            String[] subEntrada = Entrada.split("[-,|_\\s/]+");
            if (subEntrada.length != 7) {
                System.out.println("ERROR: Debes ingresar 7 valores.\n");
                continue;
            }

            try {
                for (int i = 0; i < equipo1.length; i++) {
                    // Ahora que tengo los caracteres, los convierto a numeros enteros.
                    equipo1[i] = Integer.parseInt(subEntrada[i]);
                }

                // Sumo cada numero del equipo para comprobar que la suma es igual a 30
                int sumaEquipo1 = 0;
                for (int j : equipo1) {
                    sumaEquipo1 += j;
                }

                if (sumaEquipo1 == 30) {
                    System.out.println("Equipo 1 completado\n");
                    break;
                } else {
                    System.out.println("La fuerza de ataque de todos los samurais debe ser 30. Vuelve a intentarlo.\n");
                }
            } catch (NumberFormatException e){
                System.out.println("ERROR: Todos los valores deben ser números enteros.\n");
            }
        }

        System.out.println("Equipo 2");
        // Bucle infinito hasta que la suma de los numeros sea 30
        while (true) {
            System.out.print("Introduce la fuerza de ataque de los 7 samurais: ");
            String Entrada = sc.nextLine();
            // Uso ".split" para definir los caracteres que pueden dividir la cadena, incluido los espacios en blanco.
            String[] subEntrada = Entrada.split("[-,|_\\s/]+");
            if (subEntrada.length != 7) {
                System.out.println("ERROR: Debes ingresar 7 valores.\n");
                continue;
            }

            try {
                for (int i = 0; i < equipo2.length; i++) {
                    // Ahora que tengo los caracteres, los convierto a numeros enteros.
                    equipo2[i] = Integer.parseInt(subEntrada[i]);
                }

                // Sumo cada numero del equipo para comprobar que la suma es igual a 30
                int sumaEquipo2 = 0;
                for (int j : equipo2) {
                    sumaEquipo2 += j;
                }

                if (sumaEquipo2 == 30) {
                    System.out.println("Equipo 2 completado\n");
                    break;
                } else {
                    System.out.println("La fuerza de ataque de todos los samurais debe ser 30. Vuelve a intentarlo.\n");
                }
            } catch (NumberFormatException e){
                System.out.println("ERROR: Todos los valores deben ser números enteros.\n");
            }
        }

        int random = rm.nextInt(7);
        System.out.println("Empieza la batalla con el samurai " + (random + 1));
        System.out.println("-----------------------------------");

        while (bajas1 < 4 && bajas2 < 4) {
            // Estas variables tomaran el numero del indice cuyo valor sea equivalente al numero random
            // Por ejemplo, si random es 2, samurai1 tomará el numero del tercer indice de equipo1: equipo1[2]
            int samurai1 = equipo1[random];
            int samurai2 = equipo2[random];

            System.out.println("Samurai " + (random + 1) + ". " + samurai1 + " vs " + samurai2);

            if (samurai1 > samurai2) {
                System.out.println("Gana el Equipo 1\n");
                equipo2[random] = 0;
                bajas2++;
            } else if (samurai1 < samurai2) {
                System.out.println("Gana el Equipo 2\n");
                equipo1[random] = 0;
                bajas1++;
            } else {
                System.out.println("Empate, ambos samuráis mueren\n");
                equipo1[random] = 0;
                equipo2[random] = 0;
                bajas1++;
                bajas2++;
            }
            // Avanza al siguiente samurai
            random = (random + 1) % 7;
        }

        if (bajas1 > bajas2){
            System.out.println("¡Gana el Equipo 1!, han tenido " + bajas1 + " bajas.");
        } else if (bajas1 == bajas2) {
            System.out.println("¡Empate!");
            System.out.println("Equipo 1 ha tenido " + bajas1 + " bajas.");
            System.out.println("Equipo 2 ha tenido " + bajas2 + " bajas.");
        } else {
            System.out.println("¡Gana el Equipo 2!, han tenido " + bajas1 + " bajas.");
        }
    }
}