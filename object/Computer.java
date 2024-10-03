package object;

public class Computer {
    private String cpu;

    private String model;

    private Integer ram;

    private Integer yearMade;

    
    public Computer() {
        this.cpu = "2GHz dual core";
        this.model = "Gigabyte 1000";
        this.ram = 8;
        this.yearMade = 2020;
    }

    public Computer(String cpu, String model, Integer ram, Integer yearMade) {
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.yearMade = yearMade;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getYearMade() {
        return yearMade;
    }

    public void setYearMade(Integer yearMade) {
        this.yearMade = yearMade;
    }
    
    public void startup() {
        System.out.println("Computer powered up...");
    }

    public void shutdown() {
        System.out.println("Shutting down Computer...");
    }

    public void displaySpec() {
        System.out.println("This computer specifications:");
        System.out.println(this.model);
        System.out.println(this.cpu);
        System.out.println(this.ram);
        System.out.println(this.yearMade);
    }

}