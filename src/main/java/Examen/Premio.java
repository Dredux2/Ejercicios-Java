package Examen;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter @AllArgsConstructor
public class Premio {
    private Categoria categoria;
    private Artista ganador;

    @Override
    public String toString(){
        return categoria.toString();
    }
}