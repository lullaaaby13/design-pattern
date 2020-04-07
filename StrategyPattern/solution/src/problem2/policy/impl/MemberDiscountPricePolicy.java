package problem2.policy.impl;

import problem2.Book;
import problem2.Member;
import problem2.policy.PricePolicy;

public class MemberDiscountPricePolicy implements PricePolicy {

    @Override
    public void validatePolicy(Member member, Book book) {
        if (member.getAccPrice() <= 10000) {
            throw new RuntimeException("올바르지 않은 가격 정책 설정입니다.");
        }
    }

    @Override
    public int calcPrice(Book book, int n) {
        return book.getPrice() * n * 9 / 10;
    }
}
