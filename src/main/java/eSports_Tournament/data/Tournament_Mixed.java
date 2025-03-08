package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Tournament_Mixed extends Tournaments {
    private String gameMode;

    public Tournament_Mixed(String tournamentName, String game, double price, String gameMode) {
        super(tournamentName, game, price);
        if (gameMode.equals("1v1") || gameMode.equals("5v5")) {
            this.gameMode = gameMode;
        } else {
            System.out.println("Invalid game mode. Please choose either '1v1' or '5v5'.");
        }
    }

    @Override
    public String toString(){
        return "Mixed" + super.toString() + ", GameMode: " + gameMode;
    }
}