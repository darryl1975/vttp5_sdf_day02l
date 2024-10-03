package vehicle;

public class Truck extends Vehicle {
    
    private double cargoCapacity;

    public Truck(String model, String make, Integer year, double cargoCapacity) {
        super(model, make, year);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start() {
        System.out.println("Truck started...");
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        System.out.println("Truck stopped...");
    }

    @Override
    public void accelerate(Integer increment) {
        this.setSpeed(this.getSpeed() + increment + 2);
    }

    // @Override
    // public void brake(Integer decrement) {
    //     this.speed = this.speed - decrement;
    // }

    @Override
    public void honk() {
        System.out.println("Honk...honk...honk...");
    }
    
}
