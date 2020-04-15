package problem_1;

public class Client {

    /**
     * 커맨드패턴(Command Pattern)
     *
     * 개요)
     *  다음은 버튼을 눌렀을 때 램프의 불이 켜지도록 하는 간단한 예제입니다.
     *  커맨드 패턴을 사용해 문제를 해결해보세요.
     *
     * A) 다음의 램프 예제에서 문제점이 무엇인가요?
     *
     * B) 커맨드 패턴을 토대로 문제점을 개선해보세요.
     *
     */

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);
        button.press();
    }

    /**
     * 커맨드 패턴은 어떠한 패턴인가요?
     *
     */
}
