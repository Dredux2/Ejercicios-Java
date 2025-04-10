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

        Empleado director = new Empleado();
        listaEmpleados.add(director);
    }

    public Programa(String nombre, Cadena cadena, int temporadas) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        Empleado director = new Empleado();
        listaEmpleados.add(director);
    }
}