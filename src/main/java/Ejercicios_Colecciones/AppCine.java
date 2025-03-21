package Ejercicios_Colecciones;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class AppCine {
    static Random rm = new Random();
    static Queue<Persona> cola = new LinkedList<>();
    public static void main(String[] args) {
        generarCola();
        System.out.println("La cola tiene " + cola.size() + " personas: " + cola);
        System.out.println("La recaudacion total es: " + recaudacion());
    }

    public static void generarCola(){
        int numeroPersonas = rm.nextInt(250);
        for (int i = 0; i < numeroPersonas; i++) {
            cola.offer(new Persona(rm.nextInt(97)+3));
        }
    }

    public static double recaudacion(){
        double dinero = 0;
        while (!cola.isEmpty()){
            dinero += obtenerPrecio(cola.peek().getEdad());
            cola.poll();
        }
        return dinero;
    }

    public static double obtenerPrecio(int edad){
        if (edad >= 3 && edad <= 10){
            return 1;
        } else if (edad >= 11 && edad <= 17){
            return 2.5;
        } else {
            return 3.5;
        }
    }
}