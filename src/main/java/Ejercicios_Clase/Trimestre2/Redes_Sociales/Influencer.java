package Ejercicios_Clase.Trimestre2.Redes_Sociales;
import java.util.ArrayList;
import java.util.Arrays;
public class Influencer extends Usuario {
    ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String usr, int seguidores, String... colaboradores) {
        super(nombre, edad, usr, seguidores);
        this.colaboraciones = new ArrayList<>(Arrays.asList(colaboradores));
    }

    public void info(){
        super.info();
        System.out.println("Colaboradores: " + colaboraciones);
    }
}
