package Decorator.Ingredients;

public class BBQSauce extends PizzaDecorator {
    public BBQSauce(Fill decoratedFilling) {
        super(decoratedFilling);
    }

    @Override
    public float getPrice() {
        return decoratedFilling.getPrice() + 0.85f;
    }

    @Override
    public String getDescription() {
        return decoratedFilling.getDescription() + ", BBQ sauce";
    }
}
