package UD6.Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
/**
 * La clase Entrenador representa a un entrenador del equipo Mutxamel FC.
 * Extiende de la clase abstracta A_MutxamelFC e implementa la interfaz I_AccionesDeportivas.
 */
@Getter @Setter
public class Entrenador extends MutxamelFC implements AccionesDeportivas {
    private Equipos equipo;
    private String formacionPreferida;

    /**
     * Constructor de la clase C_Entrenador.
     *
     * @param nombre El nombre del entrenador.
     * @param edad La edad del entrenador.
     * @param equipo El equipo que entrena.
     */
    public Entrenador(String nombre, int edad, Equipos equipo) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = "4-3-3";
    }

    /**
     * Constructor sobrecargado de la clase C_Entrenador con formación preferida.
     *
     * @param nombre El nombre del entrenador.
     * @param edad La edad del entrenador.
     * @param equipo El equipo que entrena.
     * @param formacionPreferida La formación preferida del entrenador.
     * @throws formacionFormato Si la formación preferida no tiene el formato correcto.
     */
    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) throws formacionFormato {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    /**
     * Establece la formación preferida del entrenador.
     *
     * @param formacionPreferida La formación preferida en el formato N-N-N.
     * @throws formacionFormato Si la formación preferida no tiene el formato correcto.
     */
    public void setFormacionPreferida(String formacionPreferida) throws formacionFormato {
        if (!formacionPreferida.matches("\\d-\\d-\\d")) {
            throw new formacionFormato("La formacion preferida de " + getNombre() + " debe ser en el formato N-N-N");
        } else {
            this.formacionPreferida = formacionPreferida;
        }
    }

    public void planificarEntrenamiento() {
        System.out.println("Entrenador/a: " + getNombre() + " está planificando el entrenamiento...");
    }

    public void hacerCambios() {
        System.out.println("Entrenador/a: " + getNombre() + " esta haciendo un cambio...");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador/a: " + getNombre() + " esta entrenando al equipo...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Entrenador/a: " + getNombre() + " esta jugando un partido contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador/a: " + getNombre() + " se esta concentrando en el partido...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Entrenador/a: " + getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("Entrenador/a " + getNombre() + ": GOOOOOOOOOOOOOOL");
    }
}