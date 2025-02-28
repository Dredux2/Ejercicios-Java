package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;
@Getter @Setter
public class C_Jugador extends A_MutxamelFC implements I_AccionesDeportivas {
    private static Set<Integer> dorsalesAsignados = new HashSet<>();
    private E_Equipos categoria;
    private E_Posiciones posicion;
    private int dorsal;

    public C_Jugador(String nombre, int edad, E_Equipos categoria, E_Posiciones posicion, int dorsal) throws X_dorsalAsignado {
        super(nombre, edad);
        if (dorsalesAsignados.contains(dorsal)) {
            throw new X_dorsalAsignado("El dorsal " + dorsal + " ya está asignado a otro jugador.");
        }
        this.categoria = categoria;
        this.posicion = posicion;
        this.dorsal = dorsal;
        dorsalesAsignados.add(dorsal);
    }

    public void setDorsal(int dorsal) throws X_dorsalAsignado {
        if (dorsalesAsignados.contains(dorsal)) {
            throw new X_dorsalAsignado("El dorsal " + dorsal + " ya está asignado a otro jugador.");
        }
        dorsalesAsignados.remove(this.dorsal);
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