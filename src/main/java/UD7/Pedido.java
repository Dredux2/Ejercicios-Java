package UD7;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private double importe_Total;

    public Pedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
        this.importe_Total = 0;
    }

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }
}
