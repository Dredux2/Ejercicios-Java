package Ejercicios_Clase.Trimestre2.Taller;

public class Tren extends Vehiculo {
    private int vagones;

    public Tren(String marca, String matricula, int vagones) {
        super(marca, matricula);
        this.vagones = vagones;
    }

    // Se sobreescribe el metodo ruido de la clase Vehiculo
    public void ruido() {
        System.out.println("chuchuchuchu chuchuchuchu");
    }
}
