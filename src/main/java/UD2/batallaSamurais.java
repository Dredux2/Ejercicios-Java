package UD2;
import java.util.Random;
import java.util.Scanner;
public class batallaSamurais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        String primerEquipo[] = null, segundoEquipo[] = null;
        boolean potenciaValida = false;
        int potenciaSamurai = 0;
        try {
            System.out.println("Equipo 1:");
            while (!potenciaValida){
                System.out.print("Introduce la potencia de los samurais: ");
                String equipo1 = sc.nextLine();
                primerEquipo = equipo1.split(" ");

                for (String samurai : primerEquipo){
                    potenciaSamurai += Integer.parseInt(samurai);
                }

                if (potenciaSamurai == 30){
                    potenciaValida = true;
                    potenciaSamurai = 0;
                } else {
                    System.out.println("ERROR: La potencia total no suma 30\n");
                    potenciaSamurai = 0;
                }
            }
            System.out.println("Equipo 1 Completado");
            potenciaValida = false;

            System.out.println("\nEquipo 2:");
            while (!potenciaValida){
                System.out.print("Introduce la potencia de los samurais: ");
                String equipo2 = sc.nextLine();
                segundoEquipo = equipo2.split(" ");

                for (String samurai : segundoEquipo){
                    potenciaSamurai += Integer.parseInt(samurai);
                }

                if (potenciaSamurai == 30){
                    potenciaValida = true;
                } else {
                    System.out.println("ERROR: La potencia total no suma 30\n");
                    potenciaSamurai = 0;
                }
            }
            System.out.println("Equipo 2 Completado");

            System.out.println("\n¡Empieza la batalla!");
            int batalla = rm.nextInt(7);
            System.out.println("¡La batalla inicia con los samurais con el dorsal nº" + (batalla + 1) + "¡");
            for (int i = 0; i < 7; i++){
                if (Integer.parseInt(primerEquipo[batalla]) > Integer.parseInt(segundoEquipo[batalla])){
                    System.out.println("Samurai " + (batalla + 1) + ": "
                            + Integer.parseInt(primerEquipo[batalla]) + " VS "
                            + Integer.parseInt(segundoEquipo[batalla]) + ". ¡Gana el equipo 1!");
                    segundoEquipo[batalla] = String.valueOf(0);
                } else if (Integer.parseInt(primerEquipo[batalla]) < Integer.parseInt(segundoEquipo[batalla])) {
                    System.out.println("Samurai " + (batalla + 1) + ": "
                            + Integer.parseInt(primerEquipo[batalla]) + " VS "
                            + Integer.parseInt(segundoEquipo[batalla]) + ". ¡Gana el equipo 2!");
                    primerEquipo[batalla] = String.valueOf(0);
                } else {
                    System.out.println("Samurai " + (batalla + 1) + ": "
                            + Integer.parseInt(primerEquipo[batalla]) + " VS "
                            + Integer.parseInt(segundoEquipo[batalla]) + ". ¡Empate!");
                    primerEquipo[batalla] = String.valueOf(0);
                    segundoEquipo[batalla] = String.valueOf(0);
                }
                if (batalla == 6){
                    batalla = 0;
                } else {
                    batalla++;
                }
            }

            int contador1 = 0, contador2 = 0;
            for (String samuraiMuerto : primerEquipo){
                if (Integer.parseInt(samuraiMuerto) == 0){
                    contador1++;
                }
            }
            for (String samuraiMuerto : segundoEquipo){
                if (Integer.parseInt(samuraiMuerto) == 0){
                    contador2++;
                }
            }

            if (contador1 > contador2){
                System.out.println("¡EQUIPO 1 GANA! El equipo 1 ha tenido " + contador1 + " bajas");
            } else if (contador2 > contador1){
                System.out.println("¡EQUIPO 2 GANA! El equipo 2 ha tenido " + contador2 + " bajas");
            } else {
                System.out.println("¡EMPATE! Ambos equipos tienen " + contador1 + " bajas");
            }
        } catch (NumberFormatException error){
            System.out.println("ERROR: Valores incorrectos");
        }
    }
}