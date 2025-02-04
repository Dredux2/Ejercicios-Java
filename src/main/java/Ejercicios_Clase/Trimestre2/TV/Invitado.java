package Ejercicios_Clase.Trimestre2.TV;
import java.time.LocalDate;

public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int duracionVisita;

    public Invitado(String nombre, String profesion, LocalDate fechaVisita, int duracionVisita) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fechaVisita = fechaVisita;
        this.duracionVisita = duracionVisita;
    }

    // region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public int getDuracionVisita() {
        return duracionVisita;
    }

    public void setDuracionVisita(int duracionVisita) {
        this.duracionVisita = duracionVisita;
    }
    // endregion

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fechaVisita=" + fechaVisita +
                ", duracionVisita=" + duracionVisita +
                '}';
    }
}