package pruebas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class pruebas_Mapas {
    public static void main(String[] args) {
        Map<Integer, String> mapita = new HashMap<>();
        mapita.put(12324, "Juan");
        mapita.put(12325, "Pedro");
        mapita.put(12326, "Maria");

        List<Map.Entry<Integer, String>> listaMapa = new ArrayList<>(mapita.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer, String> mapita2 : listaMapa) {
            System.out.println("Clave: " + mapita2.getKey() + ", Valor: " + mapita2.getValue());
        }
    }
}