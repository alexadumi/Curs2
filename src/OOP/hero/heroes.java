package OOP.hero;

public class heroes {
    protected  Integer energy;
    protected Integer life;

    public heroes(Integer energy, Integer life) {
        this.energy = energy;
        this.life = life;
    }
    abstract public void takeDamage();

    abstract public void atack ();

}
