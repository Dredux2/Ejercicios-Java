package UD5;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
@Getter @Setter @ToString
public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }
}