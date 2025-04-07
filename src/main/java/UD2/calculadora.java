package UD2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        double num1Raiz, num2Raiz;
        String op;
        try {
            System.out.print("Introduce el primer operando: ");
            num1 = sc.nextInt();
        } catch (InputMismatchException error){
            System.out.println("ERROR: Valor no valido");
        }

        sc.nextLine();
        System.out.print("\nIntroduce el operador [+, -, *, /, R]: ");
        op = sc.nextLine().toUpperCase();

        try {
            System.out.print("\nIntroduce el segundo operando: ");
            num2 = sc.nextInt();
        } catch (InputMismatchException error){
            System.out.println("ERROR: Valor no valido");
        }

        switch (op){
            case "+":
                num1 = num1 + num2;
                System.out.println(num1);
                break;
            case "-":
                num1 = num1 - num2;
                System.out.println(num1);
                break;
            case "*":
                num1 = num1 * num2;
                System.out.println(num1);
                break;
            case "/":
                try {
                    num1 = num1 / num2;
                } catch (ArithmeticException error){
                    System.out.println("ERROR: Operacion incorrecta");
                }
                System.out.println(num1);
                break;
            case "R":
                num1Raiz = Math.sqrt(num1);
                num2Raiz = Math.sqrt(num2);
                System.out.println(num1Raiz);
                System.out.println(num2Raiz);
                break;
            default:
                System.out.println("ERROR: Formato incorrecto");
        }
    }
}