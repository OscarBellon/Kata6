package kata6.branches;

import kata6.business.ToyBusiness;
import kata6.toyproduct.Toy;
import kata6.toyproduct.models.AsianCarToy;
import kata6.toyproduct.models.AsianHelicopterToy;

public class AsianToyBusiness extends ToyBusiness{

    @Override
    public Toy createToy(String type) {
        switch (type){
            case "car":
                AsianCarToy car = new AsianCarToy(this.serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AsianHelicopterToy helicopter = new AsianHelicopterToy(this.serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
    
}
