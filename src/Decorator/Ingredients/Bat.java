package Decorator.Ingredients;

public class Bat extends PizzaDecorator {
    public Bat(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 3.5f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", live bat";
    }
}
