package Ejercicios_Clase;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ej7Primitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        System.out.print("Intoduce los datos de tu boleto [N-N-N-N-N-N/R]: ");
        String boleto = sc.nextLine();

        while (!boleto.matches("\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}-\\d{1,49}/\\d{1,9}")) {
            System.out.println("\nERROR: Formato incorrecto, vuelve a intentarlo.");
            System.out.print("Intoduce los datos de tu boleto [N-N-N-N-N-N/R]: ");
            boleto = sc.nextLine();
        }

        String[] subBoleto = boleto.split("[-,|_\\s/]+");
        int[] boletoUsuario = new int[6];
        for (int i = 0; i < 6; i++) {
            boletoUsuario[i] = Integer.parseInt(subBoleto[i]);
        }
        int reintegroUsuario = Integer.parseInt(subBoleto[6]);
        System.out.println("Su boleto es: " + Arrays.toString(boletoUsuario));
        System.out.println("Su número de reintegro es: " + reintegroUsuario);

        int[] boletoPremiado;
        int[] Complementario = new int[1];
        int Reintegro = rm.nextInt(1, 10);

        do {
            boletoPremiado = new int[6];
            for (int i = 0; i < boletoPremiado.length; i++) {
                boletoPremiado[i] = rm.nextInt(49) + 1;
            }
            boletoPremiado = Arrays.stream(boletoPremiado).distinct().toArray();
        } while (boletoPremiado.length < 6);

        do {
            Complementario[0] = rm.nextInt(49) + 1;
        } while (Arrays.stream(boletoPremiado).anyMatch(num -> num == Complementario[0]));

        System.out.println("\nEl Boleto Premiado es: " + Arrays.toString(boletoPremiado));
        System.out.println("Numero Complementario: " + Complementario[0]);
        System.out.println("Numero de Reintegro: " + Reintegro);

        int Aciertos = 0;
        for (int j : boletoUsuario) {
            for (int i : boletoPremiado) {
                if (j == i) {
                    Aciertos++;
                }
            }
        }

        System.out.println("\nRESULTADOS: ");
        System.out.println(Aciertos + " aciertos");
        if (reintegroUsuario == Reintegro) {
            System.out.print("Tiene Reintegro");
        } else {
            System.out.print("No tiene Reintegro");
        }
    }
}