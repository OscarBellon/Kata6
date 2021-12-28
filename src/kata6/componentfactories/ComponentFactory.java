package kata6.componentfactories;

import kata6.toyproduct.components.Engine;
import kata6.toyproduct.components.RotorBlade;
import kata6.toyproduct.components.Wheel;

public interface ComponentFactory {
    Wheel createWheel();
    Engine createEngine();
    RotorBlade createRotorBlade();
}
