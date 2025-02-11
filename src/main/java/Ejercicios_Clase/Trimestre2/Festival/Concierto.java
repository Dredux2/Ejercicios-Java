package Ejercicios_Clase.Trimestre2.Festival;
public class Concierto {
    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador or1 = new Organizador("Juan Alverto", 33, "Seguridad");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();

        System.out.println("Información del Organizador:");
        or1.mostrarInfo();

    }
}