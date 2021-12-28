package kata6.regionalFactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanCarToy;

public class AmericanCarToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber);
    }
    
}
