package Diccionario;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;
public class Diccionario {
    HashMap<String, String> traductor;
    public Diccionario(){
        traductor = new HashMap<>();
    }

    public void nuevoPar(String esp, String eng){
        traductor.put(esp,eng);
        System.out.println(esp + " y " + eng + " han sido añadidos al diccionario");
    }

    public void traduce(String esp){
        if (traductor.containsKey(esp)){
            System.out.print("La traducción de '" + esp + "' a ingles es: " + traductor.get(esp));
        } else {
            System.out.println("No se encontró '" + esp + "' en el diccionario");
        }
    }

    public void palabraRandom(){
        String[] claves = traductor.keySet().toArray(new String[0]);
        Random rm = new Random();
        int claveRandom = rm.nextInt(claves.length);
        String palabra = claves[claveRandom];
        System.out.println(palabra);
    }

    public void primeraLetraTraduccion(String esp){
        Stack<Character> pila = new Stack<>();
        for (char letra : traductor.get(esp).toCharArray()){
            pila.push(letra);
        }
        System.out.println("Primera letra de la palabra: " + pila.getFirst());
    }
}