package Ejercicios_Clase.Trimestre2.Pokedex;
public class Fuego extends Pokemon{
    public Fuego(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("Ascuas");
    }
}
