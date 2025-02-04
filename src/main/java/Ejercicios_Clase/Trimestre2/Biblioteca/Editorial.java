package Ejercicios_Clase.Trimestre2.Biblioteca;
import java.util.ArrayList;
public class Editorial {
    private String nombre;
    private ArrayList<Libro> librosPublicados = new ArrayList<>();

    public Editorial(String nombre) {
        this.nombre = nombre;
    }

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosPublicados() {
        return librosPublicados;
    }

    public void setLibrosPublicados(ArrayList<Libro> librosPublicados) {
        this.librosPublicados = librosPublicados;
    }
    //endregion

    public void addLibro(Libro libro) {
        librosPublicados.add(libro);
    }

    public void borrarLibro(Libro libro) {
        librosPublicados.remove(libro);
    }

    @Override
    public String toString() {
        return "Editorial: nombre = " + nombre + ", librosPublicados = " + librosPublicados;
    }
}