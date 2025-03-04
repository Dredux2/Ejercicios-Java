package Examen;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Presentador extends A_MutxaAwards implements I_AccionesAsistentes {
    private String nombre;

    public C_Presentador(String nombre, int edicion) {
        super(edicion);
        this.nombre = nombre;
    }

    public void presentar(){
        System.out.println(getNombre() + " esta presentando la gala en este momento");
    }

    public void entregarPremio(C_Premio premio){
        System.out.println("El presentador " + nombre + " está entregando el premio " + premio.getCategoria().name() + " a " + premio.getGanador().getNombre());
    }

    @Override
    public void aplaudir() {
        System.out.println(getNombre() + " esta aplaudiendo");
    }

    @Override
    public void alfombraRoja() {
        System.out.println(getNombre() + " esta pasando por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println(getNombre() + " esta dando un discurso sobre " + tematica);
    }

    @Override
    public void celebrarPremio(C_Premio premio) {
        System.out.println(getNombre() + " esta celebrando el premio " + premio);
    }

    @Override
    public void obtenerDetalles() {
        System.out.print("Presentador: " + nombre);
    }
}
