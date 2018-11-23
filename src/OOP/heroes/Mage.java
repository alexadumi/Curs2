package OOP.heroes;

         public class Mage extends Hero {

             public Mage(Integer energy, Integer life) {
                 super(energy, life);
             }

             @Override
             public void dotakeDamage() {
                 life--;
                 energy++;


             }

             @Override
             public void doattack() {
                 energy-=3;


             }
         }
