package MercaDAM;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.HashMap;
@Getter @Setter @ToString
public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private double importe_total;

    public void aplicarPromo3x2(){

    }

    public void aplicarPromo10(){

    }
}