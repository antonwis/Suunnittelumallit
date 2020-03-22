package Composite.Components;

import java.util.ArrayList;
import java.util.List;

public class CoronaCase implements Component {
    private float price = 20;
    List<Component> components = new ArrayList<>();

    public float getPrice() {
        float sumTotal = price;
        for(Component c : components) {
            sumTotal += c.getPrice();
        }
        return sumTotal;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public String toString() {
        StringBuilder componentList = new StringBuilder();
        for(Component component : components) {
            componentList.append(component.toString() + "\n\t");
        }
        return "Cheap Chinese PC Case, " + price + " Money Units. \n\t" + componentList.toString();
    }
}
