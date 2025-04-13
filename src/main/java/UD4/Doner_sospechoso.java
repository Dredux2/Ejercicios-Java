package UD4;
public class Doner_sospechoso {
    static java.util.Scanner in;
    public static void casoDePrueba() {
        String numeros = in.nextLine();
        String[] listaNumeros = numeros.split(" ");
        if (listaNumeros.length != 3
                || Integer.parseInt(listaNumeros[0]) <= 0
                || Integer.parseInt(listaNumeros[2]) >= 10000){
            System.out.println("ERROR: Ingrese valores validos");
            casoDePrueba();
        } else {
            int num1 = Integer.parseInt(listaNumeros[0]);
            int num2 = Integer.parseInt(listaNumeros[1]);
            int num3 = Integer.parseInt(listaNumeros[2]);
            int paso1, paso2;
            if (num1 < num2){
                paso1 = num2 - num1;
            } else {
                paso1 = num1 - num2;
            }
            if (num2 < num3){
                paso2 = num3 - num2;
            } else {
                paso2 = num2 - num3;
            }

            System.out.println(paso1 + paso2);
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        } // main
    }
}