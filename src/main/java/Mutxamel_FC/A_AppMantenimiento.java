package Mutxamel_FC;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * La clase A_AppMantenimiento es la clase principal de la aplicación de mantenimiento del Mutxamel FC.
 * Permite gestionar los jugadores, entrenadores y masajistas del equipo.
 */
public class A_AppMantenimiento {
    public static void main(String[] args) throws X_dorsalAsignado {
        Scanner sc = new Scanner(System.in);
        List<C_Jugador> jugadores = new ArrayList<>();
        List<C_Entrenador> entrenadores = new ArrayList<>();
        List<C_Masajista> masajistas = new ArrayList<>();
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
                case 1: gestionarJugadores(sc, jugadores); break;
                case 2: gestionarEntrenadores(sc, entrenadores); break;
                case 3: gestionarMasajistas(sc, masajistas); break;
                case 4: gestionarEquipos(sc); break;
                case 5: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    //region Gestion de Jugadores
    /**
     * Permite gestionar los jugadores del equipo.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param jugadores La lista de jugadores del equipo.
     */
    private static void gestionarJugadores(Scanner sc, List<C_Jugador> jugadores) throws X_dorsalAsignado {
        int opcion;
        do {
            System.out.println("\n--- Mantenimiento de Jugadores ---");
            System.out.println("[1]. Añadir nuevo jugador");
            System.out.println("[2]. Modificar datos de jugador existente");
            System.out.println("[3]. Volver al menu principal");
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
                case 3: return;
                default: System.out.println("Opción no válida.");
            }
        } while (true);
    }

    /**
     * Permite añadir un nuevo jugador al equipo.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param jugadores La lista de jugadores del equipo.
     */
    private static void nuevoJugador(Scanner sc, List<C_Jugador> jugadores) throws X_dorsalAsignado {
        System.out.println("\n--- Añadir nuevo jugador ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad;
        try {
            edad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Edad no válida.");
            return;
        }

        System.out.print("Equipo: ");
        E_Equipos equipo;
        try {
            equipo = E_Equipos.valueOf(sc.nextLine());
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
            return;
        }

        System.out.print("Posición: ");
        E_Posiciones posicion;
        try {
            posicion = E_Posiciones.valueOf(sc.nextLine());
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
            return;
        }

        System.out.print("Dorsal: ");
        int dorsal;
        try {
            dorsal = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Dorsal no válido.");
            return;
        }
        sc.nextLine();

        jugadores.add(new C_Jugador(nombre, edad, equipo, posicion, dorsal));
        System.out.println(nombre + " se ha añadido correctamente.");
    }

    /**
     * Permite modificar los datos de un jugador existente.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param jugadores La lista de jugadores del equipo.
     */
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
            int jugador = sc.nextInt() - 1; // Restamos 1 para que el índice empiece en 0
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
                        try {
                            jugadores.get(jugador).setEdad(Integer.parseInt(sc.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("Edad no válida.");
                        }
                        break;
                    case 3:
                        System.out.print("Nueva categoria: ");
                        try {
                            jugadores.get(jugador).setCategoria(E_Equipos.valueOf(sc.nextLine()));
                        } catch (IllegalArgumentException error) {
                            System.out.println("Error: " + error.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Nuevo dorsal: ");
                        int nuevoDorsal = sc.nextInt();
                        sc.nextLine();
                        try {
                            jugadores.get(jugador).setDorsal(nuevoDorsal);
                        } catch (X_dorsalAsignado e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.print("Nueva posición: ");
                        try {
                            jugadores.get(jugador).setPosicion(E_Posiciones.valueOf(sc.nextLine()));
                        } catch (IllegalArgumentException error) {
                            System.out.println("Error: " + error.getMessage());
                        }
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (true);
        }
    }
    //endregion

    //region Gestion de Entrenadores
    /**
     * Permite gestionar los entrenadores del equipo.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param entrenadores La lista de entrenadores del equipo.
     */
    private static void gestionarEntrenadores(Scanner sc, List<C_Entrenador> entrenadores) {
        int opcion;
        do {
            System.out.println("\n--- Mantenimiento de Entrenadores ---");
            System.out.println("[1]. Añadir nuevo entrenador");
            System.out.println("[2]. Modificar datos de entrenador existente");
            System.out.println("[3]. Volver al menu principal");
            System.out.println("--------------------------------------------");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e1) {
                opcion = 0;
            }
            sc.nextLine();

            switch (opcion) {
                case 1: nuevoEntrenador(sc, entrenadores); break;
                case 2: modificarDatosEntrenador(sc, entrenadores); break;
                case 3: return;
                default: System.out.println("Opción no válida.");
            }
        } while (true);
    }

    /**
     * Permite añadir un nuevo entrenador al equipo.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param entrenadores La lista de entrenadores del equipo.
     */
    private static void nuevoEntrenador(Scanner sc, List<C_Entrenador> entrenadores) {
        System.out.println("\n--- Añadir nuevo entrenador ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad;
        try {
            edad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Edad no válida.");
            return;
        }

        System.out.print("Equipo: ");
        E_Equipos equipo;
        try {
            equipo = E_Equipos.valueOf(sc.nextLine());
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
            return;
        }

        System.out.print("Formación preferida (opcional): ");
        String formacionPreferida = sc.nextLine();
        try {
            if (formacionPreferida.isEmpty()) {
                entrenadores.add(new C_Entrenador(nombre, edad, equipo));
            } else {
                entrenadores.add(new C_Entrenador(nombre, edad, equipo, formacionPreferida));
            }
            System.out.println(nombre + " se ha añadido correctamente.");
        } catch (X_formacionFormato error) {
            System.out.println("Error: " + error.getMessage());
        }
    }

    /**
     * Permite modificar los datos de un entrenador existente.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param entrenadores La lista de entrenadores del equipo.
     */
    private static void modificarDatosEntrenador(Scanner sc, List<C_Entrenador> entrenadores) {
        if (entrenadores.isEmpty()) {
            System.out.println("No hay entrenadores en la plantilla.");
        } else {
            System.out.println("\n--- Modificar datos de entrenador ---");
            System.out.println("¿De qué entrenador quieres hacer cambios?");
            for (int i = 0; i < entrenadores.size(); i++) {
                System.out.println((i + 1) +
                        ", Nombre: " + entrenadores.get(i).getNombre() +
                        ", Edad: " + entrenadores.get(i).getEdad() +
                        ", Equipo: " + entrenadores.get(i).getEquipo() +
                        ", Formación preferida: " + entrenadores.get(i).getFormacionPreferida()
                );
            }
            System.out.print("Elige un entrenador: ");
            int entrenador = sc.nextInt() - 1; // -1 para que el índice empiece en 0
            sc.nextLine();

            do {
                System.out.println("¿Qué quieres modificar?");
                System.out.println("[1]. Nombre");
                System.out.println("[2]. Edad");
                System.out.println("[3]. Equipo");
                System.out.println("[4]. Formación preferida");
                System.out.println("[5]. Volver al menú anterior");
                System.out.print("Elige una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Nuevo nombre: ");
                        entrenadores.get(entrenador).setNombre(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Nueva edad: ");
                        try {
                            entrenadores.get(entrenador).setEdad(Integer.parseInt(sc.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("Edad no válida.");
                        }
                        break;
                    case 3:
                        System.out.print("Nuevo equipo: ");
                        try {
                            entrenadores.get(entrenador).setEquipo(E_Equipos.valueOf(sc.nextLine()));
                        } catch (IllegalArgumentException error) {
                            System.out.println("Error: " + error.getMessage());
                        }
                        break;
                    case 4:
                        System.out.print("Nueva formación preferida: ");
                        try {
                            entrenadores.get(entrenador).setFormacionPreferida(sc.nextLine());
                        } catch (X_formacionFormato e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (true);
        }
    }
    //endregion

    //region Gestion de Masajistas
    /**
     * Permite gestionar los masajistas del equipo.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param masajistas La lista de masajistas del equipo.
     */
    private static void gestionarMasajistas(Scanner sc, List<C_Masajista> masajistas) {
        int opcion;
        do {
            System.out.println("\n--- Mantenimiento de Masajistas ---");
            System.out.println("[1]. Añadir nuevo masajista");
            System.out.println("[2]. Modificar datos de masajista existente");
            System.out.println("[3]. Volver al menu principal");
            System.out.println("--------------------------------------------");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e1) {
                opcion = 0;
            }
            sc.nextLine();

            switch (opcion) {
                case 1: nuevoMasajista(sc, masajistas); break;
                case 2: modificarDatosMasajista(sc, masajistas); break;
                case 3: return;
                default: System.out.println("Opción no válida.");
            }
        } while (true);
    }

    /**
     * Permite añadir un nuevo masajista al equipo.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param masajistas La lista de masajistas del equipo.
     */
    private static void nuevoMasajista(Scanner sc, List<C_Masajista> masajistas) {
        System.out.println("\n--- Añadir nuevo masajista ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad;
        try {
            edad = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Edad no válida.");
            return;
        }

        System.out.print("Titulación: ");
        String titulacion = sc.nextLine();

        System.out.print("Años de experiencia: ");
        int añosExperiencia;
        try {
            añosExperiencia = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Años de experiencia no válidos.");
            return;
        }

        masajistas.add(new C_Masajista(nombre, edad, titulacion, añosExperiencia));
        System.out.println(nombre + " se ha añadido correctamente.");
    }

    /**
     * Permite modificar los datos de un masajista existente.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     * @param masajistas La lista de masajistas del equipo.
     */
    private static void modificarDatosMasajista(Scanner sc, List<C_Masajista> masajistas) {
        if (masajistas.isEmpty()) {
            System.out.println("No hay masajistas en la plantilla.");
        } else {
            System.out.println("\n--- Modificar datos de masajista ---");
            System.out.println("¿De qué masajista quieres hacer cambios?");
            for (int i = 0; i < masajistas.size(); i++) {
                System.out.println((i + 1) +
                        ", Nombre: " + masajistas.get(i).getNombre() +
                        ", Edad: " + masajistas.get(i).getEdad() +
                        ", Titulación: " + masajistas.get(i).getTitulacion() +
                        ", Años de experiencia: " + masajistas.get(i).getAñosExperiencia()
                );
            }
            System.out.print("Elige un masajista: ");
            int masajista = sc.nextInt() - 1;
            sc.nextLine();

            do {
                System.out.println("¿Qué quieres modificar?");
                System.out.println("[1]. Nombre");
                System.out.println("[2]. Edad");
                System.out.println("[3]. Titulación");
                System.out.println("[4]. Años de experiencia");
                System.out.println("[5]. Volver al menú anterior");
                System.out.print("Elige una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Nuevo nombre: ");
                        masajistas.get(masajista).setNombre(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Nueva edad: ");
                        try {
                            masajistas.get(masajista).setEdad(Integer.parseInt(sc.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("Edad no válida.");
                        }
                        break;
                    case 3:
                        System.out.print("Nueva titulación: ");
                        masajistas.get(masajista).setTitulacion(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("Nuevos años de experiencia: ");
                        try {
                            masajistas.get(masajista).setEdad(Integer.parseInt(sc.nextLine()));
                        } catch (NumberFormatException e) {
                            System.out.println("Años de experiencia no válidos.");
                        }
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (true);
        }
    }
    //endregion

    //region Gestion de Equipos
    /**
     * Permite gestionar los equipos del club.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     */
    private static void gestionarEquipos(Scanner sc) {
        int opcion;
        do {
            System.out.println("\n--- Gestión de Equipos ---");
            System.out.println("[1]. Listar todos los equipos");
            System.out.println("[2]. Elegir un equipo");
            System.out.println("[3]. Volver al menú principal");
            System.out.println("--------------------------------------------");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e1) {
                opcion = 0;
            }
            sc.nextLine();

            switch (opcion) {
                case 1: listarEquipos(); break;
                case 2: elegirEquipo(sc); break;
                case 3: return;
                default: System.out.println("Opción no válida.");
            }
        } while (true);
    }

    /**
     * Muestra la lista de equipos disponibles.
     */
    private static void listarEquipos() {
        System.out.println("\n--- Lista de Equipos ---");
        for (E_Equipos equipo : E_Equipos.values()) {
            System.out.println(equipo);
        }
    }

    /**
     * Permite elegir un equipo de la lista.
     *
     * @param sc El objeto Scanner para leer la entrada del usuario.
     */
    private static void elegirEquipo(Scanner sc) {
        System.out.println("\n--- Elegir un Equipo ---");
        System.out.println("Introduce el nombre del equipo:");
        String nombreEquipo = sc.nextLine();
        try {
            E_Equipos equipo = E_Equipos.valueOf(nombreEquipo.toUpperCase());
            System.out.println("Has elegido el equipo: " + equipo);
        } catch (IllegalArgumentException e) {
            System.out.println("Equipo no válido.");
        }
    }
    //endregion
}