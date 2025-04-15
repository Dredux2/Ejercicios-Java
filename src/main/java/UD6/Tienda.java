package UD6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tienda {
    static Scanner sc = new Scanner(System.in);
    public static void iniciarPago(){
        System.out.print("¿Que metodo de pago quieres usar? [Bizum, Paypal, Tarjeta]: ");
        String metodo = sc.nextLine();
        MetodoPago metodoPago;
        double importe;
        switch (metodo) {
            case "Bizum":
                Bizum bizum = new Bizum();
                if (bizum.validarBizum()){
                    metodoPago = bizum;
                    try {
                        System.out.print("Introduce el importe a pagar: ");
                        importe = sc.nextDouble();
                        realizarPago(metodoPago, importe);
                    } catch (InputMismatchException error){
                        System.out.print("Importe no valido");
                    }
                }
                break;
            case "Paypal":
                PayPal payPal = new PayPal();
                try {
                    System.out.print("Introduce el importe a pagar: ");
                    importe = sc.nextDouble();
                    if (payPal.validarPayPal(importe)){
                        metodoPago = payPal;
                        realizarPago(metodoPago, importe);
                    }
                } catch (InputMismatchException error){
                    System.out.print("Importe no valido");
                }
                break;
            case "Tarjeta":
                TarjetaCredito tarjeta = new TarjetaCredito();
                if (tarjeta.validarTarjeta()){
                    metodoPago = tarjeta;
                    try {
                        System.out.print("Introduce el importe a pagar: ");
                        importe = sc.nextDouble();
                        realizarPago(metodoPago, importe);
                    } catch (InputMismatchException error){
                        System.out.print("Importe no valido");
                    }
                }
                break;
            default:
                System.out.println("Método de pago no válido.");
        }
    }

    public static void realizarPago(MetodoPago metodo, double importe) {
        metodo.procesarPago(importe);
    }
}
