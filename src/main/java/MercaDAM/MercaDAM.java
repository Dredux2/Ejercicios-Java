package MercaDAM;
import java.util.Collections;
import java.util.List;
public class MercaDAM {
    private static List<Cliente> clientes;

    public static void generarClientes(){

    }

    public static List<Cliente> getClientes(){
        return Collections.unmodifiableList(clientes);
    }
}