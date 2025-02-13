package Ejercicios_Clase.Trimestre2.Twitch;
abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){
        this.nombrePlan = nombrePlan;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Nombre del plan: " + nombrePlan);
        System.out.println("Precio: " + precio);
    }

    public abstract void obtenerBeneficios();
    public abstract void obtenerPrueba();
}
