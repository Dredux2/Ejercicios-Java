package Acepta_El_Reto;
import java.util.Stack;
public class BalanceadorParentesis {
    public static boolean esBalanceado(String expresion){
        Stack<Character> pila = new Stack<>();
        for (char caracter : expresion.toCharArray()){
            if (caracter == '(' || caracter == '[' || caracter == '{'){
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}'){
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        String cadena1 = "({[]})()";
        String cadena2 = "Tengase en cuenta (obviamente) que puede haber otros simbolos.";
        String cadena3 = ":)";

        System.out.println(esBalanceado(cadena1));
        System.out.println(esBalanceado(cadena2));
        System.out.println(esBalanceado(cadena3));
    }
}