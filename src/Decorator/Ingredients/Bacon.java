package Decorator.Ingredients;

public class Bacon extends PizzaDecorator {
    public Bacon(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 1.90f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", bacon";
    }
}
