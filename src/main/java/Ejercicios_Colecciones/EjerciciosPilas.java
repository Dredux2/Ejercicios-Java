package Ejercicios_Colecciones;
import java.util.Scanner;
import java.util.Stack;
public class EjerciciosPilas {
    public static void main(String[] args) {
        EjerciciosPilas ejercicios = new EjerciciosPilas();
        ejercicios.Ejercicio1();
        System.out.println();
        ejercicios.Ejercicio2();
        System.out.println();
        ejercicios.Ejercicio3();
    }

    public void Ejercicio1() {
        Stack<Character> pila = new Stack<>();
        pila.push('A');
        pila.push('B');
        pila.push('C');
        pila.push('D');
        pila.push('E');

        System.out.println("¿Esta vacia la pila?: " + pila.isEmpty());
        System.out.println("Tamaño de la pila: " + pila.size());

        // Muestra el ultimo elemento sin eliminarlo
        System.out.println("Ultimo elemento de la pila: " + pila.peek());
        System.out.println();

        System.out.println("Elementos de la pila: ");
        // Muestra las letras una por una y las va eliminando
        while (!pila.isEmpty()) {
            System.out.println("Elemento: " + pila.pop());
        }
    }

    public void Ejercicio2() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce el valor numero " + (i + 1) + ": ");
            pila.push(sc.nextInt());
        }

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }

    public void Ejercicio3(){
        String expresion = "((2+3)*(5-1))";
        String expresion2 = "(2+3))+(5-1)(";
        System.out.println("¿La expresion " + expresion + " es balanceada?: " + esBalanceado(expresion));
        System.out.println("¿La expresion " + expresion2 + " es balanceada?: " + esBalanceado(expresion2));
    }

    public boolean esBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {
            char character = expresion.charAt(i);
            // Verifica si el caracter es un parentesis abierto
            if (character == '(' || character == '[' || character == '{') {
                pila.push(character);
            // Si el caracter es un parentesis cerrado verifica si la pila esta vacia
            } else if (character == ')' || character == ']' || character == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                // Si la pila no esta vacia, saca el ultimo elemento
                char apertura = pila.pop();
                if ((character == ')' && apertura != '(') ||
                    (character == ']' && apertura != '[') ||
                    (character == '}' && apertura != '{')) {
                    return false;
                }
            }
        }
        return true;
    }
}
