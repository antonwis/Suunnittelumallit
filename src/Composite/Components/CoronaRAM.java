package Composite.Components;

public class CoronaRAM implements Component {
    private float price = 20;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a Memory Stick.");
    }

    public String toString() {
        return "Cheap Chinese Memory, " + price + " Money Units";
    }
}
