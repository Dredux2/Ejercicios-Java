package eSports_Tournament.data;
import eSports_Tournament.exceptions.FullTeamException;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
@Getter @Setter
public class C_Team extends A_Participant {
    private ArrayList<C_Player> players;
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 5;

    public C_Team(String name, ArrayList<C_Player> players) throws FullTeamException {
        super(name);
        if (players.size() < MIN_PLAYERS || players.size() > MAX_PLAYERS) {
            throw new FullTeamException("ERROR: El equipo debe tener entre " + MIN_PLAYERS + " y " + MAX_PLAYERS + " jugadores.");
        }
        this.players = new ArrayList<>(players);
    }

    public void addPlayer(C_Player player) throws FullTeamException {
        if (players.size() < MAX_PLAYERS){
            players.add(player);
        } else {
            throw new FullTeamException("ERROR: Este equipo a alcanzado el numero maximo de jugadores.");
        }
    }

    @Override
    public String toString(){
        return getName() + " Team - Members: " + players.size() + "/5";
    }
}
