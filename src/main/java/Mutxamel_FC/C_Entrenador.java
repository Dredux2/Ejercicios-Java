package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Entrenador extends A_MutxamelFC implements I_AccionesDeportivas{
    private E_Equipos equipo;
    private String formacionPreferida;

    public C_Entrenador(String nombre, int edad, E_Equipos equipo) {
            super(nombre, edad);
            this.equipo = equipo;
            this.formacionPreferida = "4-3-3";
    }

    public C_Entrenador(String nombre, int edad, E_Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador " + this.getNombre() + " está planificando el entrenamiento...");
    }

    public void hacerCambios(){
        System.out.println("El entrenador " + this.getNombre() + " está haciendo cambios...");
    }


    @Override
    public void entrenar() {
        System.out.println("El entrenador " + this.getNombre() + " está entrenando al equipo " + this.equipo+ "...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador " + this.getNombre() + " está jugando un partido contra el/la " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + this.getNombre() + " se está concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + this.getNombre() + " está viajando a " + ciudad + "...");
    }

    @Override
    public void celebrerGol() {
        System.out.println("GOOOOOOOOOOOOOOL");
    }
}
