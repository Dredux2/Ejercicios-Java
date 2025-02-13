package Ejercicios_Clase.Trimestre2.Festival;
public class Concierto {
    public static void main(String[] args) {

        Persona artista = new Artista("Sofía", 25, "Rock Alternativo");
        Persona asistente = new Asistente("Lucas", 18, "VIP");
        Persona organizador = new Organizador("Martín", 30, "Producción");

        //usamos el metodo con polimorfismo
        mostrarAcceso(artista);      //Accediendo como Artista: Preparando el show.
        mostrarAcceso(asistente);    //Accediendo como Asistente: Buscando su asiento.
        mostrarAcceso(organizador);  //Accediendo como Organizador: Coordinando el evento.
    }

    public static void mostrarAcceso(Persona persona) {
        Persona.accederEvento();
    }
}