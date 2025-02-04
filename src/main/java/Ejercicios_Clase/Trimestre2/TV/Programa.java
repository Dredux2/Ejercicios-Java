package Ejercicios_Clase.Trimestre2.TV;
import java.time.LocalDate;
import java.util.ArrayList;
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private ArrayList<Invitado> listaInvitados = new ArrayList<>();
    private Empleado director;

    public Programa(String nombre, Cadena cadena, int temporadas) {
        this.nombre = nombre;
        this.cadena = cadena;
        cadena.agregarPrograma(this);
        this.temporadas = temporadas;
        this.director = new Empleado("Juan Alberto", "director", null);
        listaEmpleados.add(director);
    }

    // region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena nuevaCadena) {
        this.cadena.removerPrograma(this);
        this.cadena = nuevaCadena;
        nuevaCadena.agregarPrograma(this);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    // endregion

    public void agregarDirector(String nombre) {
        director.setNombre(nombre);
    }

    public void removerDirector() {
        listaEmpleados.remove(director);
        director = null;
    }

    public void agregarEmpleado(String nombre, String cargo) {
        Empleado nuevoEmpleado = new Empleado(nombre, cargo, this.director);
        listaEmpleados.add(nuevoEmpleado);
    }

    public void removerEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    public void agregarInvitado(String nombre, String profesion, LocalDate fechaVisita, int duracionVisita) {
        Invitado nuevoInvitado = new Invitado(nombre, profesion, fechaVisita, duracionVisita);
        listaInvitados.add(nuevoInvitado);
    }

    public void removerInvitado(Invitado invitado) {
        listaInvitados.remove(invitado);
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director.getNombre() +
                '}';
    }
}