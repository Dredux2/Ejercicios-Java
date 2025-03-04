package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Mixed_Tournament extends A_Tournaments {
    private String gameMode;

    public C_Mixed_Tournament(String tournamentName, String game, double price) {
        super(tournamentName, game, price);
    }

    @Override
    public String toString(){
        return "Mixed" + super.toString() + gameMode;
    }
}
