package problem2.state.impl;

import problem2.Book;
import problem2.state.BookOperation;
import problem2.state.BookState;
import problem2.state.InvalidActionException;

public class BookOnRental implements BookOperation {

    private static final BookState state = BookState.RENTAL;
    private static BookOperation bookOperation = new BookOnRental();

    private BookOnRental() {

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
        book.setBookOperation(BookOnAvailable.getInstance());
        System.out.println(String.format("책이 반납 되었습니다. [%s]", book.getTitle()));
    }

    @Override
    public void reserve(Book book) {
        book.setBookOperation(BookOnReservation.getInstance());
        System.out.println(String.format("책이 예약 되었습니다. [%s]", book.getTitle()));
    }

    @Override
    public void cancel(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "cancel");
    }
}
