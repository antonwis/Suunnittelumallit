package Decorator.Ingredients;

public class Shrimp extends PizzaDecorator {

    public Shrimp(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 2.0f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", shrimp";
    }
}
