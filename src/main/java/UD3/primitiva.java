package UD3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class primitiva {
    // Incomplete code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        System.out.print("Introduce los datos de tu boleto: ");
        String boleto = sc.nextLine();
        String listaNumeros[] = null;
        boolean formato = boleto.matches("\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}/\\d{0,9}");
        if (!formato){
            System.out.println("Formato de boleto incorrecto. Vuelva a intentarlo.");
        } else {
            listaNumeros = boleto.split("-/");
        }

        int sorteo[] = new int[6];
        int complementario = rm.nextInt(1,49);
        do {
            for (int i = 0; i < 6; i++){
                sorteo[i] = rm.nextInt(1,49);
                sorteo = Arrays.stream(sorteo).distinct().toArray();
                if (sorteo[i] != complementario){
                    sorteo[i] = rm.nextInt(1,49);
                }
            }
        } while (sorteo.length < 6);
    }
}
