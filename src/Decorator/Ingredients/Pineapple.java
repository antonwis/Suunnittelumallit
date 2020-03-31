package Decorator.Ingredients;

public class Pineapple extends PizzaDecorator {

    public Pineapple(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 1.25f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", pineapple";
    }
}
