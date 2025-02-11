package Ejercicios_Clase.Trimestre2.Redes_Sociales;
public class Usuario {
    private String nombre;
    private int edad;
    private String usr;
    private int seguidores;

    public Usuario(String nombre, int edad, String usr, int seguidores) {
        this.nombre = nombre;
        this.edad = edad;
        this.usr = usr;
        this.seguidores = seguidores;
    }

    public void info(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de Usuario: @" + usr);
        System.out.println("Seguidores: " + seguidores);
    }
}
