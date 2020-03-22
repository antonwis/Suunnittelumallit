package Composite.Components;

public class GraphicsCard implements Component {
    private float price = 600;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a GPU.");
    }

    public String toString() {
        return "Graphics Processing Unit, " + price + " Money Units";
    }
}
