package Singleton;

public class EstateManager {

    private static EstateManager instance;

    private boolean doorOpen = false;
    private boolean gateOpen = false;

    public EstateManager () {}

    public static EstateManager getInstance() {
        if (instance == null) {
            instance = new EstateManager();
        }
        return instance;
    }

    private void setDoorOpen(boolean state) {
        this.doorOpen = state;
    }
    private void setGateOpen(boolean state) {
        this.gateOpen = state;
    }

    public boolean getDoorStatus() { return doorOpen; }
    public boolean getGateStatus() { return gateOpen; }

    public void openDoor() {
        if(doorOpen){
            System.out.println("Door is already open!");
        } else {
            setDoorOpen(true);
            System.out.println("Door was opened.");
        }
    }
    public void openGate() {
        if(gateOpen){
            System.out.println("Gate is already open!");
        } else {
            setGateOpen(true);
            System.out.println("Gate was opened.");
        }
    }

    public void closeDoor() {
        if (!doorOpen) {
            System.out.println("Door is already closed!");
        } else {
            setDoorOpen(false);
            System.out.println("Door was closed.");
        }
    }

    public void closeGate() {
        if(!gateOpen) {
            System.out.println("Gate is already closed!");
        } else {
            setGateOpen(false);
            System.out.println("Gate was closed.");
        }
    }

}
