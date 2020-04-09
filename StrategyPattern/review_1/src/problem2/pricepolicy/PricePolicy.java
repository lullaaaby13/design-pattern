package problem2.pricepolicy;

import problem2.Book;
import problem2.Member;

public interface PricePolicy {
    void validate(Member member, Book book);
    void getPrice();
}
