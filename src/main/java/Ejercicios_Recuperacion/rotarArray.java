package Ejercicios_Recuperacion;

import java.util.Arrays;

public class rotarArray {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5};
        int array2[] = new int[array1.length];

        int ultimoValor = array1.length - 1;
        array2[0] = array1[ultimoValor];

        int j = 1;
        for (int i = 0; i < array1.length - 1; i++){
            array2[j] = array1[i];
            j++;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}