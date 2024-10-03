package object;

public class Laptop extends Computer {

    private String operatingSystem;

    private Integer weight;

    private String battery;

    private String screenSize;

    public Laptop() {
    }

    public Laptop(String cpu, String model, Integer ram, Integer yearMade) {
        super(cpu, model, ram, yearMade);
    }

    public Laptop(String cpu, String model, Integer ram, Integer yearMade, String operatingSystem, Integer weight,
            String battery, String screenSize) {
        super(cpu, model, ram, yearMade);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    
    @Override
    public void startup() {
        System.out.println("Laptop powered up...");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down Laptop...");
    }

    @Override
    public void displaySpec() {
        System.out.println("This laptop specifications:");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYearMade());
        System.out.println(this.getOperatingSystem());
        System.out.println(this.getBattery());
        System.out.println(this.getScreenSize());
        System.out.println(this.getWeight());
    }
    
}
