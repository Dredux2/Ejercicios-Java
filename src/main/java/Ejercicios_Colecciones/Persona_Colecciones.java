package Ejercicios_Colecciones;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Persona_Colecciones {
    private int edad;

    public Persona_Colecciones(int edad) {
        this.edad = edad;
    }
}