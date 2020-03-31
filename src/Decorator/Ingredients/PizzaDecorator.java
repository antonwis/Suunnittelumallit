package Decorator.Ingredients;

public abstract class PizzaDecorator implements Fill {
    protected Fill decoratedFilling;

    public PizzaDecorator(Fill decoratedFilling) {
        super();
        this.decoratedFilling = decoratedFilling;
    }
}
