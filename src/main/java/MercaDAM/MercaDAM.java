package MercaDAM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString
public class MercaDAM {
    static Random rm = new Random();
    private static List<Cliente> listaClientes;

    public MercaDAM() {
        listaClientes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            generarClientes();
        }
    }

    public static void generarClientes () {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String caracterArray[] = caracteres.split("");
        int index;
        String usuario = "";
        String contraseña = "";

        for (int i = 0; i < 8; i++) {
            index = rm.nextInt(caracteres.length());
            usuario += caracterArray[index];

            index = rm.nextInt(caracteres.length());
            contraseña += caracterArray[index];
        }

        Cliente cliente = new Cliente(usuario, contraseña, "Calle falsa, 123", null, false);
        listaClientes.add(cliente);
    }

    public static List<Cliente> getListaClientes() {
        return Collections.unmodifiableList(listaClientes);
    }
}