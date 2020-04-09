package problem2.state.impl;

import problem2.Book;
import problem2.state.BookOperation;
import problem2.state.BookState;
import problem2.state.InvalidActionException;

public class BookOnKeeping implements BookOperation {

    private static final BookState state = BookState.RENTAL;
    private static BookOperation bookOperation = new BookOnKeeping();

    private BookOnKeeping() {

    }

    public static BookOperation getInstance() {
        return bookOperation;
    }

    @Override
    public void checkout(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "checkout");
    }

    @Override
    public void checkin(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "checkin");
    }

    @Override
    public void reserve(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "checkout");
    }

    @Override
    public void cancel(Book book) {
        book.setBookOperation(BookOnAvailable.getInstance());
        System.out.println(String.format("책의 예약이 취소되었습니다. [%s]", book.getTitle()));
    }
}
