package Decorator.Ingredients;

public class Ham extends PizzaDecorator {

    public Ham (Fill decoratedFilling) {
        super(decoratedFilling);

    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 2.5f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", ham";
    }
}
