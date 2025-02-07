package Ejercicios_Clase.Trimestre2.Centro_Estudios;
import lombok.*;
/**
 * Clase que representa un estudiante.
 * Utiliza Lombok para generar getters, setters y toString.
 */
@Getter @Setter @ToString
public class Estudiante {
    @NonNull
    private String nombre;
    private int edad;
    private Curso curso;
    /**
     * Constructor de la clase Estudiante.
     *
     * @param nombre Nombre del estudiante.
     * @param edad Edad del estudiante.
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}