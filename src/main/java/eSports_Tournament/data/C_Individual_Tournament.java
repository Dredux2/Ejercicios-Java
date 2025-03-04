package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Individual_Tournament extends A_Tournaments {
    public C_Individual_Tournament(String tournamentName, String game, double price) {
        super(tournamentName, game, price);
    }

    @Override
    public String toString(){
        return "Individual" + super.toString();
    }
}