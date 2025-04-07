package UD2;
import java.util.Scanner;
public class ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el ISBN: ");
        try {
            String isbn = sc.nextLine();
            String isbnLista[] = isbn.split("");

            int i = 10;
            int valor;
            int valorSumado = 0;
            for (String numero : isbnLista){
                if (numero.equals("X") && i == 1){
                    valor = 10;
                } else {
                    valor = i * Integer.parseInt(numero);
                }
                valorSumado += valor;
                i--;
            }

            int esMultiplo = valorSumado / 11;
            if (11 * esMultiplo == valorSumado){
                System.out.println("El ISBN es valido");
            } else {
                System.out.println("El ISBN no es valido");
            }
        } catch (NumberFormatException error){
            System.out.println("ERROR: ISBN incorrecto");
        }
    }
}