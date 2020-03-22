package AbstractFactory.Factories;
import AbstractFactory.Products.*;

public class AdidasFactory implements AbstractFactory {

    @Override
    public Jeans createJeans() {
        return new AdidasJeans();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Hat createHat() {
        return new AdidasHat();
    }

    @Override
    public Shoes createShoes() {
        return new AdidasShoes();
    }

    @Override
    public String toString() {
        return createJeans().toString() + ", " +
        createShirt().toString() + ", " +
        createHat().toString() + ", " +
        createShoes().toString();
    }
}
