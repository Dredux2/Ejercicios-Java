package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Entrenador extends A_Mutxamel implements I_AccionesDeportivas {
    private E_Equipos equipo;
    private String formacionPreferida;

    public C_Entrenador(String nombre, int edad, E_Equipos equipo, String formacionPreferida) {
        super(nombre,edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    public C_Entrenador(String nombre, int edad, E_Equipos equipo) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = "4-3-3";
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificando entrenamiento");
    }

    public void hacerCambios() {
        System.out.println("Haciendo cambios");
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
