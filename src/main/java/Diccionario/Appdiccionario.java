package Diccionario;
public class Appdiccionario {
    public static void main(String[] args) {
        diccionario traductor = new diccionario();
        traductor.nuevoPar("Hola", "Hello");
        traductor.nuevoPar("Azucar", "Sugar");
        traductor.traduce("Hola");
        System.out.println();
        traductor.primeraLetraTraduccion("Hola");
        traductor.palabraRandom();
    }
}