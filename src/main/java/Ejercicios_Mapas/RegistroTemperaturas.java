package Ejercicios_Mapas;
import lombok.ToString;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@ToString
public class RegistroTemperaturas {
    private HashMap<String,Integer> mapaTemperaturas;
    static Scanner sc = new Scanner(System.in);

    public RegistroTemperaturas(){
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperaturas(String ciudad, Integer temperatura){
        mapaTemperaturas.put(ciudad, temperatura);
    }

    public void actualizarTemperatura(String ciudad){
        System.out.print("Inserta la nueva temperatura de " + ciudad + ": ");
        mapaTemperaturas.put(ciudad, sc.nextInt());
    }

    public void consultarTemperatura(){
        System.out.print("Introduce la ciudad que deseas consultar: ");
        String ciudad = sc.next();
        if (mapaTemperaturas.containsKey(ciudad)){
            System.out.println("La temperatura en " + ciudad + " es: " + mapaTemperaturas.get(ciudad));
        } else {
            System.out.println("No se ha encontrado la ciudad " + ciudad);
        }
    }

    public void mostrar(){
        System.out.println("Registro de temperaturas: ");
        for (Map.Entry<String, Integer> temperatura : mapaTemperaturas.entrySet()) {
            System.out.println(temperatura.getKey() + ": " + temperatura.getValue() + "°C");
        }
    }
}
