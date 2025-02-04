package Ejercicios_Clase.Trimestre2.TV;
import java.time.LocalDate;
public class AppProgramas {
    public static void main(String[] args) {
        Cadena cadena = new Cadena("Antena 3");
        Programa programa = new Programa("El Hormiguero", cadena, 15);
        programa.agregarEmpleado("Pablo Motos", "presentador");
        programa.agregarEmpleado("Trancas", "colaborador");
        programa.agregarEmpleado("Barrancas", "colaborador");
        programa.agregarEmpleado("Juan", "técnico");
        programa.agregarInvitado("Will Smith", "actor", LocalDate.of(2021, 5, 10), 120);
        programa.agregarInvitado("Tom Cruise", "actor", LocalDate.of(2021, 5, 17), 120);
        System.out.println(programa);
    }
}
