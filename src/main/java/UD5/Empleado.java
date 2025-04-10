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

    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = Cargos.PTE;
    }

    public Empleado(String id, String nombre, Cargos cargo) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
    }
}