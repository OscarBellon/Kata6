package kata6.branches;

import kata6.business.ToyBusiness;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AmericanCarToy;
import kata6.toyproduct.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
    
}