package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus karanteenipotilas = new Karanteenipotilas();
        opettaja.aterioi();
        oppilas.aterioi();
        karanteenipotilas.aterioi();
    }
}
