package UD6;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.InputMismatchException;
import java.util.Random;
@Getter @Setter @ToString
public class Bizum extends MetodoPago{
    Random rm = new Random();
    private String teléfono;
    private int pin = rm.nextInt(100000, 999999);

    public boolean validarBizum(){
        System.out.println("PIN: " + pin);
        System.out.print("Introduce tu numero de telefono: ");
        teléfono = Tienda.sc.nextLine();
        try {
            System.out.print("Introduce tu pin: ");
            int numeroUsr = Tienda.sc.nextInt();

            System.out.println("Validando datos...");
            if (!teléfono.matches("[0-9]{9}")){
                System.out.println("Numero de telefono invalido");
                return false;
            } else if (pin != numeroUsr) {
                System.out.println("Numero PIN incorrecto");
                return false;
            }
        } catch (InputMismatchException error) {
            System.out.println("Numero PIN incorrecto");
            return false;
        }
        return true;
    }

    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum");
    }
}
