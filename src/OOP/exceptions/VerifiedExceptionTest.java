package OOP.exceptions;

public class VerifiedExceptionTest {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
            throwsException();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void throwsException () throws InterruptedException {
        throw new InterruptedException();


    }
}
