package Composite;

import Composite.Components.Component;
import Composite.Factories.ComponentFactory;
import Composite.Factories.CoronaFactory;
import Composite.Factories.StandardFactory;

public class Main {

    public static void main(String[] args) {

        Component pcBuild;

        // Build a standard pc
        ComponentFactory factory = new StandardFactory();
        pcBuild = buildStandardPC(factory);

        System.out.println("Standard PC build:");
        System.out.println(pcBuild.toString());
        System.out.println("Total price: " + pcBuild.getPrice());

        // Swap to cheaper parts and build another pc
        factory = new CoronaFactory();
        pcBuild = buildStandardPC(factory);

        System.out.println("Cheap PC build:");
        System.out.println(pcBuild.toString());
        System.out.println("Total price: " + pcBuild.getPrice());
    }

    private static Component buildStandardPC(ComponentFactory factory) {
        Component pc = factory.createCase();
        Component mobo = factory.createMotherboard();
        Component gpu = factory.createGPU();
        Component cpu = factory.createCPU();
        Component nic = factory.createNIC();
        Component ram = factory.createRAM();
        mobo.addComponent(cpu);
        mobo.addComponent(ram);
        mobo.addComponent(ram);
        mobo.addComponent(gpu);
        mobo.addComponent(nic);
        pc.addComponent(mobo);
        return pc;
    }
}
