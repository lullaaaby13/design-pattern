package problem2.state.impl;

import problem2.Book;
import problem2.state.BookOperation;
import problem2.state.BookState;
import problem2.state.InvalidActionException;

public class BookOnReservation implements BookOperation {

    private static final BookState state = BookState.RENTAL;
    private static BookOperation bookOperation = new BookOnReservation();

    private BookOnReservation() {

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
        book.setBookOperation(BookOnKeeping.getInstance());
        System.out.println(String.format("책이 반납되었습니다. 예약자를 위해 잠시 보관합니다. [%s]", book.getTitle()));
    }

    @Override
    public void reserve(Book book) {
        throw new InvalidActionException(book.getTitle(), this.state, "reserve");
    }

    @Override
    public void cancel(Book book) {
        book.setBookOperation(BookOnRental.getInstance());
        System.out.println(String.format("책의 예약이 취소되었습니다. [%s]", book.getTitle()));
    }
}
