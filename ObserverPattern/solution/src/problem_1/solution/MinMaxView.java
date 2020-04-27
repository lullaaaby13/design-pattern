package problem_1.solution;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {

    private ScoreRecord scoreRecord;

    public MinMaxView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        List<Integer> scores = scoreRecord.getScores();
        displayMinMax(scores);
    }

    private void displayMinMax(List<Integer> scores) {
        Integer min = Collections.min(scores);
        Integer max = Collections.max(scores);
        System.out.println(String.format("Minimum Value: %d | Maximum Value: %d", min, max));
    }
}
