package kata6.componentfactories.regionalcomponentsfactories;

import kata6.componentfactories.ComponentFactory;
import kata6.toyproduct.components.Engine;
import kata6.toyproduct.components.RotorBlade;
import kata6.toyproduct.components.Wheel;
import kata6.toyproduct.components.asian.AsianEngine;
import kata6.toyproduct.components.asian.AsianRotorBlade;
import kata6.toyproduct.components.asian.AsianWheel;

public class AsianComponentFactory implements ComponentFactory{

    @Override
    public Wheel createWheel() {
        return new AsianWheel();
    }

    @Override
    public Engine createEngine() {
        return new AsianEngine();
    }

    @Override
    public RotorBlade createRotorBlade() {
        return new AsianRotorBlade();
    }
    
}
