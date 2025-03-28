package pruebas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class pruebas {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 9, 11));
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Patricia", "Ana", "Pedro", "Juan"));
        Collections.sort(strings);

        System.out.println("Sorted strings: " + strings);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Sudadera", 6));
        listaProductos.add(new Producto("Pan", 1));
        listaProductos.add(new Producto("Cerveza", 2));
        listaProductos.add(new Producto("Cerveza", 1));

//        Collections.sort(listaProductos);
//        System.out.println("Lista de productos ordenada: " + listaProductos);

        Collections.sort(listaProductos, new comparacionPrecio());
        System.out.println("Lista de productos ordenada por precio: " + listaProductos);

    }
}
