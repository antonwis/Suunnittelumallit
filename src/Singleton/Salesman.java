package Singleton;

public class Salesman {

    private String name;
    EstateManager estateManager;
    private int attempts = 0;

    public Salesman(String name) {
        this.name = name;
        this.estateManager = EstateManager.getInstance();
    }

    public void sell() {
        attempts++;
        System.out.println("Sales attempt #" +attempts + ":");
        if (estateManager.getGateStatus()) {
            System.out.println("Gate was open. Approaching house...");
            if(estateManager.getDoorStatus()) {
                System.out.println("Door was open. " +name+ " gives sales pitch.");
            } else {
                System.out.println("Door was closed. Aborting sales mission...");
            }
        } else {
            System.out.println("Cannot sell anything, gate was closed.");
        }
    }

    @Override
    public String toString() {
        return name + ", vendor of goods.";
    }
}
