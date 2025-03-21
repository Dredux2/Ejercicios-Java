package Ejercicios_Mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<Character, Integer> mapaLetras = new HashMap<>();
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        for (Character letra : palabra.toCharArray()) {
            mapaLetras.put(letra, mapaLetras.getOrDefault(letra, 0) + 1);
        }

        for (Map.Entry<Character,Integer> letra : mapaLetras.entrySet()) {
            System.out.println("La letra " + letra.getKey() + " aparece " + letra.getValue() + " veces.");
        }
    }
}