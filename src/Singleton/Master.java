package Singleton;

public class Master {

    private String name;
    private EstateManager estateManager;

    public Master(String name) {
        this.name = name;
        estateManager = EstateManager.getInstance();
    }

    public void openDoors() {
        estateManager.openDoor();
        estateManager.openGate();
    }

    public void openDoor() {
        estateManager.openDoor();
    }

    public void openGate() {
        estateManager.openGate();
    }

    public void closeDoors() {
        estateManager.closeDoor();
        estateManager.closeGate();
    }

    public void closeDoor() {
        estateManager.closeDoor();
    }

    public void closeGate() {
        estateManager.closeGate();
    }

    @Override
    public String toString() {
        return name + ", Master of the Estate.";
    }
}
