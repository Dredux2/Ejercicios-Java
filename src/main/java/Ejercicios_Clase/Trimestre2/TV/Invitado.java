package Ejercicios_Clase.Trimestre2.TV;
import java.time.LocalDate;
import java.util.Scanner;
public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDate fechaVisita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        this.fechaVisita = preguntarFechaVisita();
        this.temporada = temporada;
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

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    // endregion


    private LocalDate preguntarFechaVisita() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Invitado: " + nombre + "\nIntroduce el año de la visita:");
        int year = scanner.nextInt();
        System.out.print("Introduce el mes de la visita:");
        int month = scanner.nextInt();
        System.out.print("Introduce el día de la visita:");
        int day = scanner.nextInt();
        return LocalDate.of(year, month, day);
    }

    public void invitadosTemporada(int temporada) {
        if (this.temporada == temporada) {
            System.out.println("Invitado: " + nombre + ", Profesión: " + profesion);
        }
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fechaVisita=" + fechaVisita +
                ", Temporada=" + temporada +
                '}';
    }
}