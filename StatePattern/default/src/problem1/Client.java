package problem1;

public class Client {

    /**
     *  스테이트 패턴(State Pattern)
     *
     *  A) 다음 용어들에 대해 설명해보세요
     *      - 상태
     *      - 상태 진입
     *
     *  B) 다음의 형광등 예제에서 문제점이 무엇인가요? 어떤 해결책이 필요한가요?
     *
     *  C) 스테이트 패턴을 토대로 코드를 개선해보세요. 취침등(SLEEPING) 상태일 때를 추가해 작성하세요.
     *      ON: ON버튼 클릭 -> 취침등
     *      SLEEPING: ON버튼 클릭 -> 일반등
     */


    public static void main(String[] args) {
        Light light = new Light();

        light.onButtonPush();
        light.onButtonPush();

        light.offButtonPush();
        light.offButtonPush();
    }

    /**
     * A) 스테이트 패턴은 무슨 패턴인가요? 어떤 이점이 있나요?
     *
     */
}
