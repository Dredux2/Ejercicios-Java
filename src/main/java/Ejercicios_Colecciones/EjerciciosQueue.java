package Ejercicios_Colecciones;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class EjerciciosQueue {
    public static void main(String[] args) {
        EjerciciosQueue ejercicios = new EjerciciosQueue();
        ejercicios.Ejercicio1();
        System.out.println();
        ejercicios.Ejercicio2();
        System.out.println();
        ejercicios.Ejercicio3();
        System.out.println();
        ejercicios.Ejercicio4();
        System.out.println();
        ejercicios.Ejercicio5();
    }

    public void Ejercicio1(){
        Queue<Character> cola = new LinkedList<>();
        cola.offer('A');
        cola.offer('B');
        cola.offer('C');
        cola.offer('D');
        cola.offer('E');

        System.out.println("¿Esta vacia la cola?: " + cola.isEmpty());
        System.out.println("Tamaño de la cola: " + cola.size());

        // Muestra el primer elemento sin eliminarlo
        System.out.println("Primer elemento de la cola: " + cola.peek());
        System.out.println();

        System.out.println("Elementos de la cola: ");
        // Muestra las letras una por una y las va eliminando
        while (!cola.isEmpty()) {
            System.out.println("Elemento: " + cola.poll());
        }
    }

    public void Ejercicio2(){
        Queue<String> colaImpresion = new LinkedList<>();
        colaImpresion.offer("Documento1");
        colaImpresion.offer("Documento2");
        colaImpresion.offer("Documento3");
        colaImpresion.offer("Documento4");
        colaImpresion.offer("Documento5");

        System.out.println("Estado inicial de la cola de impresion: " + colaImpresion);
        while (!colaImpresion.isEmpty()){
            System.out.println("Imprimiendo " + colaImpresion.poll() + "...");
        }
        System.out.println("Estado de la cola: " + colaImpresion);
        System.out.println("No hay mas trabajos en la cola de impresion");
    }

    public void Ejercicio3(){
        Queue<String> playlist = new LinkedList<>();
        playlist.offer("Mirror - Justin Timberlake");
        playlist.offer("Toxic - Britney Spears");
        playlist.offer("Clavaito - Chanel feat. Abraham Mateo");
        playlist.offer("La reina - Lola Indigo");

        System.out.println("Estado inicial de la playlist: " + playlist);
        while (!playlist.isEmpty()){
            System.out.println("Reproduciendo: " + playlist.poll());
        }
        System.out.println("Playlist vacia");
    }

    public void Ejercicio4(){
        Deque<String> listaCompra = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String opcion;
        String producto;
        do {
            System.out.println("\n====Lista de la compra====");
            System.out.println("1. Añadir un producto");
            System.out.println("2. Eliminar el primer producto de la lista");
            System.out.println("3. Eliminar producto por nombre");
            System.out.println("4. Ver el primer producto");
            System.out.println("5. Buscar producto");
            System.out.println("6. Mostrar lista actual");
            System.out.println("X. Salir");
            System.out.println("===========================================");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.next();

            switch (opcion){
                case "1":
                    System.out.print("Inserte el nuevo producto: ");
                    producto = sc.next();
                    listaCompra.offerLast(producto);
                    System.out.println(producto + " añadido a la lista");
                    break;

                case "2":
                    System.out.println("Producto eliminado: " + listaCompra.pollFirst());
                    break;

                case "3":
                    System.out.print("Inserte el producto que desea eliminar: ");
                    producto = sc.next();
                    if (!listaCompra.contains(producto)){
                        System.out.println("El producto no se encuentra en la lista");
                    } else {
                        System.out.println(producto + " ha sido eliminado de la lista");
                        listaCompra.remove(producto);
                    }
                    break;

                case "4":
                    if (listaCompra.isEmpty()){
                        System.out.println("La lista de la compra esta vacia");
                    } else {
                        System.out.println(listaCompra.peekFirst());
                    }
                    break;

                case "5":
                    System.out.print("Inserte el producto que desea buscar: ");
                    producto = sc.next();
                    if (!listaCompra.contains(producto)){
                        System.out.println("El producto no se encuentra en la lista");
                    } else {
                        System.out.println(producto + " esta en la lista");
                    }
                    break;

                case "6":
                    if (listaCompra.isEmpty()) {
                        System.out.println("La lista de la compra está vacía");
                    } else {
                        System.out.println(listaCompra);
                    }
                    break;

                case "X":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no valida");
            }
        } while (!opcion.matches("X"));
    }

    public void Ejercicio5() {
        Deque<Character> palindroma = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte una palabra: ");
        String palabra = sc.next();

        for (char letra : palabra.toCharArray()) {
            palindroma.add(letra);
        }

        while (palindroma.size() > 1) {
            if (palindroma.pollFirst() != palindroma.pollLast()) {
                System.out.println("La palabra " + palabra + " no es palindroma.");
                return;
            }
        }
        System.out.println("La palabra " + palabra + " es palindroma.");
    }
}