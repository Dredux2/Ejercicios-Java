package Mutxamel_FC;
import lombok.Setter;
import lombok.Getter;
/*
  La clase Acompañante representa a un acompañante de un jugador en el equipo Mutxamel FC.
  Extiende de la clase abstracta A_MutxamelFC.
 */
@Getter @Setter
public class Acompañante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

    /**
     * Constructor de la clase C_Acompañante.
     *
     * @param nombre El nombre del acompañante.
     * @param edad La edad del acompañante.
     * @param integrante El jugador al que acompaña.
     * @param parentesco El parentesco con el jugador.
     */
    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println(getNombre() + " está animando a " + integrante.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("Acompañante: " + getNombre() + " se esta concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Acompañante: " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("Acompañante " + getNombre() + ": GOOOOOOOOOOOOOOL");
    }
}