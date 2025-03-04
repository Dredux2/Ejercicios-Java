package Examen;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter @AllArgsConstructor
public class C_Premio {
    private E_Categoria categoria;
    private C_Artista ganador;

    @Override
    public String toString(){
        return categoria.toString();
    }
}