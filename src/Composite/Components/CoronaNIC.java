package Composite.Components;

public class CoronaNIC implements Component {
    private float price = 35;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a NIC.");
    }

    public String toString() {
        return "Chinese Government Approved NIC with pre-installed Great™ Firewall™, " + price + " Money Units";
    }
}
