package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Acompañante extends A_Mutxamel {
    private C_Jugador integrante;
    private String parentesco;

    public C_Acompañante(String nombre, int edad, String parentesco, C_Jugador integrante) {
        super(nombre, edad);
        this.parentesco = parentesco;
        this.integrante = integrante;
    }

    public void animarEquipo() {
        System.out.println("¡Vamos equipo!");
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
}
