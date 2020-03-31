package Decorator.Ingredients;

public class RedOnion extends PizzaDecorator {
    public RedOnion(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 1.25f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", red onions";
    }
}
