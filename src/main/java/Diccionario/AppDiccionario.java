package Diccionario;
public class AppDiccionario {
    public static void main(String[] args) {
        Diccionario Diccionario = new Diccionario();
        Diccionario.nuevoPar("Manzana", "Apple");
        Diccionario.nuevoPar("Dedo", "Finger");
        Diccionario.traduce("Manzana");
        Diccionario.palabraRandom();
        Diccionario.primeraLetraTraduccion("Manzana");
    }
}