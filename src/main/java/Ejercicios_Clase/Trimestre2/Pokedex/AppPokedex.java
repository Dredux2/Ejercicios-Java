package Ejercicios_Clase.Trimestre2.Pokedex;
public class AppPokedex {
    public static void main(String[] args) {
        Pokemon pikachu = new Electrico(10, 100);
        Pokemon charmander = new Fuego(21, 100);
        Pokemon squirtle = new Agua(13, 100);
        Pokemon bulbasaur = new Planta(41, 100);

        pikachu.atacar();
        pikachu.imprimirDatos();
        System.out.println();

        charmander.atacar();
        charmander.imprimirDatos();
        System.out.println();

        squirtle.atacar();
        squirtle.imprimirDatos();
        System.out.println();

        bulbasaur.atacar();
        bulbasaur.imprimirDatos();
        System.out.println();
    }
}
