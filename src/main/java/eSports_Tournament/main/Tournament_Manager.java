package eSports_Tournament.main;
import eSports_Tournament.data.*;
import eSports_Tournament.exceptions.FullTeamException;
import java.util.ArrayList;
public class Tournament_Manager {
    ArrayList<Player> players = new ArrayList<>();
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Tournaments> tournaments = new ArrayList<>();
    ArrayList<Match> matches = new ArrayList<>();

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
        players.add(new Player("Raquel", 21, 6));
        players.add(new Player("Victor", 20, 5));
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
        Team team5 = new Team("Epsilon Squad", team5Players);
        teams.add(team5);

        // Team 6
        ArrayList<Player> team6Players = new ArrayList<>();
        team6Players.add(players.get(24));
        team6Players.add(players.get(25));
        team6Players.add(players.get(26));
        team6Players.add(players.get(27));
        Team team6 = new Team("Zeta Squad", team6Players);
        teams.add(team6);
        // endregion

        // region Build tournaments
        Tournament_Individual tournament1 = new Tournament_Individual("soloVS", "Super Smash Bros Ultimate", 33);
        Tournament_Mixed tournament2 = new Tournament_Mixed("MixVS", "League of Legends", 107, "5v5");
        Tournament_Team tournament3 = new Tournament_Team("TeamVS", "Helldivers 2", 87, 4);
        tournaments.add(tournament1);
        tournaments.add(tournament2);
        tournaments.add(tournament3);
        // endregion
    }

    public void findPlayer(String userName){
        for (Player jugador : players){
            if (jugador.getName().matches(userName)){
                System.out.println("Player found: ");
                System.out.println(jugador);
            }
        }
    }

    public void findTeam(String teamName){
        for (Team equipo : teams){
            if (equipo.getName().matches(teamName)){
                System.out.println("Team found: ");
                System.out.println(equipo);
            }
        }
    }

    public void showTournament(){
        for (Tournaments torneos : tournaments){
            System.out.println(torneos);
        }
    }

    public void showPlayerRanking(){
        players.sort((player1, player2) -> Double.compare(player2.getRanking(),player1.getRanking()));
        System.out.println("Players ordered by Ranking: ");
        for (Player jugador : players){
            System.out.println(jugador);
        }
    }
}