package UD5;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Empleado {
    private String id;
    private String nombre;
    private Cargos cargo;
    private Empleado director;

    public Empleado(String nombre) {
        generarID();
        this.nombre = nombre;
        this.cargo = Cargos.PTE;
    }

    public Empleado(String nombre, Cargos cargo) {
        generarID();
        this.nombre = nombre;
        this.cargo = cargo;
        if (cargo.equals(Cargos.DIRECTOR)){
            this.director = null;
        }
    }

    private static int contador = 0;
    public void generarID() {
        contador++;
        this.id = String.format("EP%03d", contador);
    }
}