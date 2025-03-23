package Diccionario;
public class Appdiccionario {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        diccionario.nuevoPar("Manzana", "Apple");
        diccionario.nuevoPar("Dedo", "Finger");
        diccionario.traduce("Manzana");
        diccionario.palabraAleatoria();
        diccionario.primeraLetraTraduccion("Manzana");
    }
}