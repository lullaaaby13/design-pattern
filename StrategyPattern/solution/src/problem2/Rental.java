package problem2;

import problem2.policy.PricePolicy;

public class Rental {
    private Member member;
    private Book book;
    private PricePolicy pricePolicy;
    private Integer count;

    public Rental(Member member, Book book, PricePolicy pricePolicy, Integer count) {
        this.member = member;
        this.book = book;
        this.pricePolicy = pricePolicy;
        this.count = count;

        pricePolicy.validatePolicy(member, book);

        this.member.addAccPrice(pricePolicy.calcPrice(book, count));
    }

    public Integer getPrice() {
        return pricePolicy.calcPrice(this.book, count);
    }
}
