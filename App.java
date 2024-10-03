

import object.Computer;

public class App {
    
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.setCpu("5GHz 8 core");
        computer.setModel("Asus 8000");
        computer.setRam(32);
        computer.setYearMade(2024);

        computer.startup();
        computer.displaySpec();
        computer.shutdown();

        Computer computer2 = new Computer();
        computer2.startup();
        computer2.displaySpec();
        computer2.shutdown();
    }
}
