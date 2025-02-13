package Ejercicios_Clase.Trimestre2.Twitch;
public class PlanBasico extends Suscripcion {
    public PlanBasico(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    public void obtenerPrueba() {
        System.out.println("30 dias de prueba gratuita.");
    }
}
