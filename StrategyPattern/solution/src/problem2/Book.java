package problem2;

public class Book {
    private String title;
    private Integer publishYear;
    private Integer price;

    public Book(String title, Integer publishYear, Integer price) {
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public Integer getPrice() {
        return price;
    }
}
