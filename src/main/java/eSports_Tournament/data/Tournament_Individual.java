package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Tournament_Individual extends Tournaments {
    public Tournament_Individual(String tournamentName, String game, double price) {
        super(tournamentName, game, price);
    }

    @Override
    public String toString(){
        return "Individual" + super.toString();
    }
}