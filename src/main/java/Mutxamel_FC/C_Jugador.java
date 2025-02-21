package Mutxamel_FC;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Jugador extends A_Mutxamel implements I_AccionesDeportivas{
    private E_Equipos categoria;
    private E_Posiciones posicion;
    private C_Acompañante acompañante;
    private int dorsal;

    public C_Jugador(String nombre, int edad, E_Equipos categoria, E_Posiciones posicion, int dorsal){
        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public void calentar() {
        System.out.println("El jugador está calentando.");
    }

    public void descansar() {
        System.out.println("El jugador está descansando.");
    }

    public void marcarGol() {
        System.out.println("El jugador ha marcado un gol.");
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

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
