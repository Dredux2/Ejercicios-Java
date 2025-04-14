package UD7;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Cliente {
    private String usuario;
    private String contraseña;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contraseña, String direccion, Pedido pedido, boolean promociones) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = promociones;
    }

    public void crearPedido(){

    }

    // Incomplete code
    public void insertarProducto(String producto){
        for (Producto productos : Producto.values()){
            if (producto.equals(productos.name())){

            }
        }
    }

    public double importePedido(){
        return 0;
    }
}
