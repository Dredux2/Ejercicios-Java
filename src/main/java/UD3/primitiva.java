package UD3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class primitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.print("Introduce los datos de tu boleto: ");
        String boleto = sc.nextLine();
        boolean formato = boleto.matches("\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}/\\d{0,9}");
        if (!formato){
            System.out.print("ERROR: Formato de boleto incorrecto");
        } else {
            String listaNumeros[] = boleto.split("[-/]");
            System.out.println(Arrays.toString(listaNumeros));

            int sorteo[] = new int[6];
            int complementario = rm.nextInt(1,49);
            int reintegro = rm.nextInt(9);
            do {
                for (int i = 0; i < 6; i++){
                    sorteo[i] = rm.nextInt(1,49);
                    if (sorteo[i] == complementario){
                        sorteo[i] = rm.nextInt(1,49);
                    }
                }
                sorteo = Arrays.stream(sorteo).distinct().toArray();
            } while (sorteo.length < 6);

            System.out.println("\nSORTEO:");
            System.out.println(Arrays.toString(sorteo));
            System.out.println("Numero Complementario: " + complementario);
            System.out.println("Reintegro: " + reintegro);

            System.out.println("\nRESULTADOS:");
            int coincidencias = 0;
            for (int i = 0; i < 6; i++){
                int numJugador = Integer.parseInt(listaNumeros[i]);
                for (int numBoleto : sorteo){
                    if (numJugador == numBoleto){
                        coincidencias++;
                    }
                }
            }
            System.out.println(coincidencias + " acierto/s");
            if (Integer.parseInt(listaNumeros[6]) == reintegro){
                System.out.println("Reintegro");
            }
        }
    }
}