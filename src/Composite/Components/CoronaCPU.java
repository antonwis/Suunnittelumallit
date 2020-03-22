package Composite.Components;

public class CoronaCPU implements Component {
    private float price = 200;

    public float getPrice() { return price; }

    public void addComponent(Component component) {
        throw new RuntimeException("Cannot add components to a CPU.");
    }

    public String toString()
    {
        return "Cheap Chinese CPU -- might explode, " + price + " Money Units";
    }
}
