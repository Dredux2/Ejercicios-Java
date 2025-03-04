package Examen;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
@Getter @Setter
public class C_Artista extends A_MutxaAwards implements I_AccionesAsistentes {
    private String nombre;
    ArrayList<C_Premio> listaPremios;
    ArrayList<E_Categoria> categorias;

    public C_Artista(String nombre, int edicion) {
        super(edicion);
        this.nombre = nombre;
        listaPremios = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void esNominado(E_Categoria categoria){
        categorias.add(categoria);
    }

    public void ganarPremio(C_Premio premio){
        listaPremios.add(premio);
    }

    public void recogerPremio(C_Premio premio) {
        if (premio.getGanador().equals(this)){
            System.out.println("El artista " + nombre + " esta subiendo a recoger el premio " + premio.getCategoria().name());
        } else {
            throw new X_noPremiado("El artista " + nombre + " es un tramposo y ha intentado recoger el premio, pero no ha ganado. ");
        }
    }

    @Override
    public void aplaudir() {
        System.out.println(getNombre() + " esta aplaudiendo");
    }

    @Override
    public void alfombraRoja() {
        System.out.println(getNombre() + " esta caminando por la alfombra roja");
    }

    @Override
    public void darDiscurso(String tematica) {
        System.out.println(getNombre() + " esta dando un discurso sobre " + tematica);
    }

    @Override
    public void celebrarPremio(C_Premio premio) {
        System.out.println(getNombre() + " esta celebrando el premio a " + premio);
    }

    @Override
    public void obtenerDetalles() {
        System.out.print("Artista: " + nombre + ", con " + categorias.size() + " nominaciones a : " + categorias + ", y " + listaPremios.size() + " premios ganados ");
    }
}
