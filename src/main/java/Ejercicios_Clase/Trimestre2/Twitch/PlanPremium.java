package Ejercicios_Clase.Trimestre2.Twitch;
public class PlanPremium extends Suscripcion{
    public PlanPremium(String nombrePlan, double precio){
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }

    @Override
    public void obtenerPrueba() {
        System.out.println("7 dias de prueba para cuentas nuevas.");
    }
}
