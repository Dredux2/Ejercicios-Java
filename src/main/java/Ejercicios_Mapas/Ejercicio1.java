package Ejercicios_Mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> mapaPalabras = new HashMap<>();
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            mapaPalabras.put(palabra, mapaPalabras.getOrDefault(palabra, 0) + 1);
        }

        for (Map.Entry<String,Integer> palabra : mapaPalabras.entrySet()) {
            System.out.println("La palabra '" + palabra.getKey() + "' aparece " + palabra.getValue() + " veces.");
        }
    }
}
