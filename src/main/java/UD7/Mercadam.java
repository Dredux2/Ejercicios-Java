package UD7;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
@Getter @Setter @ToString
public class Mercadam {
    static List<Cliente> clientes = new ArrayList<>();

    public static void generarClientes(){
        Random rm = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String listaCaracteres[] = caracteres.split("");
        for (int i = 0; i < 3; i++){
            String usr = "", pass = "";
            for (int j = 0; j < 8; j++){
                usr += listaCaracteres[rm.nextInt(caracteres.length())];
                pass += listaCaracteres[rm.nextInt(caracteres.length())];
            }
            clientes.add(new Cliente(usr, pass, "Calle Falsa, 123", null, false));
        }
    }

    public static List<Cliente> getClientes(){
        return Collections.unmodifiableList(clientes);
    }
}
