package problem2;

import problem2.pricepolicy.PricePolicy;

import java.util.List;

public class Purchase {
    private Member member;
    private Book book;
    private Integer count;
    private PricePolicy pricePolicy;

    public Purchase(Member member, Book book, PricePolicy pricePolicy) {
        this.member = member;
        this.book = book;
        this.pricePolicy = pricePolicy;
    }
}
