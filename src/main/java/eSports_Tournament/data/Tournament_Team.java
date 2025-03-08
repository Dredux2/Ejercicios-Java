package eSports_Tournament.data;
import eSports_Tournament.exceptions.FullTeamException;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Tournament_Team extends Tournaments {
    private int playersPerTeam;

    public Tournament_Team(String tournamentName, String game, double price, int playersPerTeam) throws FullTeamException {
        super(tournamentName, game, price);
        if (playersPerTeam < 2 || playersPerTeam > 5) {
            throw new FullTeamException("ERROR: The number of players per team must be between 2 and 5.");
        }
        this.playersPerTeam = playersPerTeam;
    }

    @Override
    public String toString(){
        return "Team" + super.toString() + ", Players per Team: " + playersPerTeam;
    }
}