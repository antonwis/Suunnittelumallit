package Composite.Components;

public class NetworkCard implements Component {

    private float price = 75;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a NIC.");
    }

    public String toString() {
        return "Network Interface Controller, " + price + " Money Units";
    }
}
