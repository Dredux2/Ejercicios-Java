package UD7;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.*;
@Getter @Setter @ToString
public class Cliente {
    static Scanner sc = new Scanner(System.in);
    private String usuario;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;
    private HashMap<Producto, Integer> pedidoMAP;

    public Cliente(String usuario, String contraseña, String direccion, Pedido pedido, boolean promociones) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = promociones;
        pedidoMAP = new HashMap<>();
    }

    public void crearPedido(){
        if (pedido == null){
            pedido = new Pedido();
        }
    }

    public void insertarProducto(String producto){
        boolean productoValido = false;
        for (Producto productos : Producto.values()){
            if (producto.equals(productos.name())){
                if (!pedidoMAP.containsKey(productos)){
                    pedidoMAP.put(productos, 1);
                    pedido.setPedido(pedidoMAP);
                } else {
                    int cantidadActual = pedidoMAP.get(productos);
                    pedidoMAP.put(productos, cantidadActual + 1);
                    pedido.setPedido(pedidoMAP);
                }
                productoValido = true;
                pedido.setImporte_Total(importePedido());
                System.out.println("Has añadido " + producto + " con un precio de " + productos.precio + "€");
                System.out.println("Importe total del carrito: " + pedido.getImporte_Total() + "€");
                boolean valido = false;
                while (!valido){
                    System.out.print("¿Quieres añadir mas productos a tu carrito de la compra? [S/N]: ");
                    String opcion = sc.nextLine().toUpperCase();
                    switch (opcion){
                        case "S":
                            valido = true;
                            AppZonaClientes appZonaClientes = new AppZonaClientes();
                            appZonaClientes.iniciarCompra();
                            break;
                        case "N":
                            valido = true;
                            mostrarCarrito(0);
                            break;
                        default:
                            System.out.println("ERROR: Opcion Incorrecta\n");
                    }
                }
            }
        }
        if (!productoValido){
            System.out.println("El producto no existe! Elige otro\n");
            AppZonaClientes appZonaClientes = new AppZonaClientes();
            appZonaClientes.iniciarCompra();
        }
    }

    public double importePedido(){
        double importe = 0;
        for (Producto producto : pedido.getPedido().keySet()){
            if (pedidoMAP.containsKey(producto)){
                importe += producto.precio;
            }
        }
        return importe;
    }

    public void mostrarCarrito(int opcion){
        System.out.println("=================================================");
        System.out.println("RESUMEN DEL CARRITO DE LA COMPRA:");
        System.out.println("Productos:");
        for (Producto producto : pedido.getPedido().keySet()) {
            int cantidad = pedido.getPedido().get(producto);
            System.out.println(cantidad + " " + producto.name() + " " + producto.precio + "€");
        }
        System.out.println("IMPORTE TOTAL: " + pedido.getImporte_Total() + "€");
        System.out.println("=================================================");

        if (opcion != 2){
            System.out.println("¿QUE DESEA HACER?");
            System.out.println("[1] Aplicar promo");
            System.out.println("[2] Terminar pedido");
            System.out.println("=================================================");
            System.out.print("Elige la opcion: ");
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Opción no válida. Se terminará el pedido.");
                opcion = 2;
            }
        }

        switch (opcion){
            case 1:
                if (!promociones){
                    // Falta aplicar las promociones
                    System.out.println("Falta aplicar las promociones");
                } else {
                    System.out.println("YA HAS APLICADO TUS PROMOS\n");
                    mostrarCarrito(2);
                }
                break;
            case 2:
                System.out.println("GRACIAS POR SU PEDIDO. Se lo mandaremos a " + direccion);
                break;
            default:
                System.out.println("Opción no válida. Se terminará el pedido.");
                System.out.println("Finalizando pedido...");
                System.out.println("GRACIAS POR SU PEDIDO. Se lo mandaremos a " + direccion);
                break;
        }
    }
}