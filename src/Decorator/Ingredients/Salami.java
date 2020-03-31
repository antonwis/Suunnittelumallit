package Decorator.Ingredients;

public class Salami extends PizzaDecorator {

    public Salami(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 2.75f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", salami";
    }

}
