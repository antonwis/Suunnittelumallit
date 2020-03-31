package Decorator.Ingredients;

public class Base implements Fill {


    public Base() {
    }

    @Override
    public float getPrice() {
        return 1f;
    }

    @Override
    public String getDescription() {
        return "Pizza base with cheese and tomato sauce";
    }
}
