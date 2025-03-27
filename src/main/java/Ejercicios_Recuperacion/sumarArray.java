package Ejercicios_Recuperacion;
import java.util.Random;
public class sumarArray {
    public static void main(String[] args) {
        Random rm = new Random();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++){
            array[i] = rm.nextInt(500);
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++){
            suma += array[i];
        }
        System.out.println(suma);
    }
}