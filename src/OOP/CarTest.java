package OOP;

import java.sql.SQLOutput;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car(60, 8,false);


        Car Dacia = new Car(180, 600, false);


        System.out.println(bmw.fuel);
        System.out.println(bmw.range());

        bmw.wheels = 3;
        System.out.println(bmw.wheels);
        System.out.println(Dacia.wheels);


    }
}
