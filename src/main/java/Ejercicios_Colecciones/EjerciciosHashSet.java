package Ejercicios_Colecciones;
import java.util.*;

public class EjerciciosHashSet {
    public static void main(String[] args) {
        EjerciciosHashSet ejercicios = new EjerciciosHashSet();
        ejercicios.Ejercicio1();
        System.out.println();
        ejercicios.Ejercicio2();
        System.out.println();
        ejercicios.Ejercicio3();
        System.out.println();
        ejercicios.Ejercicio4();
    }

    public void Ejercicio1() {
        Set<String> unicas = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = sc.nextLine().toLowerCase();

        for (String palabra : frase.split(" ")){
            unicas.add(palabra);
        }
        System.out.println("Palabras unicas: " + unicas);
    }

    public void Ejercicio2(){
        Set<String> agenda = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String opcion, contacto;
        do {
            System.out.println("\n====Agenda====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("X. Salir");
            System.out.print("\nInserte una opcion: ");
            opcion = sc.nextLine();

            switch (opcion){
                case "1":
                    System.out.print("Nombre del nuevo contacto: ");
                    contacto = sc.nextLine();
                    if (agenda.contains(contacto)){
                        System.out.println("Error: " + contacto + " ya existe en la agenda");
                    } else {
                        agenda.add(contacto);
                        System.out.println(contacto + " ha sido añadid@ a la agenda");
                    }
                    break;
                case "2":
                    System.out.println("Contactos: " + agenda);
                    break;
                case "3":
                    System.out.print("Nombre del contacto que desea buscar: ");
                    contacto = sc.nextLine();
                    if (agenda.contains(contacto)){
                        System.out.println(contacto + " existe en la agenda");
                    } else {
                        System.out.println(contacto + " no existe en la agenda");
                    }
                    break;
                case "4":
                    System.out.print("Nombre del contacto que desea eliminar: ");
                    contacto = sc.nextLine();
                    if (agenda.contains(contacto)){
                        agenda.remove(contacto);
                        System.out.println(contacto + " ha sido eliminad@");
                    } else {
                        System.out.println(contacto + " no se encuentra en la agenda");
                    }
                    break;
                case "X":
                    System.out.println("Saliendo...");
                    break;
                default:
            }
        } while (!opcion.equals("X"));
    }

    public void Ejercicio3(){
        LinkedHashSet<String> links = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        String url = "";
        while (!url.equals("salir")){
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            url = sc.nextLine();
            links.add(url);
        }
        links.removeLast();
        System.out.println("Historial de navegacion: " + links);
    }

    public void Ejercicio4(){
        List<Integer> lista1 = Arrays.asList(1, 3, 5, 7, 8, 9);
        List<Integer> lista2 = Arrays.asList(5, 2, 4, 6, 8, 1, 3, 6);
        List<Integer> listaOrdenada = mezclados(lista1, lista2);

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista mezclada ordenada: " + listaOrdenada);
    }

    public List<Integer> mezclados(List<Integer> lista1, List<Integer> lista2) {
        TreeSet<Integer> conjunto = new TreeSet<>();
        conjunto.addAll(lista1);
        conjunto.addAll(lista2);
        return new ArrayList<>(conjunto);
    }
}
