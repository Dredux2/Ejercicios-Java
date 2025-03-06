package eSports_Tournament.data;
import eSports_Tournament.exceptions.FullTeamException;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
@Getter @Setter
public class Team extends Participant {
    private ArrayList<Player> players;
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 5;

    public Team(String name, ArrayList<Player> players) throws FullTeamException {
        super(name);
        if (players.size() < MIN_PLAYERS || players.size() > MAX_PLAYERS) {
            throw new FullTeamException("ERROR: The team must have between " + MIN_PLAYERS + " and " + MAX_PLAYERS + " players.");
        }
        this.players = new ArrayList<>(players);
    }

    public void addPlayer(Player player) throws FullTeamException {
        if (players.size() < MAX_PLAYERS){
            players.add(player);
        } else {
            throw new FullTeamException("ERROR: This team has reached the maximum number of players.");
        }
    }

    @Override
    public String toString(){
        return getName() + " Team - Members: " + players.size() + "/5";
    }
}
