package UD5;
import java.time.LocalDate;
public class AppProgramas {
    public static void main(String[] args) {
        Cadena tve = new Cadena("TVE");
        Programa programa1 = new Programa("El Hormiguero", tve, 10);
        Programa programa2 = new Programa("La Resistencia", tve, 5);
        tve.añadirPrograma(programa1);
        tve.añadirPrograma(programa2);

        programa1.añadirEmpleado(new Empleado("Alicia", Cargos.PRESENTADOR));
        programa1.añadirEmpleado(new Empleado("Pepe", Cargos.COLABORADOR));
        programa1.añadirEmpleado(new Empleado("Hector"));

        programa1.añadirInvitado(new Invitado("Will Smith", "Actor", 3, LocalDate.of(2013, 2, 13)));
        programa1.añadirInvitado(new Invitado("Will Smith", "Actor", 8, LocalDate.of(2023, 10, 1)));
        programa2.añadirInvitado(new Invitado("Will Smith", "Actor", 5));
        programa1.añadirInvitado(new Invitado("Cristina Pedroche", "Presentadora", 10, LocalDate.of(2025, 3, 2)));
        programa1.añadirInvitado(new Invitado("David Broncano", "Presentador", 10));

        programa1.invitadosTemporada(10);
        programa1.rastrearInvitado("Will Smith");
        tve.invitadoAntes("Will Smith");

        System.out.println();
        System.out.println("Cadena de '" + programa1.getNombre() + "': " + programa1.getCadena());
        tve.eliminarPrograma(programa1);
        System.out.println("Cadena de '" + programa1.getNombre() + "': " + programa1.getCadena());
    }
}