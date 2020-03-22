package Composite.Components;

public class CoronaGPU implements Component {
    private float price = 235;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a GPU.");
    }

    public String toString() {
        return "Cheap Chinese GPU, " + price + " Money Units";
    }
}
