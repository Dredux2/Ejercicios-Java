package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Acompañante extends A_MutxamelFC {
    private C_Jugador integrante;
    private String parentesco;

    public C_Acompañante(String nombre, int edad, C_Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println(this.getNombre() + " está animando al equipo...");
    }

    @Override
    public void concentrarse() {
        System.out.println(this.getNombre() + " se está concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad + "...");
    }

    @Override
    public void celebrerGol() {
        System.out.println("¡GOOOOOOOOOOOOOOL!");
    }
}
