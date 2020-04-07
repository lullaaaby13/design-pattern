package problem1;

import problem1.robot.Atom;
import problem1.robot.TaekwonV;

public class Client {
    /**
     *  다음 문제에 답하고 조건에 맞게 리팩토링하세요.
     *
     *  A) 기존 로봇의 공격 또는 이동 방법을 수정하려면 어떤 변경 작업을 해야 하는가? 예를 들어 아톰이 날 수는 없고 오직 걷게만 만들고 싶다면? 또는 태권V를 날게 하려면?
     *      A-1) SOLID의 어떤 원칙을 위배하는 설계인가요?
     *
     *  B) 새로운 로봇을 만들어 기존의 공격 또는 이동 방법을 추가하거나 수정하려면? 예를 들어 새로운 로봇으로 지구의 용사 선가드를 만들어 태권V의 미사일 공격 기능을 추가하려면?
     *      B-1) 이때 어떠한 문제가 발생할까요?
     *
     *  C) 문제를 해결하기 위해선 무엇을 해야할까요?
     *
     */

    public static void main(String[] args) {
        TaekwonV taekwonV = new TaekwonV("TaekwonV");
        Atom atom = new Atom("Atom");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }

    /**
     * 스트래티지 패턴에 대한 정리
     *
     *  A) 스트래티지 패턴은 무슨 패턴인가요?
     *
     *  B) 종이를 꺼내 스트래피지 패턴의 클래스 다이어그램을 그려보세요. 그리고 구성요소에 대해 설명해보세요.
     *      답은 책 177 페이지.
     *
     *
     *
     */
}
