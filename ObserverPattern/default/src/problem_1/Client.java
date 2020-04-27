package problem_1;

public class Client {

    /**
     * 옵저버 패턴(Observer Pattern)
     *
     * 다음은 성적 값을 출력하는 프로그램입니다.
     * 입력된 점수를 보관하는 ScoreRecord 클래스와 점수를 목록 형태로 출력하는 DataSheetView 클래스가 있습니다.
     *
     * 두 클래스는 다음과 같이 동작합니다.
     * A) ScoreRecord 클래스에 점수를 추가하면 DataSheetView 클래스에 점수가 추가되었음을 통지합니다.
     * B) DataSheetView 클래스는 통지를 받으면 ScoreRecord클래스에서 새로 점수를 조회하여 출력합니다.
     *
     * PROBLEM A) 이 설계의 문제점은 무엇인가요?
     *
     * PROBLEM B)
     */

    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);

        scoreRecord.setDataSheetView(dataSheetView);

        for (int index = 1; index <= 5; index++) {
            int score =index * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
