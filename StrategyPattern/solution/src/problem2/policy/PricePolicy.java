package problem2.policy;

import problem2.Book;
import problem2.Member;

public interface PricePolicy {
    void validatePolicy(Member member, Book book);
    int calcPrice(Book book, int n);
}
