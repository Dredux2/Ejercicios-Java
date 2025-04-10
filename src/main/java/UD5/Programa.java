package UD5;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
@Getter @Setter @ToString
public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;

    public Programa(String nombre, Cadena cadena) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        Empleado director = new Empleado("Carlos", Cargos.DIRECTOR);
        listaEmpleados.add(director);
    }

    public Programa(String nombre, Cadena cadena, int temporadas) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        Empleado director = new Empleado("Carlos", Cargos.DIRECTOR);
        listaEmpleados.add(director);
    }

    public void eliminarCadena() {
        cadena = null;
    }

    public void añadirEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado){
        listaEmpleados.remove(empleado);
    }

    public void añadirInvitado(Invitado invitado){
        listaInvitados.add(invitado);
    }

    public void eliminarInvitado(Invitado invitado){
        listaInvitados.remove(invitado);
    }
}