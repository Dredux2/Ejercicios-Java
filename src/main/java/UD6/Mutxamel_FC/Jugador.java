package UD6.Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;
/**
 * La clase Jugador representa a un jugador del equipo Mutxamel FC.
 * Extiende de la clase abstracta A_MutxamelFC e implementa la interfaz I_AccionesDeportivas.
 */
@Getter @Setter
public class Jugador extends MutxamelFC implements AccionesDeportivas {
    private static Set<Integer> dorsalesAsignados = new HashSet<>(); // Uso de Github Copilot para la creación de esta variable.
    private Equipos categoria;
    private Posiciones posicion;
    private int dorsal;

    /**
     * Constructor de la clase C_Jugador.
     *
     * @param nombre El nombre del jugador.
     * @param edad La edad del jugador.
     * @param categoria La categoría del equipo al que pertenece el jugador.
     * @param posicion La posición en la que juega el jugador.
     * @param dorsal El número dorsal del jugador.
     * @throws dorsalAsignado Si el dorsal ya está asignado a otro jugador.
     */
    public Jugador(String nombre, int edad, Equipos categoria, Posiciones posicion, int dorsal) throws dorsalAsignado {
        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        setDorsal(dorsal);
    }

    /**
     * Establece el dorsal del jugador.
     *
     * @param dorsal El nuevo número dorsal del jugador.
     * @throws dorsalAsignado Si el dorsal ya está asignado a otro jugador.
     */
    public void setDorsal(int dorsal) throws dorsalAsignado { // Uso de Github Copilot para la creación de este metodo.
        if (dorsalesAsignados.contains(dorsal)) {
            throw new dorsalAsignado("El dorsal " + dorsal + " ya está asignado a otro jugador.");
        }
        // Si el dorsal no está asignado, se asigna al jugador y se añade a la lista de dorsales asignados.
        this.dorsal = dorsal;
        dorsalesAsignados.add(dorsal);
    }

    public void calentar() {
        System.out.println(getNombre() + " esta calentando en este momento...");
    }

    public void descansar() {
        System.out.println(getNombre() + " esta descansando...");
    }

    public void marcarGol() {
        System.out.println("!" + getNombre() + " ha marcado un gol!!");
    }

    @Override
    public void entrenar() {
        System.out.println("Jugador/a: " + getNombre() + " esta entrenando...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugador/a: " + getNombre() + " esta jugando un partido contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("Jugador/a: " + getNombre() + " se esta concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Jugador/a: " + getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("Jugador/a " + getNombre() + ": GOOOOOOOOOOOOOOL");
    }
}