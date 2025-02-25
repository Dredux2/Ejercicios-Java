package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Jugador extends A_MutxamelFC implements I_AccionesDeportivas{
    private E_Equipos categoria;
    private E_Posiciones posicion;
    private int dorsal;

    public C_Jugador(String nombre, int edad, E_Equipos categoria, int dorsal, E_Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public void calentar() {
        System.out.println("El jugador " + getNombre() + " con el dorsal nº " + getDorsal() + " esta calentando para entrar al campo...");
    }

    public void descansar() {
        System.out.println("El jugador " + getNombre() + " esta descansando...");
    }

    public void marcarGol() {
        System.out.println("¡El jugador " + getNombre() + " ha marcado un gol!");
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " se esta concentrando...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + getNombre() + " esta viajando a " + ciudad);
    }

    @Override
    public void celebrerGol() {
        System.out.println("El jugador " + getNombre() + " esta celebrando el gol...");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " esta entrenando...");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + getNombre() + " juega un partido contra el/la " + rival);
    }
}
