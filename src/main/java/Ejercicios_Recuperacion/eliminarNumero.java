package Ejercicios_Recuperacion;
import java.util.Arrays;
import java.util.Scanner;
public class eliminarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {56,12,32,81,66,5};
        System.out.println(Arrays.toString(array));

        System.out.print("Ingrese el indice que desea eliminar: ");
        int num = sc.nextInt();

        int array2[] = new int[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (i != num){
                array2[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}
