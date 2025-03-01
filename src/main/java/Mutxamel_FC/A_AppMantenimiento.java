package Mutxamel_FC;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class A_AppMantenimiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<C_Jugador> jugadores = new ArrayList<>();
        List<C_Entrenador> entrenadores = new ArrayList<>();
        List<C_Masajista> masajistas = new ArrayList<>();
        List<C_Acompañante> acompañantes = new ArrayList<>();
        int opcion;
        do {
            System.out.println("\n--- App de mantenimiento del MUTXAMEL FC ---");
            System.out.println("[1]. Mantenimiento de Jugadores");
            System.out.println("[2]. Mantenimiento de Entrenadores");
            System.out.println("[3]. Mantenimiento de Masajistas");
            System.out.println("[4]. Consultar equipos");
            System.out.println("[5]. Salir");
            System.out.println("--------------------------------------------");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e1) {
                opcion = 0;
            }
            sc.nextLine();

            switch (opcion) {
                case 1: gestionarJugadores(sc, jugadores, acompañantes); break;
                case 2: gestionarEntrenadores(sc, entrenadores); break;
                case 3: gestionarMasajistas(sc, masajistas); break;
                case 4: gestionarEquipos(sc); break;
                case 5: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    //region Gestion de Jugadores
    private static void gestionarJugadores(Scanner sc, List<C_Jugador> jugadores, List<C_Acompañante> acompañantes) {
        int opcion;
        do {
            System.out.println("\n--- Mantenimiento de Jugadores ---");
            System.out.println("[1]. Añadir nuevo jugador");
            System.out.println("[2]. Modificar datos de jugador existente");
            System.out.println("[3]. Crear acompañantes [Solo para Jugadores Seniors]");
            System.out.println("[4]. Volver al menu principal");
            System.out.println("--------------------------------------------");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e1) {
                opcion = 0;
            }
            sc.nextLine();

            switch (opcion) {
                case 1: nuevoJugador(sc, jugadores); break;
                case 2: modificarDatos(sc, jugadores); break;
                case 3: crearAcompañantes(sc, acompañantes); break;
                case 4: return;
                default: System.out.println("Opción no válida.");
            }
        } while (true);
    }

    private static void nuevoJugador(Scanner sc, List<C_Jugador> jugadores) {
        System.out.println("\n--- Añadir nuevo jugador ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Equipo: ");
        E_Equipos equipo = E_Equipos.valueOf(sc.nextLine());

        System.out.print("Dorsal: ");
        int dorsal = sc.nextInt();
        sc.nextLine();

        System.out.print("Posición: ");
        E_Posiciones posicion = E_Posiciones.valueOf(sc.nextLine());

        jugadores.add(new C_Jugador(nombre, edad, equipo, posicion, dorsal));
        System.out.println(nombre + " se ha añadido correctamente.");
    }

    private static void modificarDatos(Scanner sc, List<C_Jugador> jugadores) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores en la plantilla.");
        } else {
            System.out.println("\n--- Modificar datos de jugador ---");
            System.out.println("¿De qué jugador quieres hacer cambios?");
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println((i + 1) +
                        ", Nombre: " + jugadores.get(i).getNombre() +
                        ", Edad: " + jugadores.get(i).getEdad() +
                        ", Categoria: " + jugadores.get(i).getCategoria() +
                        ", Dorsal: " + jugadores.get(i).getDorsal() +
                        ", Posicion: " + jugadores.get(i).getPosicion()
                );
            }
            System.out.print("Elige un jugador: ");
            int jugador = sc.nextInt() - 1;
            sc.nextLine();

            do {
                System.out.println("¿Qué quieres modificar?");
                System.out.println("[1]. Nombre");
                System.out.println("[2]. Edad");
                System.out.println("[3]. Categoria");
                System.out.println("[4]. Dorsal");
                System.out.println("[5]. Posición");
                System.out.println("[6]. Volver al menú anterior");
                System.out.print("Elige una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Nuevo nombre: ");
                        jugadores.get(jugador).setNombre(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Nueva edad: ");
                        jugadores.get(jugador).setEdad(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Nueva categoria: ");
                        jugadores.get(jugador).setCategoria(E_Equipos.valueOf(sc.nextLine()));
                        break;
                    case 4:
                        System.out.print("Nuevo dorsal: ");
                        jugadores.get(jugador).setDorsal(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 5:
                        System.out.print("Nueva posición: ");
                        jugadores.get(jugador).setPosicion(E_Posiciones.valueOf(sc.nextLine()));
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (true);
        }
    }

    private static void crearAcompañantes(Scanner sc, List<C_Acompañante> acompañantes) {
        System.out.println("\n--- Crear acompañantes ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Integrante: ");
        // No se que hacer en esta parte

        System.out.print("Parentesco: ");
        String parentesco = sc.nextLine();

        acompañantes.add(new C_Acompañante(nombre, edad, integrante, parentesco));
        System.out.println(nombre + " se ha añadido correctamente.");
    }
    //endregion

    //region Gestion de Entrenadores
    private static void gestionarEntrenadores(Scanner sc, List<C_Entrenador> entrenadores) {
    }
    //endregion

    //region Gestion de Masajistas
    private static void gestionarMasajistas(Scanner sc, List<C_Masajista> masajistas) {
    }
    //endregion

    //region Gestion de Equipos
    private static void gestionarEquipos(Scanner sc) {
    }
    //endregion
}