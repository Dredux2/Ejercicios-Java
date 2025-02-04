package Ejercicios_Clase.Trimestre2.TV;
import java.util.ArrayList;
public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas = new ArrayList<>();

    public Cadena(String nombre) {
        this.nombre = nombre;
    }

    // region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }
    // endregion

    public void agregarPrograma(Programa programa) {
        listaProgramas.add(programa);
    }

    public void removerPrograma(Programa programa) {
        listaProgramas.remove(programa);
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}