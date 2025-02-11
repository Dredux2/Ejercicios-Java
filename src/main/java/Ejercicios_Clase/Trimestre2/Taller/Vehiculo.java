package Ejercicios_Clase.Trimestre2.Taller;
public class Vehiculo {
    private String marca;
    private String matricula;

    public Vehiculo(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }

    public void info() {
        System.out.println("Vehiculo de la marca: " + marca + ", con matricula: " + matricula);
    }

    public void ruido() {
        System.out.println("brrrrrrr brrrrrrr");
    }
}