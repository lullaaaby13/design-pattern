package problem2.state;

public class InvalidActionException extends RuntimeException {

    public InvalidActionException(String bookName, BookState state, String action) {
        super(String.format("올바르지 않은 요청입니다.(bookName=%s, state=%s, action=%s)", bookName, state, action));
    }
}
