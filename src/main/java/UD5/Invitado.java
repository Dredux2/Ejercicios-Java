package UD5;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
@Getter @Setter @ToString
public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = LocalDate.now();
        this.temporada = temporada;
    }

    public Invitado(String nombre, String profesion, int temporada, LocalDate fecha_visita) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = fecha_visita;
    }
}