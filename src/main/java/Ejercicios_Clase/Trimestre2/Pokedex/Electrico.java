package Ejercicios_Clase.Trimestre2.Pokedex;
public class Electrico extends Pokemon{
    public Electrico(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("Impactrueno");
    }
}
