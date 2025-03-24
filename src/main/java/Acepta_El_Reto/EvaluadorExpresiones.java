package Acepta_El_Reto;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class EvaluadorExpresiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expresion;
        while (true) {
            expresion = sc.nextLine();
            if (expresion.equals("00/")) {
                break;
            }
            evaluadorMain(expresion);
        }
    }

    public static void evaluadorMain(String expresion) {
        System.out.println(evaluadorPila(expresion));
        System.out.println(evaluadorCola(expresion));
    }

    private static int evaluadorCola(String expresion) {
        Queue<Integer> cola = new LinkedList<>();
        for (String caracter : expresion.split("")) {
            if (caracter.equals("+")) {
                while (cola.size() >= 2) {
                    int a = cola.remove();
                    int b = cola.remove();
                    cola.add(a + b);
                    System.out.println("Sumando: " + a + " + " + b);
                    System.out.println("Resultado: " + (a + b));
                }
            } else if (caracter.equals("-")) {
                while (cola.size() >= 2) {
                    int a = cola.remove();
                    int b = cola.remove();
                    cola.add(a - b);
                }
            } else if (caracter.equals("*")) {
                while (cola.size() >= 2) {
                    int a = cola.remove();
                    int b = cola.remove();
                    cola.add(a * b);
                }
            } else if (caracter.equals("/")) {
                while (cola.size() >= 2) {
                    int a = cola.remove();
                    int b = cola.remove();
                    cola.add(a / b);
                }
            } else {
                cola.add(Integer.parseInt(caracter));
            }
        }
        return cola.remove();
    }

    public static int evaluadorPila(String expresion){
        Stack<Integer> pila = new Stack<>();
        for (String caracter : expresion.split("")) {
            if (caracter.equals("+")) {
                while (pila.size() >= 2) {
                    int a = pila.pop();
                    int b = pila.pop();
                    pila.push(a + b);
                    System.out.println("Sumando: " + a + " + " + b);
                    System.out.println("Resultado: " + (a + b));
                }
            } else if (caracter.equals("-")) {
                while (pila.size() >= 2) {
                    int a = pila.pop();
                    int b = pila.pop();
                    pila.push(a - b);
                }
            } else if (caracter.equals("*")) {
                while (pila.size() >= 2) {
                    int a = pila.pop();
                    int b = pila.pop();
                    pila.push(a * b);
                }
            } else if (caracter.equals("/")) {
                while (pila.size() >= 2) {
                    int a = pila.pop();
                    int b = pila.pop();
                    pila.push(a / b);
                }
            } else {
                pila.push(Integer.parseInt(caracter));
            }
        }
        return pila.pop();
    }
}