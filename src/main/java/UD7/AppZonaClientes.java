package UD7;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Scanner;
@Getter @Setter @ToString
public class AppZonaClientes {
    private static Cliente cliente;

    public AppZonaClientes(){
        Mercadam.generarClientes();
    }

    public void autenticacion(List<Cliente> clientes){
        Scanner sc = new Scanner(System.in);
        for (Cliente listaCliente : clientes){
            System.out.println(listaCliente);
        }

        System.out.println("\n*** COMPRA ONLINE DE MERCADAM ***");
        boolean valido = false;
        for (int i = 0; i < 3; i++){
            System.out.print("Usuario: ");
            String usr = sc.nextLine();

            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            for (Cliente listaCliente : clientes){
                if (listaCliente.getUsuario().equals(usr) && listaCliente.getContraseña().equals(pass)){
                    valido = true;
                    System.out.println("\nBienvenid@ " + usr);
                    cliente = listaCliente;
                    iniciarCompra();
                    break;
                }
            }
            if (valido){
                break;
            }
            if (i < 2){
                System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...\n");
            }
            if (i == 2){
                System.out.println("ERROR DE AUTENTICACION");
            }
        }
    }

    public void iniciarCompra(){
        cliente.crearPedido();
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade productos a tu lista de la compra...");
        imprimirProductos();
        System.out.println("==========================================");
        System.out.print("Elige un producto: ");
        String producto = sc.nextLine().toUpperCase();
        cliente.insertarProducto(producto);
    }

    public void imprimirProductos(){
        for (Producto producto : Producto.values()){
            System.out.println(producto.name() + ": " +  producto.precio + "€");
        }
    }

    public void imprimirDespedida(){

    }
}
