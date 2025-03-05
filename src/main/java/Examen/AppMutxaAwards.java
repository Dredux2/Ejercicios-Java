package Examen;
import java.util.ArrayList;
import java.util.List;
public class AppMutxaAwards {
    public static void main(String[] args) {
        List<Presentador> presentadores = new ArrayList<>();
        List<Artista> artistas = new ArrayList<>();

        presentadores.add(new Presentador("Tulio", 2025));
        presentadores.getFirst().alfombraRoja();

        artistas.add(new Artista("Pablo", 2025));
        artistas.add(new Artista("Juan", 2025));
        artistas.add(new Artista("Ana", 2025));
        artistas.add(new Artista("Marcos", 2025));
        artistas.add(new Artista("Julio", 2025));

        alfombra(presentadores,artistas);
        System.out.println();
        apaudir(presentadores, artistas);

        presentadores.getFirst().presentar();
        presentadores.getFirst().darDiscurso("Dana");
        System.out.println();

        Premio premio1 = new Premio(Categoria.MEJOR_ACTOR, artistas.get(2));
        artistas.get(0).esNominado(Categoria.MEJOR_ACTOR);
        artistas.get(2).esNominado(Categoria.MEJOR_ACTOR);
        artistas.get(3).esNominado(Categoria.MEJOR_ACTOR);
        artistas.get(4).esNominado(Categoria.MEJOR_ACTOR);
        artistas.get(2).ganarPremio(premio1);

        apaudir(presentadores, artistas);
        System.out.println();

        celebrar(presentadores,artistas, premio1);
        System.out.println();

        //artistas.get(3).recogerPremio(premio1);
        artistas.get(2).recogerPremio(premio1);
        presentadores.getFirst().entregarPremio(premio1);
        System.out.println();

        artistas.get(2).darDiscurso("el esfuerzo realizado para rodar la película");
        System.out.println();

        apaudir(presentadores,artistas);
        System.out.println();

        presentadores.getFirst().darDiscurso("introducir el siguiente premio: " + Categoria.MEJOR_PELICULA);
        Premio premio2 = new Premio(Categoria.MEJOR_PELICULA, artistas.getFirst());
        artistas.get(4).esNominado(Categoria.MEJOR_PELICULA);
        artistas.get(3).esNominado(Categoria.MEJOR_PELICULA);
        artistas.get(1).esNominado(Categoria.MEJOR_PELICULA);
        artistas.getFirst().esNominado(Categoria.MEJOR_PELICULA);
        artistas.getFirst().ganarPremio(premio2);
        System.out.println();

        apaudir(presentadores,artistas);
        System.out.println();

        artistas.getFirst().recogerPremio(premio2);
        presentadores.getFirst().entregarPremio(premio2);
        System.out.println();

        artistas.getFirst().darDiscurso("lo duro que ha sido conseguir financiación");
        presentadores.getFirst().darDiscurso("despedir la gala");
        System.out.println();

        detalles(presentadores,artistas);
    }

    public static void alfombra(List<Presentador> presentadores, List<Artista> artistas){
        for (Artista artista : artistas){
            artista.alfombraRoja();
        }

        for (Presentador presentador : presentadores){
            presentador.alfombraRoja();
        }
    }

    public static void apaudir(List<Presentador> presentadores, List<Artista> artistas){
        for (Artista artista : artistas){
            artista.aplaudir();
        }

        for (Presentador presentador : presentadores){
            presentador.aplaudir();
        }
    }

    public static void celebrar(List<Presentador> presentadores, List<Artista> artistas, Premio premio){
        for (Artista artista : artistas){
            artista.celebrarPremio(premio);
        }

        for (Presentador presentador : presentadores){
            presentador.celebrarPremio(premio);
        }
    }

    public static void detalles(List<Presentador> presentadores, List<Artista> artistas){
        for (Artista artista : artistas){
            artista.obtenerDetalles();
            System.out.println();
        }

        for (Presentador presentador : presentadores){
            presentador.obtenerDetalles();
        }
    }
}
