package Ejercicios_Clase.Trimestre1;
import java.time.Year;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Examen_UD2 {
    public static void ejercicio1(Scanner sc) {
        Random rm = new Random();
        String opcionMaquina;
        int marcadorMaquina = 0;
        int marcadorUsuario = 0;

        for (int ronda = 1; ronda <= 3; ronda++) {
            int random = rm.nextInt(3);
            System.out.println("Ronda " + ronda);
            System.out.print("(p/a/t) ¿Piedra, Papel o Tijera?: ");
            String opcion = sc.next();
            if (opcion.equals("p") || opcion.equals("a") || opcion.equals("t")){
                switch (random){
                    case 0:
                        opcionMaquina = "Piedra";
                        System.out.println("!Elijo " + opcionMaquina + "¡");
                        if (opcion.equals("a")){
                            marcadorUsuario++;
                        } else if (opcion.equals("t")) {
                            marcadorMaquina++;
                        }
                        break;

                    case 1:
                        opcionMaquina = "Papel";
                        System.out.println("!Elijo " + opcionMaquina + "¡");
                        if (opcion.equals("t")){
                            marcadorUsuario++;
                        } else if (opcion.equals("p")) {
                            marcadorMaquina++;
                        }
                        break;

                    case 2:
                        opcionMaquina = "Tijera";
                        System.out.println("!Elijo " + opcionMaquina + "¡");
                        if (opcion.equals("p")){
                            marcadorUsuario++;
                        } else if (opcion.equals("a")) {
                            marcadorMaquina++;
                        }
                        break;
                }
                System.out.println("Marcador actual (PC-Usuario): " + marcadorMaquina + "-" + marcadorUsuario);
                System.out.println();
            } else {
                System.out.println("ERROR: Introduce un valor valido: p/a/t");
                System.out.println();
                ronda--;
            }
        }
        if (marcadorMaquina > marcadorUsuario){
            System.out.println("¡Perdiste!, Bien jugado");
            System.out.println();
        } else if (marcadorUsuario > marcadorMaquina) {
            System.out.println("¡Enhorabuena!, Ganaste. Bien jugado.");
            System.out.println();
        } else {
            System.out.println("¡Empate!, Juguemos de nuevo.");
            System.out.println();
        }
    }

    public static void ejercicio2(Scanner sc) {
        try {
            int thisYear = Year.now().getValue();
            int edadPasada = -1;
            System.out.print("Dime tu año de nacimiento: ");
            int anyo = sc.nextInt();
            if (anyo >= 1900 && anyo <= thisYear) {
                for (int anyoPasado = anyo; anyoPasado <= thisYear; anyoPasado++) {
                    edadPasada++;
                    System.out.println(anyoPasado + " - edad: " + edadPasada);
                }
            } else {
                System.out.println("Error: Debes ingresar una fecha mayor a 1900 o menor al año actual.");
            }
        } catch (InputMismatchException e1) {
            System.out.println("Error: Debes ingresar un numero valido.");
            sc.nextLine();
        }
    }

    public static void ejercicio3(Scanner sc) {
        System.out.println();
        System.out.println("Acabo de pensar en un número entre 0 y 100. ¿Puedes adivinarlo en 10 intentos?");
        Random rm = new Random();
        int numRandom = rm.nextInt(101);
        int intentos = 0;
        while (intentos < 10) {
            try {
                System.out.print("Intento " + (intentos + 1) + ". Di un número: ");
                int num = sc.nextInt();
                intentos++;

                if (num == numRandom) {
                    System.out.println("¡Acertaste! El número era: " + numRandom);
                    return;
                } else if (num < numRandom) {
                    System.out.println("Mi número es mayor.");
                } else {
                    System.out.println("Mi número es menor.");
                }
                System.out.println();
            } catch (InputMismatchException e2) {
                System.out.println("Por favor, introduce un número válido.");
                System.out.println();
                sc.nextLine();
            }
        }
        System.out.println("¡Fallaste! El número era: " + numRandom);
        System.out.println();
    }


    public static void ejercicio4(Scanner sc) {
        try {
            System.out.print("Introduce un año: ");
            int year = sc.nextInt();
            int bisiestos = 0;
            int thisYear = Year.now().getValue();

            if (year >= 1900 && year <= thisYear){
                while (year <= thisYear){
                    if (Year.isLeap(year)){
                       bisiestos++;
                    }
                    year++;
                }
                System.out.println("Ha habido " + bisiestos + " bisiestos");
            } else {
                System.out.println("ERROR: Fecha fuera de rango. [1900-Año Actual]");
            }
        } catch (InputMismatchException e3){
            System.out.println("ERROR: Introduce un valor valido.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejercicio1(sc);
        ejercicio2(sc);
        ejercicio3(sc);
        ejercicio4(sc);
        sc.close();
    }
}