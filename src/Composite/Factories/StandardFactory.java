package Composite.Factories;

import Composite.Components.*;

public class StandardFactory implements ComponentFactory {

    public ComputerCase createCase() { return new ComputerCase(); }
    public Motherboard createMotherboard() { return new Motherboard(); }
    public Processor createCPU() { return new Processor(); }
    public NetworkCard createNIC() { return new NetworkCard(); }
    public MemoryStick createRAM() { return new MemoryStick(); }
    public GraphicsCard createGPU() { return new GraphicsCard(); }


}
