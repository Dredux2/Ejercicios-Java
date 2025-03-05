package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Tournament_Mixed extends Tournaments {
    private String gameMode;

    public Tournament_Mixed(String tournamentName, String game, double price) {
        super(tournamentName, game, price);
    }

    @Override
    public String toString(){
        return "Mixed" + super.toString() + gameMode;
    }
}