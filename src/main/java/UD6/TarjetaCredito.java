package UD6.Ecommerce;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class TarjetaCredito extends MetodoPago {
    private String nro_tarjeta;
    private String tipo;

    public boolean validarTarjeta(){
        System.out.print("Introduce los datos de tu tarjeta (16 digitos): ");
        nro_tarjeta = Tienda.sc.nextLine();

        System.out.print("Tipo de tarjeta (VISA, MASTERCARD O MAESTRO): ");
        tipo = Tienda.sc.nextLine();

        System.out.println("Validando tarjeta...");
        if (!nro_tarjeta.matches("[0-9]{16}")){
            System.out.println("Los datos de tu tarjeta no son correctos");
            return false;
        } else if (!tipo.equals("VISA")
                && !tipo.equals("MASTERCARD")
                && !tipo.equals("MAESTRO")){
            System.out.println("Los datos de tu tarjeta no son correctos");
            return false;
        }
        return true;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de credito " + tipo);
    }
}
