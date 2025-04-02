package MercaDAM;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Cliente {
    private String nombre;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String nombre, String contraseña, String direccion, Pedido pedido, boolean promociones) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = promociones;
    }

    public void crearPedido() {
    }

    public void insertarProducto(String producto) {

    }

    public double importePedido() {
        return 0;
    }
}
