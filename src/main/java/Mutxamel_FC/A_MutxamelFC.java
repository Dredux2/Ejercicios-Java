package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public abstract class A_MutxamelFC implements I_FuncionesIntegrales {
    private String nombre;
    private int edad;

    public A_MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}