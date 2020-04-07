package problem1.answer;

import problem1.answer.impl.Flying;
import problem1.answer.impl.MissileAttack;
import problem1.answer.impl.PunchAttack;
import problem1.answer.impl.Walk;

public class Client {
    /**
     *  다음 문제에 답하고 조건에 맞게 리팩토링하세요.
     *
     *  A) 기존 로봇의 공격 또는 이동 방법을 수정하려면 어떤 변경 작업을 해야 하는가? 예를 들어 아톰이 날 수는 없고 오직 걷게만 만들고 싶다면? 또는 태권V를 날게 하려면?
     *      A-1) SOLID의 어떤 원칙을 위배하는 설계인가요?
     *
     *  ANSWER A)
     *      문제점1) 현재 설계에서 공격 또는 이동 방법을 수정하려면 구현 클래스(TaekwonV, Atom)클래스의 move, attack 메서드를 수정해야 한다. 이는 확장을 위해
     *              기존의 코드를 수정하게 되므로 OCP에 위반된다.
     *      문제점2) 만약 Atom이 걷게 만들도록 수정하면 TaekwonV와 Atom모두 걷기 기능을 수행하는데 이는 중복이다. 중복은 많은 문제점을 야기한다.
     *
     *  B) 새로운 로봇을 만들어 기존의 공격 또는 이동 방법을 추가하거나 수정하려면? 예를 들어 새로운 로봇으로 지구의 용사 선가드를 만들어 태권V의 미사일 공격 기능을 추가하려면?
     *      B-1) 이때 어떠한 문제가 발생할까요?
     *
     *  ANSWER B)
     *      문제점 1) 새로운 로봇에서 기존 로봇을 공격 또는 이동 기능을 사용하면 메서드의 중복사용이 일어난다. 말했다시피 중복 코드는 나중에 심각한 문제점을 야기한다.
     *      문제점 2) 새로운 공격 또는 이동 기능이 추가되었을 경우 관련된 기존의 모든 코드를 수정해야만 한다.
     *
     *  C) 문제를 해결하기 위해선 무엇을 해야할까요?
     *      접근) 무엇이 변화되었는지 찾아야 한다. 변화된 것을 찾은 후 클래스로 캡슐화 해아한다.
     *          1) 로봇의 이동방식
     *          2) 로봇의 공격방식
     *      해결) 변화된 것을 찾아 인터페이스로 일반화한다. 그리하여 구체적인 클래스를 캡슐화 한다.
     *      구체적으로)
     *          1) AttackStrategy 인터페이스와 MovingStrategy 인터페이스를 만들고
     *              이를 구현하는 PunchStrategy, MissileStrategy, WalkingStrategy, FlyingStrategy를 구현한다.
     *      결과적으로) Robot클래스가 인터페이스에 의존하도록 설계를 변경해 새로운 기능의 추가에도 기존의 코드가 변경되지 않으므로 OCP를 만족하는 설계가 된다.
     *
     *
     */

    public static void main(String[] args) {
        Atom atom = new Atom("New Atom");
        atom.setAttackable(new MissileAttack());
        atom.setMovable(new Flying());
        System.out.println(String.format("My name is %s", atom.getName()));
        atom.attack();
        atom.move();

        TaekwonV taekwonV = new TaekwonV("New TaekwonV");
        taekwonV.setAttackable(new PunchAttack());
        taekwonV.setMovable(new Walk());
        System.out.println(String.format("My name is %s", taekwonV.getName()));
        taekwonV.attack();
        taekwonV.move();
    }

    /**
     * 스트래티지 패턴에 대한 정리
     *
     *  A) 스트래티지 패턴은 무슨 패턴인가요?
     *      설명1) 전략을 쉽게 바꿀 수 있게 해주는 패턴.
     *              여기서 전략이란, 어떤 목적을 달성하기 위해 일을 수행하는 방식, 비즈니스 규칙, 문제를 해결하는 알고리즘 등으로 이해할 수 있다.
     *      설명2) 문제를 해결하는 여러 알고리즘(방식)이 클래스별로 캡슐화 되어있고 이들이 필요할 때 교체할 수 있도록 함으로써 동일한 문제를 다른 알고리즘으로 해결할 수 있게 하는 디자인 패턴
     *
     *  B) 종이를 꺼내 스트래피지 패턴의 클래스 다이어그램을 그려보세요. 그리고 구성요소에 대해 설명해보세요.
     *      답은 책 177 페이지.
     *
     *
     *
     */
}
