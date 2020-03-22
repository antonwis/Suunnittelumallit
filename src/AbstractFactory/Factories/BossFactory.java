package AbstractFactory.Factories;

import AbstractFactory.Products.*;

public class BossFactory implements AbstractFactory {

    @Override
    public Jeans createJeans() {
        return new BossJeans();
    }

    @Override
    public Shirt createShirt() {
        return new BossShirt();
    }

    @Override
    public Hat createHat() {
        return new BossHat();
    }

    @Override
    public Shoes createShoes() {
        return new BossShoes();
    }

    @Override
    public String toString() {
        return createJeans().toString() + ", " +
                createShirt().toString() + ", " +
                createHat().toString() + ", " +
                createShoes().toString();
    }
}
