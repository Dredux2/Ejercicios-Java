package Ejercicios_Colecciones;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;
@Getter @Setter @ToString
public class Peticion_Colecciones {
    private String id;
    private String nombre;

    public Peticion_Colecciones(String nombre){
        if (!id.matches("^PC\\d{4}$")){
            throw new RuntimeException("ERROR: Formato de identificador incorrecto");
        } else {
            this.id = id;
        }
        nombreArchivo(nombre);
    }

    public void nombreArchivo(String nombre){
        if (!nombre.toLowerCase().endsWith(".pdf")){
            throw new RuntimeException("ERROR: El archivo " + nombre + " no es un pdf");
        } else {
            this.nombre = nombre;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Peticion_Colecciones peticion = (Peticion_Colecciones) o;
        return Objects.equals(id, peticion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}