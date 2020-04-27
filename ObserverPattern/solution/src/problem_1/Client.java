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
     *  A) 성적을 다른 형태로 출력하고 싶다면 어떤 변경 작업을 해야하나요?
     *      예를 들어 성적을 목록으로 출력하지 않고 성적의 최소/최대 값만 출력하려면?
     *  B) 여러 가지 형태의 성적을 동시 혹은 순차적으로 출력하려면 어떤 변경 작업을 해야하나요?
     *      예를 들어 성적이 입력 되었을 때 최대 3개 목록, 최대 5개 목록, 최소/최대 값을 동시에 출력하거나
     *      처음에는 목록으로 출력하고 나중에는 최소//최대 값을 출력하려면?
     *
     * PROBLEM B) 다음 조건에 따라 문제점을 해결해보세요
     *  조건1) 최대 3개 목록, 최대 5개목록, 최소/최대 목록을 통해 값을 출력하도록 변경하세요.
     *
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

    /**
     * C) 옵저버 패턴은 어떤 패턴인가요?
     *  - 옵저버 패턴은 통보 대상 객체의 관리를 Subject 클래스와 Observer 인터페이스로 일반화한다.
     *  - 그렇게하면 데이터 변경을 통보하는 클래스는 통보 대상 클래스나 객체에 대한 의존성을 없앨 수 있다.
     *  - 결과적으로 옵저버 패턴은 통보 대상 클래스나 대상 객체의 변경에도 통보 클래스를 수정 없이 그대로 사용할 수 있게 한다.
     *
     * D) 어떤 상황에서 유용한지 예를 들어 설명해보세요
     *  상황1)
     *      - 새로운 파일이 추가되거나 기존 파일이 삭제 되었을 때 탐색기는 이를 즉시 표시할 필요가 있다.
     *      - 이 때 여러 개의 탐색기에 즉시 변경을 통보해 주어야 한다.
     *
     */
}
