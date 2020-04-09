package problem2.state;

import problem2.Book;

public interface BookOperation {
    public void checkout(Book book);
    public void checkin(Book book);
    public void reserve(Book book);
    public void cancel(Book book);
}
