package FactoryMethod;

public class Karanteenipotilas extends AterioivaOtus {

    public Juoma createJuoma()
    {
        return new Kaakao();
    }
}
