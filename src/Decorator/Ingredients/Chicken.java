package Decorator.Ingredients;

public class Chicken extends PizzaDecorator {

    public Chicken(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 2.25f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", chicken";
    }
}
