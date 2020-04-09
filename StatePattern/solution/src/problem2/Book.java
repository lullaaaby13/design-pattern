package problem2;

import problem2.state.BookOperation;
import problem2.state.impl.BookOnAvailable;

public class Book {

    private String title;
    BookOperation bookOperation;

    public Book(String title) {
        this.title = title;
        this.bookOperation = BookOnAvailable.getInstance();
    }

    public String getTitle() {
        return title;
    }

    public void setBookOperation(BookOperation bookOperation) {
        this.bookOperation = bookOperation;
    }

    public void checkout() {
        this.bookOperation.checkout(this);
    }

    public void checkin() {
        this.bookOperation.checkin(this);
    }

    public void reserve() {
        this.bookOperation.reserve(this);
    }

    public void cancel() {
        this.bookOperation.cancel(this);
    }


}
