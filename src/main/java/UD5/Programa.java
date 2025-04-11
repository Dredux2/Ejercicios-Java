package UD5;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
@Getter @Setter @ToString
public class Programa {
    // Incomplete code
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

    public void invitadosTemporada(int temporada){
        int contador = 0;
        for (Invitado invitado : listaInvitados){
            if (invitado.getTemporada() == temporada){
                contador++;
                System.out.println("Nombre: " + invitado.getNombre() + ", Profesion: " + invitado.getProfesion());
            }
        }
        System.out.println("\nTotal de Invitados en la temporada " + temporada + ": " + contador);
    }

    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                contador++;
            }
        }
        return contador;
    }

    public void rastrearInvitado(String nombre) {
        int contador = vecesInvitado(nombre);
        System.out.println("\n" + nombre + " ha sido invitado " + contador + " veces al programa: ");
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                LocalDate fecha = invitado.getFecha_visita();
                int temporada = invitado.getTemporada();
                System.out.println("Fecha de visita: " + fecha);
                System.out.println("Temporada: " + temporada + "\n");
            }
        }
    }

    public boolean buscarInvitado(String nombre) {
        for (Programa programa : cadena.getListaProgramas()){
            for (Invitado invitado : listaInvitados) {
                if (invitado.getNombre().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void invitadoAntes(String nombre){
        boolean encontrado = buscarInvitado(nombre);
        LocalDate fecha1, fecha2;
        if (encontrado){
            for (Programa programa : cadena.getListaProgramas()){
                for (Invitado invitado : listaInvitados) {
                    if (invitado.getNombre().equals(nombre)) {
                        fecha1 = invitado.getFecha_visita();
                    }
                }
            }
        }
    }
}