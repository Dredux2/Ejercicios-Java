package eSports_Tournament.main;
import eSports_Tournament.data.Match;
import eSports_Tournament.data.Player;
import eSports_Tournament.data.Team;
import eSports_Tournament.data.Tournaments;
import eSports_Tournament.exceptions.FullTeamException;
import java.util.ArrayList;
public class Tournament_Manager {
    ArrayList<Player> players = new ArrayList<Player>();
    ArrayList<Team> teams = new ArrayList<Team>();
    ArrayList<Tournaments> tournaments = new ArrayList<Tournaments>();
    ArrayList<Match> matches = new ArrayList<Match>();

    public void initialize() throws FullTeamException {
        players.add(new Player("Pablo", 15, 2));
        players.add(new Player("Juan", 15, 2));
        players.add(new Player("Ana", 15, 2));
        players.add(new Player("Marcos", 15, 2));
        players.add(new Player("Julio", 15, 2));
        players.add(new Player("Maria", 15, 2));

        teams.add(new Team("Team1", players));
    }
}
