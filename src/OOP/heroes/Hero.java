package OOP.heroes;

    abstract public class Hero {
        protected Integer energy;
        protected Integer life;
        protected Boolean isAlive;

        public Hero(Integer energy, Integer life) {
            this.energy = energy;
            this.life = life;
            this.isAlive = true;
        }

        public void takeDamage(){
         if(!isAlive)return;
        dotakeDamage();
        }


        abstract protected void dotakeDamage();

         public void attack(){
            if (!isAlive) return;
            doattack();

        }

        protected abstract void doattack();


        @Override
        public String toString() {
            return "Hero{" +
                    "energy=" + energy +
                    ", life=" + life +
                    '}';
        }
    }

