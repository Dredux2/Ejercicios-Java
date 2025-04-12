package UD5;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Getter @Setter
public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    public void añadirPrograma(Programa programa){
        listaProgramas.add(programa);
    }

    public void eliminarPrograma(Programa programa){
        programa.eliminarCadena();
        listaProgramas.remove(programa);
    }

    public boolean buscarInvitado(String nombre) {
        for (Programa programa : getListaProgramas()){
            for (Invitado invitado : programa.getListaInvitados()) {
                if (invitado.getNombre().equals(nombre)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void invitadoAntes(String nombre){
        boolean encontrado = buscarInvitado(nombre);
        List<LocalDate> fechas = new ArrayList<>();
        if (encontrado){
            for (Programa programa : getListaProgramas()){
                for (Invitado invitado : programa.getListaInvitados()) {
                    if (invitado.getNombre().equals(nombre)) {
                        fechas.add(invitado.getFecha_visita());
                    }
                }
            }
            Collections.sort(fechas);
            System.out.println("Primera vez invitado: " + fechas.getFirst());
        }
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}