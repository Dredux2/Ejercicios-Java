package Ejercicios_Clase.Trimestre2.Pokedex;
abstract class Pokemon {
    private int nivel;
    private int ps;

    public Pokemon(int nivel, int ps) {
        this.nivel = nivel;
        this.ps = ps;
    }

    public void imprimirDatos() {
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + ps);
    }
    public abstract void atacar();
}
