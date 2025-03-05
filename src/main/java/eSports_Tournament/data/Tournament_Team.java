package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Tournament_Team extends Tournaments {
    private int playersPerTeam;

    public Tournament_Team(String tournamentName, String game, double price) {
        super(tournamentName, game, price);
    }

    @Override
    public String toString(){
        return "Team" + super.toString() + playersPerTeam;
    }
}