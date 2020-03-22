package Composite.Factories;

import Composite.Components.*;

public class CoronaFactory implements ComponentFactory {

    public CoronaCase createCase() { return new CoronaCase(); }
    public CoronaMotherBoard createMotherboard() { return new CoronaMotherBoard(); }
    public CoronaCPU createCPU() { return new CoronaCPU(); }
    public CoronaNIC createNIC() { return new CoronaNIC(); }
    public CoronaRAM createRAM() { return new CoronaRAM(); }
    public CoronaGPU createGPU() { return new CoronaGPU(); }

}
