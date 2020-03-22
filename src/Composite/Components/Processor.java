package Composite.Components;

public class Processor implements Component {

    private float price = 400;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a CPU.");
    }

    public String toString() {
        return "Central Processing Unit, " + price + " Money Units";
    }
}
