package vehicle;

public interface IVehicle {
    public void start();
    public void stop();
    public void accelerate(Integer increment);
    public void brake(Integer decrement);
    public void honk();
}
