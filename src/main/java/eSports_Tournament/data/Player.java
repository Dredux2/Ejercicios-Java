package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Player extends Participant {
    private int level;
    private double ranking;

    public Player(String name, int level, double ranking) {
        super(name);
        this.level = level;
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return "Player: " + getName() + ", Lvl: " + level + ", Ranking: " + ranking;
    }
}
