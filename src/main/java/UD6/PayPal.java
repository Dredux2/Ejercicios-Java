package UD6.Ecommerce;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class PayPal extends MetodoPago {
    private String cuenta;
    private double saldo = 23;

    public boolean validarPayPal(double importe){
        System.out.print("Introduce los datos de tu cuenta: ");
        cuenta = Tienda.sc.nextLine();

        System.out.println("Validando cuenta...");
        if (!cuenta.matches("[^@]+@[^@]+\\.com")) {
            System.out.println("Los datos de tu cuenta no son correctos");
            return false;
        } else if (saldo < importe){
            System.out.println("Saldo insuficiente");
            return false;
        }
        return true;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Paypal");
    }
}
