package MercaDAM;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class AppZonaClientes {
    static Scanner sc = new Scanner(System.in);
    private static Cliente cliente;
    private static MercaDAM mercaDAM = new MercaDAM();
    public static void main(String[] args) {
        // Crear una instancia de MercaDAM para inicializar la lista de clientes
        MercaDAM mercaDAM = new MercaDAM();

        // Autenticación del cliente
        AppZonaClientes.autenticacion(MercaDAM.getListaClientes());
    }

    public static void autenticacion(List<Cliente> listaClientes){
        System.out.println(listaClientes);
        System.out.println("\n*** COMPRAS MERCADAM ***");

        String usr;
        String pass;
        boolean verificado = false;
        int contador = 1;
        do {
            for (Cliente nuevoCliente : listaClientes){
                System.out.print("Usuario: ");
                usr = sc.nextLine();

                System.out.print("Contraseña: ");
                pass = sc.nextLine();

                if (nuevoCliente.getNombre().equals(usr) && nuevoCliente.getContraseña().equals(pass)){
                    System.out.println("\nBienvenid@ " + pass);
                    verificado = true;
                    contador = 3;
                    break;
                } else {
                    System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
                    contador++;
                }
            }
        } while (contador != 3);
        if (!verificado){
            System.out.println("ERROR DE AUTENTICACION");
        }
    }

    public static void iniciarCompra(){

    }

    public static void imprimirProductos(){

    }

    public static void imprimirDespedida(){

    }
}