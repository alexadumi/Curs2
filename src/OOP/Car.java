package OOP;

 public class Car {
    protected float fuel;
    protected float fuelConsumption;
    protected Boolean started;
    static int wheels = 4;

     public Car(float fuel, float fuelConsumption, Boolean started) {
         this.fuel = fuel;
         this.fuelConsumption = fuelConsumption;
         this.started = started;
     }

     public void start () {
        started = true;
    }

    public void drive (int distance) {
        fuel -= fuelConsumption * distance / 100;
        if (fuel < 0 ) {
            fuel = 0;
        }
    }

    public float range() {
        return fuel / fuelConsumption * 100;
    }

 }



