package Decorator.Ingredients;

public class Cheese extends PizzaDecorator {

    public Cheese(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 1.5f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", extra cheese";
    }
}
