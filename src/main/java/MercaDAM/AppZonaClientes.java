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
        MercaDAM mercaDAM = new MercaDAM();
        autenticacion(MercaDAM.getListaClientes());
        if (cliente != null) {
            iniciarCompra();
        }
    }

    public static void autenticacion(List<Cliente> listaClientes) {
        System.out.println(listaClientes);
        System.out.println("\n*** COMPRAS MERCADAM ***");

        String usr;
        String pass;
        boolean verificado = false;
        int contador = 0;

        do {
            System.out.print("Usuario: ");
            usr = sc.nextLine();

            System.out.print("Contraseña: ");
            pass = sc.nextLine();

            for (Cliente nuevoCliente : listaClientes) {
                if (nuevoCliente.getNombre().equals(usr) && nuevoCliente.getContraseña().equals(pass)) {
                    System.out.println("\n¡Hola " + usr + "!");
                    verificado = true;
                    cliente = nuevoCliente;
                    break;
                }
            }
            if (!verificado) {
                if (contador == 2) {
                    System.out.println("ERROR DE AUTENTICACION");
                } else {
                    System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
                }
                contador++;
            }
        } while (!verificado && contador < 3);
    }

    public static void iniciarCompra(){
        Pedido pedido = new Pedido();
        boolean productoValido = false;
        Producto productoElegido = null;
        while (!productoValido) {
            imprimirProductos();
            System.out.print("Elige un producto: ");
            try {
                productoElegido = Producto.valueOf(sc.nextLine().toUpperCase());
                productoValido = true;
            } catch (IllegalArgumentException error) {
                System.out.println("\n¡El producto no existe! Elige uno.");
            }
            cliente.insertarProducto(String.valueOf(productoElegido));
        }
    }

    public static void imprimirProductos(){
        System.out.println("\nAñade productos a tu lista de la compra:");
        for (Producto producto : Producto.values()) {
            System.out.println(producto + ": " + producto.getPrecio() + "€");
        }
        System.out.println("========================================");
    }

    public static void imprimirDespedida(){

    }
}