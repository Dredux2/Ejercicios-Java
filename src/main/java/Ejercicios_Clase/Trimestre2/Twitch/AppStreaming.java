package Ejercicios_Clase.Trimestre2.Twitch;
public class AppStreaming {
    public static void main(String[] args) {
        Suscripcion[] planes = {new PlanGratis("Plan Gratis", 0.0),
                new PlanBasico("Plan Básico", 4.99),
                new PlanFamiliar("Plan Familiar", 7.99),
                new PlanPremium("Plan Premium", 9.99)};

        for (Suscripcion plan : planes) {
            plan.mostrarInfo();
            plan.obtenerBeneficios();
            plan.obtenerPrueba();
            System.out.println();
        }
    }
}
