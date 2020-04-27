package problem_1.solution;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {

    private List<Integer> scores = new ArrayList<>();

    public void addScore(Integer score) {
        scores.add(score);

        notifyObservers();
    }

    public List<Integer> getScores() {
        return scores;
    }
}
