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
    }

    public static int evaluadorPila(String expresion){
        Stack<Integer> pila = new Stack<>();
        for (String caracter : expresion.split("")) {
            if (caracter.equals("+")) {
                int a = pila.pop();
                int b = pila.pop();
                pila.push(a + b);
            } else if (caracter.equals("-")) {
                int a = pila.pop();
                int b = pila.pop();
                pila.push(a - b);
            } else if (caracter.equals("*")) {
                int a = pila.pop();
                int b = pila.pop();
                pila.push(a * b);
            } else if (caracter.equals("/")) {
                int a = pila.pop();
                int b = pila.pop();
                pila.push(a / b);
            } else {
                pila.push(Integer.parseInt(caracter));
            }
        }
        return pila.pop();
    }
}