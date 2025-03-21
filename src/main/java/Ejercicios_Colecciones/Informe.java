package Ejercicios_Colecciones;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Objects;
@Getter @Setter @ToString
public class Informe {
    private int codigo;
    private String descripcion;
    private TipoTareas tipo;

    public Informe(int codigo, String descripcion, TipoTareas tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }
}
