package UD2;
import java.util.Scanner;
public class numeroSuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento: ");
        String fecha = sc.nextLine();

        String listaNumeros[] = fecha.split("/");
        if (Integer.parseInt(listaNumeros[0]) < 0 || Integer.parseInt(listaNumeros[0]) > 31){
            System.out.println("ERROR: Formato de fecha incorrecto");
        }
        if (Integer.parseInt(listaNumeros[1]) < 0 || Integer.parseInt(listaNumeros[1]) > 12){
            System.out.println("ERROR: Formato de fecha incorrecto");
        }
        if (Integer.parseInt(listaNumeros[2]) < 0 || Integer.parseInt(listaNumeros[2]) > 9999){
            System.out.println("ERROR: Formato de fecha incorrecto");
        }

        int sumaFecha = 0;
        for (String numero : listaNumeros) {
            if (Integer.parseInt(numero) >= 0){
                sumaFecha += Integer.parseInt(numero);
            }
        }
        System.out.println(sumaFecha);

        String numeroSuerte = String.valueOf(sumaFecha);
        listaNumeros = numeroSuerte.split("");
        sumaFecha = 0;
        for (String numero : listaNumeros){
            if (Integer.parseInt(numero) >= 0){
                sumaFecha += Integer.parseInt(numero);
            }
        }
        System.out.println(sumaFecha);
    }
}