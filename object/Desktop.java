package object;

public class Desktop extends Computer {
    
    private String operatingSystem;

    private Integer weight;

    private Boolean wateringCooling;

    public Desktop() {
    }

    public Desktop(String cpu, String model, Integer ram, Integer yearMade) {
        super(cpu, model, ram, yearMade);
    }

    public Desktop(String cpu, String model, Integer ram, Integer yearMade, String operatingSystem, Integer weight,
            Boolean wateringCooling) {
        super(cpu, model, ram, yearMade);
        this.operatingSystem = operatingSystem;
        this.weight = weight;
        this.wateringCooling = wateringCooling;
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

    public Boolean getWateringCooling() {
        return wateringCooling;
    }

    public void setWateringCooling(Boolean wateringCooling) {
        this.wateringCooling = wateringCooling;
    }

    @Override
    public void displaySpec() {
        System.out.println("This desktop specifications:");
        System.out.println(this.getModel());
        System.out.println(this.getCpu());
        System.out.println(this.getRam());
        System.out.println(this.getYearMade());
        System.out.println(this.getOperatingSystem());
        System.out.println(this.getWeight());
        System.out.println("Water cooling System:" + this.getWateringCooling());
    }

}
