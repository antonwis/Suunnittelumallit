package Composite.Components;

public class MemoryStick implements Component {

    private float price = 50;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a Memory Stick.");
    }

    public String toString() {
        return "Memory Stick, " + price + " Money Units";
    }
}
