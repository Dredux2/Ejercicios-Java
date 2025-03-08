package eSports_Tournament.main;
import eSports_Tournament.exceptions.FullTeamException;
public class Main {
    public static void main(String[] args) throws FullTeamException {
        System.out.println("Iniciando gestor de torneos eSports...");
        Tournament_Manager manager = new Tournament_Manager();

        manager.initialize();
        manager.findPlayer("Juan");
        System.out.println("------------------------------");
        manager.findTeam("Alpha Squad");
        System.out.println("------------------------------");
        manager.showTournament();
        System.out.println("------------------------------");
        manager.showPlayerRanking();
        System.out.println("------------------------------");
    }
}