package OOP.hero;

public class Mage {
    public class Mage extends heroes {
        @Override
        public void takeDamage() {
            life--;
            energy++;


        }

        @Override
        public void attack() {
            energy -= 3;

        }

        public Mage(Integer energy, Integer life) {
            super(energy, life);


        }
    }


}
