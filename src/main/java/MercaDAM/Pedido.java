package MercaDAM;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private double importe_Total;

    public Pedido() {
        this.pedido = new HashMap<>();
        this.importe_Total = 0.0;
    }

    public void Promo_3x2() {
    }

    public void Promo_10() {
    }
}
