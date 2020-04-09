package problem2.state.impl;

import problem2.Book;
import problem2.state.BookOperation;
import problem2.state.BookState;
import problem2.state.InvalidActionException;

public class BookOnAvailable implements BookOperation {

    private static final BookState state = BookState.AVAILABLE;
    private static BookOperation bookOperation = new BookOnAvailable();

    private BookOnAvailable() {

    }

    public static BookOperation getInstance() {
        return bookOperation;
    }

    @Override
    public void checkout(Book book) {
        book.setBookOperation(BookOnRental.getInstance());
        System.out.println(String.format("책이 대여되었습니다. [%s]", book.getTitle()));
    }

    @Override
    public void checkin(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "checkin");
    }

    @Override
    public void reserve(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "reserve");
    }

    @Override
    public void cancel(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "cancel");
    }
}
