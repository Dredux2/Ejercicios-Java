package Ejercicios_Clase.Trimestre2.Twitch;
public class PlanFamiliar extends Suscripcion{
    public PlanFamiliar(String nombrePlan, double precio){
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");
    }

    @Override
    public void obtenerPrueba() {
        System.out.println("14 dias de prueba gratuita.");
    }
}
