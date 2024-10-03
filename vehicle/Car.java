package vehicle;

public class Car extends Vehicle {
    public String carType;

    public Integer numberOfPassenger;

    public Car(String model, String make, Integer year, String carType, Integer numberOfPassenger) {
        super(model, make, year);
        this.carType = carType;
        this.numberOfPassenger = numberOfPassenger;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(Integer numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }
    
    @Override
    public void start() {
        System.out.println("Car started...");
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        System.out.println("Car stopped...");
    }

    @Override
    public void accelerate(Integer increment) {
        this.setSpeed(this.getSpeed() + increment + 10);
    }

    // @Override
    // public void brake(Integer decrement) {
    //     this.speed = this.speed - decrement;
    // }

    @Override
    public void honk() {
        System.out.println("Beep...beep...beep...");
    }
}
