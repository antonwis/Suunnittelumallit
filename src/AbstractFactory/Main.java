package AbstractFactory;

import AbstractFactory.Factories.AbstractFactory;
import AbstractFactory.Factories.AdidasFactory;
import AbstractFactory.Factories.BossFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory adidasFactory = new AdidasFactory();
        AbstractFactory bossFactory = new BossFactory();
        System.out.println("Jasperin vaatteet opiskelijana:");
        System.out.println(adidasFactory.toString());
        System.out.println("Jasperin vaatteet insinöörinä:");
        System.out.println(bossFactory.toString());


    }
}
