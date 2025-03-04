package Examen;
import java.util.ArrayList;
import java.util.List;
public class A_AppMutxaAwards {
    public static void main(String[] args) {
        List<C_Presentador> presentadores = new ArrayList<>();
        List<C_Artista> artistas = new ArrayList<>();

        presentadores.add(new C_Presentador("Tulio", 2025));
        presentadores.getFirst().alfombraRoja();

        artistas.add(new C_Artista("Pablo", 2025));
        artistas.add(new C_Artista("Juan", 2025));
        artistas.add(new C_Artista("Ana", 2025));
        artistas.add(new C_Artista("Marcos", 2025));
        artistas.add(new C_Artista("Julio", 2025));

        alfombra(presentadores,artistas);
        System.out.println();
        apaudir(presentadores, artistas);

        presentadores.getFirst().presentar();
        presentadores.getFirst().darDiscurso("Dana");
        System.out.println();

        C_Premio premio1 = new C_Premio(E_Categoria.MEJOR_ACTOR, artistas.get(2));
        artistas.get(0).esNominado(E_Categoria.MEJOR_ACTOR);
        artistas.get(2).esNominado(E_Categoria.MEJOR_ACTOR);
        artistas.get(3).esNominado(E_Categoria.MEJOR_ACTOR);
        artistas.get(4).esNominado(E_Categoria.MEJOR_ACTOR);
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

        presentadores.getFirst().darDiscurso("introducir el siguiente premio: " + E_Categoria.MEJOR_PELICULA);
        C_Premio premio2 = new C_Premio(E_Categoria.MEJOR_PELICULA, artistas.getFirst());
        artistas.get(4).esNominado(E_Categoria.MEJOR_PELICULA);
        artistas.get(3).esNominado(E_Categoria.MEJOR_PELICULA);
        artistas.get(1).esNominado(E_Categoria.MEJOR_PELICULA);
        artistas.getFirst().esNominado(E_Categoria.MEJOR_PELICULA);
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

    public static void alfombra(List<C_Presentador> presentadores, List<C_Artista> artistas){
        for (C_Artista artista : artistas){
            artista.alfombraRoja();
        }

        for (C_Presentador presentador : presentadores){
            presentador.alfombraRoja();
        }
    }

    public static void apaudir(List<C_Presentador> presentadores, List<C_Artista> artistas){
        for (C_Artista artista : artistas){
            artista.aplaudir();
        }

        for (C_Presentador presentador : presentadores){
            presentador.aplaudir();
        }
    }

    public static void celebrar(List<C_Presentador> presentadores, List<C_Artista> artistas, C_Premio premio){
        for (C_Artista artista : artistas){
            artista.celebrarPremio(premio);
        }

        for (C_Presentador presentador : presentadores){
            presentador.celebrarPremio(premio);
        }
    }

    public static void detalles(List<C_Presentador> presentadores, List<C_Artista> artistas){
        for (C_Artista artista : artistas){
            artista.obtenerDetalles();
            System.out.println();
        }

        for (C_Presentador presentador : presentadores){
            presentador.obtenerDetalles();
        }
    }
}
