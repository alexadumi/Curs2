package OOP.heroes;

           public class Warrior extends Hero {

               public Warrior(Integer energy, Integer life) {
                   super(energy, life);
               }

               @Override
               public void dotakeDamage() {
                   life-=3;

               }

               @Override
               public void doattack() {
                   energy--;

               }
           }
