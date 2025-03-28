package MercaDAM;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Cliente {
    private String usuario;
    private String contraseña;
    private Pedido pedido;
    private boolean promociones;

    public void crearPedido(){

    }

    public void insertarProducto(){

    }

    public void importePedido(){

    }
}