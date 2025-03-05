package Examen;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
@Getter @Setter
public class Artista extends MutxaAwards implements AccionesAsistentes {
    private String nombre;
    ArrayList<Premio> listaPremios;
    ArrayList<Categoria> categorias;

    public Artista(String nombre, int edicion) {
        super(edicion);
        this.nombre = nombre;
        listaPremios = new ArrayList<>();
        categorias = new ArrayList<>();
    }

    public void esNominado(Categoria categoria){
        categorias.add(categoria);
    }

    public void ganarPremio(Premio premio){
        listaPremios.add(premio);
    }

    public void recogerPremio(Premio premio) {
        if (premio.getGanador().equals(this)){
            System.out.println("El artista " + nombre + " esta subiendo a recoger el premio " + premio.getCategoria().name());
        } else {
            throw new noPremiado("El artista " + nombre + " es un tramposo y ha intentado recoger el premio, pero no ha ganado. ");
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
    public void celebrarPremio(Premio premio) {
        System.out.println(getNombre() + " esta celebrando el premio a " + premio);
    }

    @Override
    public void obtenerDetalles() {
        System.out.print("Artista: " + nombre + ", con " + categorias.size() + " nominaciones a : " + categorias + ", y " + listaPremios.size() + " premios ganados ");
    }
}
