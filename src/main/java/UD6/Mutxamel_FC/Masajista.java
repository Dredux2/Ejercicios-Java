package UD6.Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
/**
 * La clase Masajista representa a un masajista del equipo Mutxamel FC.
 * Extiende de la clase abstracta A_MutxamelFC.
 */
@Getter @Setter
public class Masajista extends MutxamelFC {
    private String titulacion;
    private int añosExperiencia;
    /**
     * Constructor de la clase C_Masajista.
     *
     * @param nombre El nombre del masajista.
     * @param edad La edad del masajista.
     * @param titulacion La titulación del masajista.
     * @param añosExperiencia Los años de experiencia del masajista.
     */
    public Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(Jugador jugador){
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