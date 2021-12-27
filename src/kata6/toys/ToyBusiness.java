package kata6.toys;

import kata6.toyproduct.Toy;
import kata6.toyproduct.models.CarToy;
import kata6.toyproduct.models.HelicopterToy;

public class ToyBusiness {
    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    
    
    public Toy createToy(String type){
        switch (type){
            case "car":
                CarToy car = new CarToy(this.serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                HelicopterToy helicopter = new HelicopterToy(this.serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
    }
  
}
