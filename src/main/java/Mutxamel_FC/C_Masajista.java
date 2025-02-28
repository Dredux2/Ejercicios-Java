package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
/**
 * La clase C_Masajista representa a un masajista del equipo Mutxamel FC.
 * Extiende de la clase abstracta A_MutxamelFC.
 */
@Getter @Setter
public class C_Masajista extends A_MutxamelFC{
    private String titulacion;
    private int añosExperiencia;

<<<<<<< HEAD
    /**
     * Constructor de la clase C_Masajista.
     *
     * @param nombre El nombre del masajista.
     * @param edad La edad del masajista.
     * @param titulacion La titulación del masajista.
     * @param añosExperiencia Los años de experiencia del masajista.
     */
=======
>>>>>>> origin/master
    public C_Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

<<<<<<< HEAD
    public void darMasaje(C_Jugador jugador) {
=======
    public void darMasaje(C_Jugador jugador){
>>>>>>> origin/master
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