package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public abstract class Tournaments {
    private String tournamentName;
    private String game;
    private double price;

    public Tournaments(String tournamentName, String game, double price){
        this.tournamentName = tournamentName;
        this.game = game;
        this.price = price;
    }

    @Override
    public String toString(){
        return " Tournament Type: " + tournamentName + "(" + game + "), Price: " + price + "€";
    }
}