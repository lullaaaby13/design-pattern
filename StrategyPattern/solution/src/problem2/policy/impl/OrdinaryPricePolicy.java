package problem2.policy.impl;

import problem2.Book;
import problem2.Member;
import problem2.policy.PricePolicy;

public class OrdinaryPricePolicy implements PricePolicy {

    @Override
    public void validatePolicy(Member member, Book book) {

    }

    @Override
    public int calcPrice(Book book, int n) {
        return book.getPrice() * n;
    }
}
