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


    
}
