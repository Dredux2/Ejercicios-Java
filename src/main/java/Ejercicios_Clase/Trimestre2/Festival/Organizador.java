package Ejercicios_Clase.Trimestre2.Festival;
public class Organizador extends Persona {
    private String rol;
    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol = rol;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de rol: " + rol);
    }
}