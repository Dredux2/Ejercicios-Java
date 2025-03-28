package pruebas;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;
@Getter @Setter @ToString
public class Producto /*implements Comparable<Producto>*/ {
    private String nombre;
    private Integer precio;

    public Producto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Double.compare(precio, producto.precio) == 0 && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

//    @Override
//    public int compareTo(Producto producto) {
//        int comparacionNombre = nombre.compareTo(producto.nombre);
//
//        if (comparacionNombre != 0) {
//            return comparacionNombre;
//        }
//
//        return precio.compareTo(producto.precio);
//    }
}