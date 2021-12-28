package kata6.regionalFactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AsianHelicopterToy(serialNumber);
    }
    
}
