package problem2;

public class Client {

    public static void main(String[] args) {
        Book 수학의정석 = new Book("수학의정석");
        Book 개념원리 = new Book("개념원리");

        수학의정석.checkout();
        수학의정석.reserve();
        수학의정석.cancel();
        수학의정석.checkin();

        개념원리.checkout();
        개념원리.reserve();
        개념원리.checkin();
        개념원리.cancel();
    }
}
