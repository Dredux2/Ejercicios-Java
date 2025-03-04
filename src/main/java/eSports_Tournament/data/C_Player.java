package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class C_Player extends A_Participant {
    private int level;
    private double ranking;

    public C_Player(String name, int level, double ranking) {
        super(name);
        this.level = level;
        this.ranking = ranking;
    }

    @Override
    public String toString(){
        return "Player: " + getName() + ", Lvl: " + level + ", Ranking: " + ranking;
    }
}
