package Ejercicios_Colecciones;
import java.util.HashSet;
import java.util.Stack;
public class AppInformes {
    static Stack<Informe> informes = new Stack<>();
    static HashSet<Informe> listaInformesPorTipo = new HashSet<>();
    public static void main(String[] args) {
        informes.push(new Informe(1, "Grapar documentos", TipoTareas.ADMINISTRATIVO));
        informes.push(new Informe(1, "Atender llamadas", TipoTareas.ADMINISTRATIVO));
        informes.push(new Informe(2, "Reponer folios", TipoTareas.ADMINISTRATIVO));
        informes.push(new Informe(1, "Llamar a casa", TipoTareas.PERSONAL));
        informes.push(new Informe(2, "Comprar pan", TipoTareas.PERSONAL));

        System.out.println(informes);
        while (!informes.isEmpty()){
            System.out.println(informes.pop());
        }
        System.out.println();

        informes.push(new Informe(1, "Grapar documentos", TipoTareas.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(1, "Grapar documentos", TipoTareas.ADMINISTRATIVO));
        informes.push(new Informe(1, "Atender llamadas", TipoTareas.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(1, "Atender llamadas", TipoTareas.ADMINISTRATIVO));
        informes.push(new Informe(2, "Reponer folios", TipoTareas.ADMINISTRATIVO));
        listaInformesPorTipo.add(new Informe(2, "Reponer folios", TipoTareas.ADMINISTRATIVO));

        for (int i = informes.size() - 1; i >= 0; i--) {
            System.out.println(informes.get(i));
        }

        System.out.println("Tienes " + listaInformesPorTipo.size() + " tipos de informes");
        informes.pop();
    }
}
