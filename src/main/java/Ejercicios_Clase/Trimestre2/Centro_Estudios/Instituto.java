package Ejercicios_Clase.Trimestre2.Centro_Estudios;
import lombok.*;
import java.util.*;
/**
 * Clase que representa un instituto.
 * Utiliza Lombok para generar getters, setters y el metodo toString.
 */
@Getter @Setter @ToString
public class Instituto {
    @NonNull
    private String nombre;
    private String poblacion;
    @NonNull
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    @NonNull
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    /**
     * Constructor de la clase Instituto.
     *
     * @param nombre Nombre del instituto. No puede ser nulo.
     */
    public Instituto(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede ser nulo.");
        }
    }

    /**
     * Añade un curso a la lista de cursos del instituto.
     *
     * @param curso Curso a añadir. No puede ser nulo ni duplicado.
     */
    public void addCurso(Curso curso) {
        if (curso != null && !listaCursos.contains(curso)) {
            listaCursos.add(curso);
        } else {
            System.out.println("No se puede añadir un curso nulo o duplicado.");
        }
    }

    /**
     * Añade un estudiante a la lista de estudiantes del instituto.
     *
     * @param estudiante Estudiante a añadir.
     */
    public void addEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    /**
     * Establece el nombre del instituto.
     *
     * @param nombre Nombre del instituto. No puede ser nulo.
     */
    public void setNombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser nulo");
    }
}