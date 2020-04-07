package problem2;

import problem2.policy.impl.BookDiscountPricePolicy;
import problem2.policy.impl.MemberDiscountPricePolicy;
import problem2.policy.impl.OrdinaryPricePolicy;

public class Client {
    public static void main(String[] args) {
        Member memberA = new Member("MemberA");
        Member memberB = new Member("MemberB");
        Book bookA = new Book("BookA", 2020, 10000);
        Book bookB = new Book("BookB", 2019, 9000);
        Book bookC = new Book("BookC", 2008, 8000);

        Rental rental1 = new Rental(memberA, bookA, new OrdinaryPricePolicy(), 10);
        Rental rental2 = new Rental(memberA, bookB, new MemberDiscountPricePolicy(), 5);
        Rental rental3 = new Rental(memberB, bookC, new BookDiscountPricePolicy(), 20);

        System.out.println("MemberA 누적 : " + memberA.getAccPrice());
        System.out.println("MemberB 누적 : " + memberB.getAccPrice());

        System.out.println("rental 1 : " + rental1.getPrice());
        System.out.println("rental 2 : " + rental2.getPrice());
        System.out.println("rental 3 : " + rental3.getPrice());
    }
}
