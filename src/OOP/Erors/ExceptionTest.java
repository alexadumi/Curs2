package OOP.Erors;

import java.lang.reflect.Array;

public class ExceptionTest {
    public static void main(String[] args) {

        int y = 10;

        try {

            int x = 1 / 0;

        }catch ( ArithmeticException e) {
            System.out.println("Operatie imposibila");
           // e.printStackTrace();
        }
        System.out.println(y);
    }
}
