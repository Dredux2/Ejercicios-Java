package Ejercicios_Clase.Trimestre2.Pokedex;
public class Planta extends Pokemon{
    public Planta(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("Latigo cepa");
    }
}