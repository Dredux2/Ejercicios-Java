package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Masajista extends A_MutxamelFC{
    private String titulacion;
    private int añosExperiencia;

    public C_Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(C_Jugador jugador){
        System.out.println(getNombre() + " está dando un masaje a " + jugador.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("Masajista: " + getNombre() + " se esta concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Masajista: " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("Masajista " + getNombre() + ": GOOOOOOOOOOOOOOL");
    }
}
