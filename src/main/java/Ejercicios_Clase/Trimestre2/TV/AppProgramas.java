package Ejercicios_Clase.Trimestre2.TV;
import java.time.LocalDate;
public class AppProgramas {
    public static void main(String[] args) {
        Cadena cadena1 = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena1, 15);
        programa.agregarEmpleado("Barrancas", "colaborador");
        programa.agregarEmpleado("Juan", "técnico");
        programa.agregarInvitado("Will Smith", "actor", LocalDate.of(2021, 5, 10), 120);
        programa.agregarInvitado("Tom Cruise", "actor", LocalDate.of(2021, 5, 17), 120);
        programa.agregarInvitado("Brad Pitt", "actor", LocalDate.of(2021, 5, 24), 120);

        Programa programa2 = new Programa("El Intermedio", cadena1, 20);
        programa2.agregarDirector("Wyoming");
        programa2.agregarEmpleado("Sandra Sabatés", "presentador");
        programa2.agregarEmpleado("Dani Mateo", "colaborador");
        programa2.agregarEmpleado("Thais Villas", "colaborador");
        programa2.agregarEmpleado("Wyoming", "técnico");
        programa2.agregarInvitado("Will Smith", "actor", LocalDate.of(2021, 5, 10), 120);
        programa2.agregarInvitado("Tom Cruise", "actor", LocalDate.of(2021, 5, 17), 120);
        programa2.agregarInvitado("Brad Pitt", "actor", LocalDate.of(2021, 5, 24), 120);

        Cadena cadena2 = new Cadena("BBC");
        Programa programa3 = new Programa("Top Gear", cadena2, 30);
        programa3.agregarDirector("Jeremy Clarkson");
        programa3.agregarEmpleado("Richard Hammond", "presentador");
        programa3.agregarEmpleado("James May", "presentador");
        programa3.agregarEmpleado("Andy Wilman", "técnico");
        programa3.agregarInvitado("Tom Cruise", "actor", LocalDate.of(2021, 5, 10), 120);
        programa3.agregarInvitado("Will Smith", "actor", LocalDate.of(2021, 5, 17), 120);
        programa3.agregarInvitado("Brad Pitt", "actor", LocalDate.of(2021, 5, 24), 120);

        programa.getListaEmpleados().forEach(System.out::println);
        programa.getListaInvitados().forEach(System.out::println);
        System.out.println();
        programa2.getListaEmpleados().forEach(System.out::println);
        programa2.getListaInvitados().forEach(System.out::println);
        System.out.println();
        programa3.getListaEmpleados().forEach(System.out::println);
        programa3.getListaInvitados().forEach(System.out::println);
        System.out.println();

        cadena1.removerPrograma(programa2);
        cadena1.getListaProgramas().forEach(System.out::println);
        cadena2.getListaProgramas().forEach(System.out::println);
    }
}