package Ejercicios_Colecciones;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }
}