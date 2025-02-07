package Ejercicios_Clase.Trimestre2.Centro_Estudios;
import lombok.*;
/**
 * Clase que representa un curso.
 * Utiliza Lombok para generar getters, setters, toString y el constructor con todos los argumentos.
 */
@Getter @Setter @ToString @AllArgsConstructor
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}