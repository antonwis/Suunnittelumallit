package Decorator.Ingredients;

public class BlueCheese extends PizzaDecorator {

    public BlueCheese(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 1.75f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", blue cheese";
    }
}
