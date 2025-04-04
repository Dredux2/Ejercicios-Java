package Mutxamel_FC;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que simula la aplicación de Mutxamel.
 */
public class AppMutxamel {
    public static void main(String[] args) throws dorsalAsignado {
        List<Jugador> jugadores = new ArrayList<>();
        List<Entrenador> entrenadores = new ArrayList<>();
        List<Masajista> masajistas = new ArrayList<>();
        List<Acompañante> acompañantes = new ArrayList<>();

        // Jugarores
        jugadores.add(new Jugador("Pedro", 26, Equipos.SENIOR, Posiciones.PORTERO, 1));
        jugadores.add(new Jugador("Juan", 24, Equipos.SENIOR, Posiciones.DEFENSA, 2));
        jugadores.add(new Jugador("Luis", 28, Equipos.SENIOR, Posiciones.DEFENSA, 3));
        jugadores.add(new Jugador("Carlos", 27, Equipos.SENIOR, Posiciones.DEFENSA, 4));
        jugadores.add(new Jugador("Miguel", 25, Equipos.SENIOR, Posiciones.DEFENSA, 5));
        jugadores.add(new Jugador("Andres", 23, Equipos.SENIOR, Posiciones.CENTROCAMPISTA, 6));
        jugadores.add(new Jugador("David", 22, Equipos.SENIOR, Posiciones.CENTROCAMPISTA, 7));
        jugadores.add(new Jugador("Jorge", 29, Equipos.SENIOR, Posiciones.CENTROCAMPISTA, 8));
        jugadores.add(new Jugador("Raul", 30, Equipos.SENIOR, Posiciones.DELANTERO, 9));
        jugadores.add(new Jugador("Sergio", 21, Equipos.SENIOR, Posiciones.DELANTERO, 10));
        jugadores.add(new Jugador("Fernando", 26, Equipos.SENIOR, Posiciones.DELANTERO, 11));

        // Entreanador
        entrenadores.add(new Entrenador("Jose", 45, Equipos.SENIOR));

        // Masajistas
        masajistas.add(new Masajista("Ramon", 35, "Fisioterapeuta", 10));
        masajistas.add(new Masajista("Alba", 29, "Fisioterapeuta", 6));

        // Acopañantes
        acompañantes.add(new Acompañante("Carla", 30, jugadores.get(2), "Hermana"));
        acompañantes.add(new Acompañante("Ana", 31, jugadores.get(5), "Madre"));
        acompañantes.add(new Acompañante("Luna", 22, jugadores.get(6), "Novia"));

        // Lógica Simulada
        concentrarEquipo(jugadores, entrenadores, masajistas, acompañantes);
        System.out.println();

        viajarEquipo(jugadores, entrenadores, masajistas, acompañantes, "Madrid");
        System.out.println();

        entrenadores.getFirst().planificarEntrenamiento();
        System.out.println();

        entrenarEquipo(entrenadores, jugadores);
        System.out.println();

        equipoPartido(entrenadores, jugadores);
        System.out.println();

        animarEquipo(acompañantes);
        System.out.println();

        entrenadores.getFirst().hacerCambios();
        System.out.println();

        jugadores.get(8).calentar();
        System.out.println();

        jugadores.get(10).marcarGol();
        System.out.println();

        celebrarGol(jugadores, entrenadores, acompañantes, masajistas);
        System.out.println();

        masajistas.getFirst().darMasaje(jugadores.get(6));
        masajistas.get(1).darMasaje(jugadores.get(2));
        System.out.println();

        viajarEquipo(jugadores, entrenadores, masajistas, acompañantes, "Mutxamel");
        System.out.println();

        descansarEquipo(jugadores);
    }

    private static void animarEquipo(List<Acompañante> acompañantes) {
        for (Acompañante acompañante : acompañantes) {
            acompañante.animarEquipo();
        }
    }

    public static void concentrarEquipo(List<Jugador> jugadores, List<Entrenador> entrenadores, List<Masajista> masajistas, List<Acompañante> acompañantes) {
        for (Jugador jugador : jugadores) {
            jugador.concentrarse();
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.concentrarse();
        }

        for (Masajista masajista : masajistas) {
            masajista.concentrarse();
        }

        for (Acompañante acompañante : acompañantes) {
            acompañante.concentrarse();
        }
    }

    public static void entrenarEquipo(List<Entrenador> entrenadores, List<Jugador> jugadores) {
        for (Entrenador entrenador : entrenadores) {
            entrenador.entrenar();
        }

        for (Jugador jugador : jugadores) {
            jugador.entrenar();
        }
    }

    public static void viajarEquipo(List<Jugador> jugadores, List<Entrenador> entrenadores, List<Masajista> masajistas, List<Acompañante> acompañantes, String ciudad) {
        for (Jugador jugador : jugadores) {
            jugador.viajar(ciudad);
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.viajar(ciudad);
        }

        for (Masajista masajista : masajistas) {
            masajista.viajar(ciudad);
        }

        for (Acompañante acompañante : acompañantes) {
            acompañante.viajar(ciudad);
        }
    }

    public static void descansarEquipo(List<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            jugador.descansar();
        }
    }

    public static void celebrarGol(List<Jugador> jugadores, List<Entrenador> entrenadores, List<Acompañante> acompañantes, List<Masajista> masajistas) {
        for (Jugador jugador : jugadores) {
            jugador.celebrarGol();
        }

        for (Entrenador entrenador : entrenadores) {
            entrenador.celebrarGol();
        }

        for (Acompañante acompañante : acompañantes) {
            acompañante.celebrarGol();
        }

        for (Masajista masajista : masajistas) {
            masajista.celebrarGol();
        }
    }

    public static void equipoPartido(List<Entrenador> entrenadores, List<Jugador> jugadores) {
        for (Entrenador entrenador : entrenadores) {
            entrenador.jugarPartido("Real Madrid");
        }

        for (Jugador jugador : jugadores) {
            jugador.jugarPartido("Real Madrid");
        }
    }
}