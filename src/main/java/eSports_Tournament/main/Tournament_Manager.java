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
        // region Build players
        // Creation of players
        players.add(new Player("Pablo", 15, 2));
        players.add(new Player("Juan", 18, 3));
        players.add(new Player("Ana", 20, 5));
        players.add(new Player("Marcos", 17, 2));
        players.add(new Player("Julio", 19, 4));
        players.add(new Player("Maria", 16, 3));
        players.add(new Player("Carlos", 21, 6));
        players.add(new Player("Sofia", 19, 4));
        players.add(new Player("Lucas", 20, 5));
        players.add(new Player("Elena", 18, 3));
        players.add(new Player("David", 22, 7));
        players.add(new Player("Miguel", 23, 6));
        players.add(new Player("Laura", 19, 4));
        players.add(new Player("Rodrigo", 21, 5));
        players.add(new Player("Carmen", 20, 4));
        players.add(new Player("Javier", 18, 3));
        players.add(new Player("Natalia", 22, 6));
        players.add(new Player("Roberto", 24, 7));
        players.add(new Player("Patricia", 19, 4));
        players.add(new Player("Fernando", 21, 5));
        players.add(new Player("Lucia", 17, 3));
        players.add(new Player("Sergio", 23, 6));
        players.add(new Player("Alicia", 20, 5));
        players.add(new Player("Daniel", 19, 4));
        players.add(new Player("Cristina", 22, 5));
        players.add(new Player("Alberto", 18, 3));
        // endregion

        // region Build teams
        // Team 1
        ArrayList<Player> team1Players = new ArrayList<>();
        team1Players.add(players.get(0));
        team1Players.add(players.get(1));
        team1Players.add(players.get(2));
        team1Players.add(players.get(3));
        team1Players.add(players.get(4));
        Team team1 = new Team("Alpha Squad", team1Players);
        teams.add(team1);

        // Team 2
        ArrayList<Player> team2Players = new ArrayList<>();
        team2Players.add(players.get(5));
        team2Players.add(players.get(6));
        team2Players.add(players.get(7));
        team2Players.add(players.get(8));
        team2Players.add(players.get(9));
        Team team2 = new Team("Beta Squad", team2Players);
        teams.add(team2);

        // Team 3
        ArrayList<Player> team3Players = new ArrayList<>();
        team3Players.add(players.get(10));
        team3Players.add(players.get(11));
        team3Players.add(players.get(12));
        team3Players.add(players.get(13));
        team3Players.add(players.get(14));
        Team team3 = new Team("Gamma Squad", team3Players);
        teams.add(team3);

        // Team 4
        ArrayList<Player> team4Players = new ArrayList<>();
        team4Players.add(players.get(15));
        team4Players.add(players.get(16));
        team4Players.add(players.get(17));
        team4Players.add(players.get(18));
        team4Players.add(players.get(19));
        Team team4 = new Team("Delta Squad", team4Players);
        teams.add(team4);

        // Team 5
        ArrayList<Player> team5Players = new ArrayList<>();
        team5Players.add(players.get(20));
        team5Players.add(players.get(21));
        team5Players.add(players.get(22));
        team5Players.add(players.get(23));
        team5Players.add(players.get(24));
        Team team5 = new Team("Epsilon Squad", team5Players);
        teams.add(team5);
        // endregion
    }

    public void showPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void showTeams() {
        for (Team team : teams) {
            System.out.println(team);
        }
    }
}
