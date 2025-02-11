package Ejercicios_Clase.Trimestre2.Redes_Sociales;
public class RedSocial {
    public static void main(String[] args) {
        Usuario usr1 = new Usuario("Juan", 25, "Juanito", 1000);
        Influencer influ1 = new Influencer("Pedro", 30, "Pedrito", 2000, "Pepito", "Juanito", "Luisito");
        Streamer str1 = new Streamer("Luis", 20, "Luisito", 500, 10, 100);

        usr1.info();
        System.out.println();
        influ1.info();
        System.out.println();
        str1.info();
    }
}
