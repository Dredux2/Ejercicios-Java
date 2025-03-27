package Ejercicios_Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class MaquinaMaria {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Escribe un texto: ");
        String entrada = sc.nextLine();

        // Crear una lista enlazada para almacenar los caracteres
        LinkedList<Character> textos = new LinkedList<>();
        // Agregar los caracteres de la cadena de entrada a la lista
        ListIterator<Character> it = textos.listIterator();

        for (char caracter : entrada.toCharArray()) {
            // Switch para manejar los caracteres especiales
            switch (caracter){
                // Mueve el cursor a la izquierda si hay un elemento anterior
                case '<':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                // Mueve el cursor a la derecha si hay un elemento siguiente
                case '>':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                // Borra el carácter a la izquierda del cursor
                case '#':
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                default:
                    it.add(caracter);
                    break;
            }
        }

        // Imprimir el resultado
        for (char caracter : textos) {
            System.out.print(caracter);
        }
    }
}