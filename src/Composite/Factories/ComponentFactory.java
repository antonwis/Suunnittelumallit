package Composite.Factories;

import Composite.Components.Component;

public interface ComponentFactory {
    Component createCase();
    Component createMotherboard();
    Component createCPU();
    Component createNIC();
    Component createRAM();
    Component createGPU();
}
