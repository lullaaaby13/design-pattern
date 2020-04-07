package problem2;

public class Member {
    private String name;
    private Integer accPrice = 0;

    public Member(String name) {
        this.name = name;
    }

    public void addAccPrice(int price) {
        accPrice += price;
    }

    public Integer getAccPrice() {
        return accPrice;
    }
}
