package Ejercicios_Clase.Trimestre2.Taller;
public class Avion extends Vehiculo{
    private int alas;
    public Avion(String marca, String matricula, int alas) {
        super(marca, matricula);
        this.alas = alas;
    }

    // Se sobreescribe el metodo ruido de la clase Vehiculo
    public void ruido() {
        System.out.println("fffffffffffff fffffffffffff");
    }
}