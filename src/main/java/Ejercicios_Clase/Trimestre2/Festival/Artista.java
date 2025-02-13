package Ejercicios_Clase.Trimestre2.Festival;
//subclase que también hereda de Persona
class Artista extends Persona {

    String generoMusical;

    public Artista(String nombre, int edad, String generoMusical) {
        super(nombre, edad);
        this.generoMusical = generoMusical;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género Musical: " + generoMusical);
    }

    public static void accederEvento() {
        System.out.println("Accediendo al evento como artista: Preparando el show");
    }
}