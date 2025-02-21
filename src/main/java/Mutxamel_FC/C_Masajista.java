package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Masajista extends A_Mutxamel{
    private String titulacion;
    private int yearExperiencia;

    public C_Masajista(String nombre, int edad, String titulacion, int yearExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.yearExperiencia = yearExperiencia;
    }

    public void darMasaje(C_Jugador jugador) {
        System.out.println("Dando masaje");
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