package AbstractFactory.Factories;
import AbstractFactory.Products.*;

public interface AbstractFactory {
    Jeans createJeans();
    Shirt createShirt();
    Hat createHat();
    Shoes createShoes();
}
