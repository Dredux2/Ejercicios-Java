package MercaDAM;
import lombok.Getter;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class Cliente {
    private String nombre;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;
    private HashMap<Producto, Integer> pedidoMAP;

    public Cliente(String nombre, String contraseña, String direccion, Pedido pedido, boolean promociones) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = promociones;
        this.pedidoMAP = new HashMap<>();
    }

    public void crearPedido() {
        if (this.pedido == null) {
            this.pedido = new Pedido();
        }
    }

    public void insertarProducto(String producto) {
        for (Producto productoElegido : Producto.values()){
            if (productoElegido.toString().equals(producto)){
                if (!pedidoMAP.containsKey(productoElegido)){
                    pedidoMAP.put(productoElegido, 1);
                    pedido.setPedido(pedidoMAP);
                } else {
                    int cantidadActual = pedidoMAP.get(productoElegido);
                    pedidoMAP.put(productoElegido, cantidadActual + 1);
                    pedido.setPedido(pedidoMAP);
                }
                System.out.println(importePedido(productoElegido));
            }
        }
    }

    public double importePedido(Producto productoAñadido) {
        double total = 0;
        double precioProducto;
        for (Map.Entry<Producto, Integer> productoElegido : pedidoMAP.entrySet()){
            precioProducto = productoElegido.getKey().getPrecio();
            total += precioProducto;
        }
        System.out.print("Has añadido " + productoAñadido + " por " + productoAñadido.getPrecio() + "€. ¿Quieres añadir mas productos a tu carrito de la compra? [S/N] ");
        String opcion = AppZonaClientes.sc.nextLine().toUpperCase();
        switch (opcion){
            case "S":
                AppZonaClientes.iniciarCompra();
                break;
            case "N":
                System.out.println("RESUMEN DE TU CARRITO:");
                System.out.println("Productos:");
                for (Map.Entry<Producto, Integer> productoElegido : pedidoMAP.entrySet()){
                    System.out.println(productoElegido.getKey() + " " + productoElegido.getKey().getPrecio() + "€");
                }
                break;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}
