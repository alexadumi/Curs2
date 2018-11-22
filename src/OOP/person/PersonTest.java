package OOP.person;

import OOP.person.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person vito = new Person("Don Vito", 100);
        Person sony = new Person(  "Super Sonic",200);
        Child alex = new Child( "Alex",  50);

        System.out.println("Alex:" + alex);
        System.out.println(sony);



        alex.run();
        alex.sleep();
        alex.showEnergy();


        vito.run();
        vito.run();
        vito.run();
        vito.showEnergy();
        vito.sleep();
        vito.showEnergy();

        for (int i=0; i<5; i++){
            sony.run();
        }
        sony.showEnergy();


    }
}
