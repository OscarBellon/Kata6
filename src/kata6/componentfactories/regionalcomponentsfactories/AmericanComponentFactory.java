package kata6.componentfactories.regionalcomponentsfactories;

import kata6.componentfactories.ComponentFactory;
import kata6.toyproduct.components.Engine;
import kata6.toyproduct.components.RotorBlade;
import kata6.toyproduct.components.Wheel;
import kata6.toyproduct.components.american.AmericanEngine;
import kata6.toyproduct.components.american.AmericanRotorBlade;
import kata6.toyproduct.components.american.AmericanWheel;

public class AmericanComponentFactory implements ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AmericanWheel();
    }

    @Override
    public Engine createEngine() {
        return new AmericanEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AmericanRotorBlade();
    }
    
}
