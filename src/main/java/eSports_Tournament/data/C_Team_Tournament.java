package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Team_Tournament extends A_Tournaments {
    private int playersPerTeam;

    public C_Team_Tournament(String tournamentName, String game, double price) {
        super(tournamentName, game, price);
    }

    @Override
    public String toString(){
        return "Team" + super.toString() + playersPerTeam;
    }
}