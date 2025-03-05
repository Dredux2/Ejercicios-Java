package eSports_Tournament.data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Match{
    private Tournaments tournament;
    private Participant participant1;
    private Participant participant2;
    private String result;

    public Match(Participant participant1, Participant participant2) {
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.result = "pending";
    }
}