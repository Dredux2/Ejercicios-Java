package Ejercicios_Recuperacion;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class contarOcurrencias {
    public static void main(String[] args) {
        int[] array = new int[25];
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(100);
        }

        System.out.print("Ingresa un numero del 0 al 100: ");
        int num = sc.nextInt();
        int contador = 0;
        for (int valor : array){
            if (valor == num){
                contador++;
            }
        }
        System.out.println(contador);
        System.out.println(Arrays.toString(array));
    }
}
