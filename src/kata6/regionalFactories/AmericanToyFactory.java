package kata6.regionalFactories;

import kata6.factories.ToyFactory;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanCarToy;
import kata6.toyproduct.models.AmericanHelicopterToy;

public class AmericanToyFactory extends ToyFactory{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.serialNumberGenerator.next());
                return car;
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.serialNumberGenerator.next());
                return helicopter;
            default:
                return null;
        }
    }
    
}
