package Mutxamel_FC;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase que simula la aplicación de Mutxamel.
 */
public class A_AppMutxamel {
    public static void main(String[] args) throws X_dorsalAsignado {
        List<C_Jugador> jugadores = new ArrayList<>();
        List<C_Entrenador> entrenadores = new ArrayList<>();
        List<C_Masajista> masajistas = new ArrayList<>();
        List<C_Acompañante> acompañantes = new ArrayList<>();

        // Jugarores
        jugadores.add(new C_Jugador("Pedro", 26, E_Equipos.SENIOR, E_Posiciones.PORTERO, 1));
        jugadores.add(new C_Jugador("Juan", 24, E_Equipos.SENIOR, E_Posiciones.DEFENSA, 2));
        jugadores.add(new C_Jugador("Luis", 28, E_Equipos.SENIOR, E_Posiciones.DEFENSA, 3));
        jugadores.add(new C_Jugador("Carlos", 27, E_Equipos.SENIOR, E_Posiciones.DEFENSA, 4));
        jugadores.add(new C_Jugador("Miguel", 25, E_Equipos.SENIOR, E_Posiciones.DEFENSA, 5));
        jugadores.add(new C_Jugador("Andres", 23, E_Equipos.SENIOR, E_Posiciones.CENTROCAMPISTA, 6));
        jugadores.add(new C_Jugador("David", 22, E_Equipos.SENIOR, E_Posiciones.CENTROCAMPISTA, 7));
        jugadores.add(new C_Jugador("Jorge", 29, E_Equipos.SENIOR, E_Posiciones.CENTROCAMPISTA, 8));
        jugadores.add(new C_Jugador("Raul", 30, E_Equipos.SENIOR, E_Posiciones.DELANTERO, 9));
        jugadores.add(new C_Jugador("Sergio", 21, E_Equipos.SENIOR, E_Posiciones.DELANTERO, 10));
        jugadores.add(new C_Jugador("Fernando", 26, E_Equipos.SENIOR, E_Posiciones.DELANTERO, 11));

        // Entreanador
        entrenadores.add(new C_Entrenador("Jose", 45, E_Equipos.SENIOR));

        // Masajistas
        masajistas.add(new C_Masajista("Ramon", 35, "Fisioterapeuta", 10));
        masajistas.add(new C_Masajista("Alba", 29, "Fisioterapeuta", 6));

        // Acopañantes
        acompañantes.add(new C_Acompañante("Carla", 30, jugadores.get(2), "Hermana"));
        acompañantes.add(new C_Acompañante("Ana", 31, jugadores.get(5), "Madre"));
        acompañantes.add(new C_Acompañante("Luna", 22, jugadores.get(6), "Novia"));

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

    private static void animarEquipo(List<C_Acompañante> acompañantes) {
        for (C_Acompañante acompañante : acompañantes) {
            acompañante.animarEquipo();
        }
    }

    public static void concentrarEquipo(List<C_Jugador> jugadores, List<C_Entrenador> entrenadores, List<C_Masajista> masajistas, List<C_Acompañante> acompañantes) {
        for (C_Jugador jugador : jugadores) {
            jugador.concentrarse();
        }

        for (C_Entrenador entrenador : entrenadores) {
            entrenador.concentrarse();
        }

        for (C_Masajista masajista : masajistas) {
            masajista.concentrarse();
        }

        for (C_Acompañante acompañante : acompañantes) {
            acompañante.concentrarse();
        }
    }

    public static void entrenarEquipo(List<C_Entrenador> entrenadores, List<C_Jugador> jugadores) {
        for (C_Entrenador entrenador : entrenadores) {
            entrenador.entrenar();
        }

        for (C_Jugador jugador : jugadores) {
            jugador.entrenar();
        }
    }

    public static void viajarEquipo(List<C_Jugador> jugadores, List<C_Entrenador> entrenadores, List<C_Masajista> masajistas, List<C_Acompañante> acompañantes, String ciudad) {
        for (C_Jugador jugador : jugadores) {
            jugador.viajar(ciudad);
        }

        for (C_Entrenador entrenador : entrenadores) {
            entrenador.viajar(ciudad);
        }

        for (C_Masajista masajista : masajistas) {
            masajista.viajar(ciudad);
        }

        for (C_Acompañante acompañante : acompañantes) {
            acompañante.viajar(ciudad);
        }
    }

    public static void descansarEquipo(List<C_Jugador> jugadores) {
        for (C_Jugador jugador : jugadores) {
            jugador.descansar();
        }
    }

    public static void celebrarGol(List<C_Jugador> jugadores, List<C_Entrenador> entrenadores, List<C_Acompañante> acompañantes, List<C_Masajista> masajistas) {
        for (C_Jugador jugador : jugadores) {
            jugador.celebrarGol();
        }

        for (C_Entrenador entrenador : entrenadores) {
            entrenador.celebrarGol();
        }

        for (C_Acompañante acompañante : acompañantes) {
            acompañante.celebrarGol();
        }

        for (C_Masajista masajista : masajistas) {
            masajista.celebrarGol();
        }
    }

    public static void equipoPartido(List<C_Entrenador> entrenadores, List<C_Jugador> jugadores) {
        for (C_Entrenador entrenador : entrenadores) {
            entrenador.jugarPartido("Real Madrid");
        }

        for (C_Jugador jugador : jugadores) {
            jugador.jugarPartido("Real Madrid");
        }
    }
}