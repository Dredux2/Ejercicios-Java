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
            }
        }
    }

    public double importePedido() {
        double total = 0;
        for (Map.Entry<Producto, Integer> precioElegido : pedidoMAP.entrySet()){
            double precios = precioElegido.getKey().getPrecio();
            total += precios;
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
